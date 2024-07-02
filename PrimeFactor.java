import java.lang.Math;

public class PrimeFactor {

   public static int isprime(int n){

      for(int i = 2; i<=Math.sqrt(n); i++){
        if(n%i==0)
          return 0;
      }

      return 1;
   }

   public static void primeFactors(int n)
   {

       int x = n;
      for(int i = 2; i<= n/2; i++){
          if(isprime(i)==1){
             while(x%i==0){
                System.out.print(i + " ");
                x /= i;
             }
          }
       }

   }

   public static void main(String[] args)
   {
       int n = 90;
       primeFactors(n);
    //    System.out.println("Samrudh");
   }
}