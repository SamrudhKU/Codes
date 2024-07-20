import java.util.Stack;

public class S14_balancedParentheis {

    // This method only matches the number of Brackets
    // public static boolean checkBalance(String str){
    //     int start = 0; 
    //     int startNum = 0;
    //     int endNUm = 0;
    //     for (int i = 0; i < str.length(); i++) {
    //         if (str.charAt(i) == '(') {
    //             start++;
    //             startNum++;
    //         } else if (str.charAt(i) == ')') {
    //             start--;
    //             endNUm++;     
    //         }
    //     }
    //     if (start==0 && startNum == endNUm) {
    //         return true;
    //     }
    //     return false;
    // }

    private static boolean checkBalance(String str){
        Stack stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char check;
            switch (str.charAt(i)) {
                case ')': check = (char) stack.pop();
                    if (check == '{' || check == '[') 
                        return false;
                    break;
                case '}': check = (char) stack.pop();
                    if (check == '(' || check == '[') 
                        return false;
                    break;
                case ']': check = (char) stack.pop();
                    if (check == '{' || check == '(') 
                        return false;
                    break;
            
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()(({}))";
        if(checkBalance(str)){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
