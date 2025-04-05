public class C_Amiti1 {

    public static int[] replaceWithLeastGreaterPrime(int arr[]) {
        int n = arr.length;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            int minIndex = Integer.MAX_VALUE;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i] && isPrime(arr[j])) {
                    minIndex = Math.min(minIndex, arr[j]);
                }
            }
            result[i] = (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
        }
        return result;
    }

    private static boolean isPrime(int num) {
        if(num<2)
            return false;
        for (int i = 2; i*i<= num; i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28 };
        // [31, 71, -1, 31, 43, 43, -1, -1, -1, -1, -1, -1, -1, -1, -1]

        for (int i : replaceWithLeastGreaterPrime(arr)) {
            System.out.print(i+" ");
        }

    }

}
