// Program to replace zero's with one 

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        int num = 65005605, k = 1, new_num = 0, rem=0;

        while(num>0){
            rem = num%10;
            if(rem==0){
                rem=1;
            }

            new_num+= rem*k;
            k*=10;
            num/=10;
        }
        System.out.println(new_num);


        // By converting it to string 
        // String str = Integer.toString(num);
        // String new_str = "";
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i)== '0') {
        //         new_str += '1';
        //     } else {
        //         new_str += str.charAt(i);
        //     }
        // }
        // System.out.println(new_str);
    }
}