public class ConvertingNumberToRupees {
    private static int numberCount(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    private static void swap(String[] rupees, int j){
        for (int i = j; i > 0; i--) {
            rupees[i+1] = rupees[i];
            rupees[i] = rupees[i-1]; 
        }
    }
    public static void main(String args[]){
        String ones[] = {"","one", "two", "three", "four", "five", "six", "seveen", "eight", "nine"};
        String tens[] = {"","ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninghty"};
        String hundred = "Hundred";
        String thousand = "Thousand";
        int num = 1354;
        int Lcount = numberCount(num);
        String rupees[] = new String[Lcount];
        int count = 1 ;
        int j=0; 
        while(count<=Lcount){
            int i=0;
            int lastDigit = num%10;
            if(count==1) {
                rupees[i] = ones[lastDigit];
                rupees[i+1] = rupees[i];
                
            } else if(count==2){
                rupees[i] = tens[lastDigit];
                j++;
                swap(rupees, j);
            } else if (count == 3) {
                if (lastDigit!=0){
                    rupees[i] = ones[lastDigit] +" " +hundred;
                    j++;
                    swap(rupees, j);
                }
            } else {
                rupees[i] = ones[lastDigit]+" " + thousand;       
            } 
            count++;
            num/=10;
        }
        for(String str : rupees){
            System.out.print(str+" ");
        }
    }
}



// public class ConvertingNumberToRupees {
//     static void convert_to_words(char[] num)
//     {    
//         int len = num.length; 
//         // Base cases
//         if (len == 0) {
//             System.out.println("empty string");
//             return;
//         }
//         if (len > 4) {
//             System.out.println(
//                 "Length more than 4 is not supported");
//             return;
//         }
//         String[] single_digits = new String[] {
//             "zero", "one", "two",   "three", "four",
//             "five", "six", "seven", "eight", "nine"
//         }; 
//         String[] two_digits = new String[] {
//             "",          "ten",      "eleven",  "twelve",
//             "thirteen",  "fourteen", "fifteen", "sixteen",
//             "seventeen", "eighteen", "nineteen"
//         }; 
//         String[] tens_multiple = new String[] {
//             "",      "",      "twenty",  "thirty", "forty",
//             "fifty", "sixty", "seventy", "eighty", "ninety"
//         };
//         String[] tens_power = new String[] { "hundred", "thousand" };
//         System.out.print(String.valueOf(num) + ": ");
//         if (len == 1) {
//             System.out.println(single_digits[num[0] - '0']);
//             return;
//         }
//         int x = 0;
//         while (x < num.length) { if (len >= 3) {
//                 if (num[x] - '0' != 0) {
//                     System.out.print(single_digits[num[x] - '0'] + " ");
//                     System.out.print(tens_power[len - 3] + " ");    
//                 }
//                 --len;
//             }
//             else {        
//                 if (num[x] - '0' == 1) {
//                     int sum
//                         = num[x] - '0' + num[x + 1] - '0';
//                     System.out.println(two_digits[sum]);
//                     return;
//                 }
//                 else if (num[x] - '0' == 2
//                          && num[x + 1] - '0' == 0) {
//                     System.out.println("twenty");
//                     return;
//                 }
//                 else {
//                     int i = (num[x] - '0');
//                     if (i > 0)
//                         System.out.print(tens_multiple[i] + " ");
//                     else
//                         System.out.print("");
//                     ++x;
//                     if (num[x] - '0' != 0)
//                         System.out.println(single_digits[num[x] - '0']);
//                 }
//             }
//             ++x;
//         }
//     }
//     // Driver Code
//     public static void main(String[] args)
//     {
//         convert_to_words("1001".toCharArray());
//     }
// }






