public class A18_jugglingAlgo {

    public static int hcf(int a, int b){
        if (b==0) {
            return a;
        } else {
            return hcf(b, a%b);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int noOfRotation = 3;
        int n = arr.length;
        for (int i = 0; i < hcf(noOfRotation, n); i++) {
            int l=i,m,temp = arr[i];
            while(true){
                m=l+noOfRotation;
                if (m>=arr.length) {
                    m = m-arr.length;
                }
                if (m == i) {
                    break;
                }
                arr[l] = arr[m];
                l=m;
            }
            arr[l] = temp;
        }

        // Hear swift will work 
        // start: 123456879
        // 1> 423756189
        // 2> 453786129
        // 3> 456789123

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
