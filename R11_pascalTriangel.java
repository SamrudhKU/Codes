public class R11_pascalTriangel {
    public static int[] pTriangle(int i, int[] arr){
        if (i==arr.length) {
            return arr;
        }
        arr[i] = sum(arr[i-1]);
        return pTriangle(i+1, arr);
        
    }

    public static int sum(int value){
        int sum=1;
        int j = 10;
        while (value>1) {
            int k = value%10;
            value/= 10;
            int l = value%10;
            sum += (k+l)*j;
           
            j*=10;
        }
        sum+=1*j;
        return sum;
    }
    public static void main(String[] args) {
        // pTriangle(n,0, arr);
        
        int n = 5;
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 11;

        pTriangle(2, arr);

        // Normal Method
        // for (int i = 2; i < arr.length; i++) {
        //     arr[i] = sum(arr[i-1]);
        // }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
