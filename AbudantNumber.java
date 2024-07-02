public class AbudantNumber {
    public static void main(String[] args) {
        int num = 12;
        int sum = getSum(num);
        if (sum>num) {
            System.out.println("Abudant Number");
            } else {
            System.out.println("Not Abudant Number");
        }
    }

    static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i==0){
                if(i==1)
                    sum+=i;
                else if(i==num/i)
                    sum+=i;
                else 
                    sum = sum + i + num/i;
            }
        }
        return sum;
    }
}
