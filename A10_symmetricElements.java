public class A10_symmetricElements {

    public static void main(String[] args) {
        int arr[][] = new int[5][2];
        
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[2][0] = 5;
        arr[2][1] = 1;
        arr[3][0] = 4;
        arr[3][1] = 3;
        arr[4][0] = 1;
        arr[4][1] = 5;

        // 1 2 
        // 3 4
        // 5 1
        // 4 3
        // 1 5


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i][0] == arr[j][1] && arr[i][1] == arr[j][0]) {
                    System.out.println(arr[i][0]+":"+arr[i][1]);
                }
            }
        }
    }
}