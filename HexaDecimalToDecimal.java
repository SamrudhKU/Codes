public class HexaDecimalToDecimal {
    public static void main(String[] args) {
        String input = "7cf";
        int output = 0;
        String str = "0123456789ABCDEF";
        int j= 0;
        input = input.toUpperCase();
        for (int i = input.length()-1; i>=0; i--) {
            // int snum = str.charAt(i);
            int num = str.indexOf(input.charAt(i));
            output += num*Math.pow(16, j); 
            j++;
        }
        System.out.println(output);
    }
}
