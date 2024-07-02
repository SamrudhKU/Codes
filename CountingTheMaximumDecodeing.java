public class CountingTheMaximumDecodeing {

        public static int countDecodings(String digits) {
            if (digits == null || digits.isEmpty()) {
                return 0;
            }
    
            int n = digits.length();
            int[] dp = new int[n + 1];
            dp[0] = 1; // Base case: empty string has one decoding
    
            dp[1] = digits.charAt(0) != '0' ? 1 : 0;
    
            for (int i = 2; i <= n; i++) {
                int oneDigit = Integer.parseInt(digits.substring(i - 1, i));
                int twoDigits = Integer.parseInt(digits.substring(i - 2, i));
    
                if (oneDigit >= 1 && oneDigit <= 9) {
                    int j = dp[i - 1];
                    dp[i] += j;
                }
    
                if (twoDigits >= 10 && twoDigits <= 26) {
                    int k = dp[i - 2];
                    dp[i] += k;
                }
            }
    
            return dp[n];
        }
    
        public static void main(String[] args) {
            String sequence = "1211";
            int result = countDecodings(sequence);
            System.out.println("Total possible decodings of sequence " + sequence + " is: " + result);
        }
    }
    