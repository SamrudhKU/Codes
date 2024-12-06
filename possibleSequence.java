public class possibleSequence{
    public static int decodeing(int digit[]){
        int sequence[] = new int[digit.length+1];
        sequence[0] = 1;
        sequence[1] = 1;
        int i;
        for ( i = 2; i < digit.length+1; i++) {

            // While checking the current digit it will add the previous sequence, if it has extra sequence it will be evaluated by the if condition and increment the squence by one.
            sequence[i] = sequence[i-1];

            // It will check if the digit is single(1) or if it's combination is less than 27, if it is true then it will increment the sequence by 1.
            if (digit[i-2] == 1 || (digit[i-2] <= 2 && digit[i-1] < 7)) {
                sequence[i] +=  1;
            }
        }
        return  sequence[i-1];
    }
     
    // Java program to count the possible sequence of a given digit sequence.
    public static void main(String...args) {       

        int digit[] = {1,2,3,4};
        System.out.println(decodeing(digit));
        
    }
}