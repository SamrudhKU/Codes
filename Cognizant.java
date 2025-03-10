public class Cognizant {
    public static int calculateRemainingWater(int N, int K, int M, int[] A, int[] B) {
        if (N <= 0 || K <= 0 || M < 0 || A.length != N || B.length != N) {
            return 0;
        }

        int totalWaterRequired = 0;
        for (int i = 0; i < N; i++) {
            totalWaterRequired += (A[i] * B[i]) + M;
        }

        return (totalWaterRequired > K) ? 0 : (K - totalWaterRequired);
    }

    public static void main(String[] args) {
        int N = 3;
        int K = 150;
        int M = 5;
        int[] A = { 2, 3, 1 };
        int[] B = { 10, 20, 15 };

        int remainingWater = calculateRemainingWater(N, K, M, A, B);
        System.out.println(remainingWater);
    }

}
