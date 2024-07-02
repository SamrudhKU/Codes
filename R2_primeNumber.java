public class R2_primeNumber {
    public static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return num == 2 ? true : false;
        }
        if (num % i == 0) {
            return false;
        }
        if (num > i * i) {
            return true;
        }
        return isPrime(num, i++);
    }

    public static void main(String[] args) {
        int num = 7;
        int i = 2;
        if (isPrime(num, i)) {
            System.out.println(" Prime Number");
        } else {
            System.out.println("not Prime Number");
        }
    }
}
