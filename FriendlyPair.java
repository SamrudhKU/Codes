public class FriendlyPair {
    public static void main(String[] args) {
        int num1=6, num2=12;
        int sum1=getSum(num1);
        int sum2=getSum(num2);

        if (sum1 / num1 == sum2 / num2) 
            System.out.println("Friendly Pair");
        else 
            System.out.println("Not a friendly pair");      
    }
    static int getSum(int num){
        int sum = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num%i==0){
                if (i==1) 
                    sum+=i;
                else if (i==num/i) 
                    sum+=i;
                else
                    sum=sum+i+num/i;    
            }
        }
        return sum;
        
    }
}
