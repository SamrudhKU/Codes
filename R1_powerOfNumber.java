public class R1_powerOfNumber {

    public static int power(int base, int x){
        if(x==0){
            return 1;
        } 
        return base*power(base, x-1);
    }
    public static void main(String[] args) {
        // base = number to get power of 
        // x = number of times to get power of 
        int base = 5, x=3;
        
        System.out.println(power(base, x));

    }
}
