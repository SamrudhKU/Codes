public class C_Cognizant2 {
    public static void main(String...Samrudh) {
        int input1 = 6;
        char input2[] = {'a','b','c','d','e','f'};   
        int input3 = 2;

        for (int i = 0; i < 6; i=i+2) {
            System.out.println(input2[i%6]);
            System.out.println(i%6);
        }

    }
}
