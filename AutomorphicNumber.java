public class AutomorphicNumber {
    public static void main(String[] args) {
        int num =1000;
        // int temp =num;
        int sroot = num*num;
        // int count=0;
        // while(temp>0){
        //     temp/=10;
        //     count++;
        // }

        if(isAutomorphic(num, sroot)){
            System.out.println("Automorphic Number");
            }
             else {
            System.out.println("Not Automorphic Number");
        }


    }

    private static boolean isAutomorphic(int num,  int sroot) {

        while(num>0){
            if((num%10) != (sroot%10)){ 
                return false;
            }
            num/=10;
            sroot/=10;
        }

        return true;
        
    }
}
