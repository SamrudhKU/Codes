public class R6_LCM {

    // public static int gcdOfNum(int n1, int n2){
    //      if(n1<=0)
    //         return n2;
    //     if(n2<=0)
    //         return n1;
    //     if(n1 == n2) {
    //         return n1;
    //     }
    //     return gcdOfNum(n2, n1%n2);
    // }

    // This is using the trinary operator and not valid if num1 == 0
    public static int  gcdOfNum(int n1, int n2){
        return n2==0?n1:gcdOfNum(n2, n1%n2);
    }

    public static int lcmOfNum(int n1, int n2) {
        if (n1 == n2) {
            return gcdOfNum(n1, n2);
        }

        return (n1*n2)/gcdOfNum(n1, n2);
    }
    public static void main(String[] args) {
        int num1 = 24, num2 = 36;
        System.out.println(lcmOfNum(num1, num2));
    }
}
