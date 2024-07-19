public class A13_orderSorting {

    public static int swap(int rep, int newPos){
        int temp = newPos;
        newPos = rep;
        rep = temp;
        return rep;
    }
    public static void main(String args[]){
        int arr1[] = {1, 2, 3,5,1,6,7,9,8, 4, 3, 2, 4, 2, 5};
        int arr2[] = {4, 2, 1, 3};
        boolean[] visited = new boolean[arr1.length];
        int k = 0;

        int temp[] = new int[arr1.length];
        for(int i = 0; i<arr1.length;i++){
            for (int j = i; j < arr1.length; j++) {
                if (arr1[i]>=arr1[j]) {
                    int temp1 =arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp1;                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j] && visited[j] == false) {
                    temp[k] = arr1[j];
                    arr1[j] = -1;
                    k++;
                    visited[j] = true;
                } 
            }
        }

        for (int i = k; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }
        for (int i : temp){
            System.out.print(i+ " ");
        }
    }
}
