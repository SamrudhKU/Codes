// This program will swift the numbers of array

public class SwiftNumbers {
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7,8};
    int swift = 2;
    int len = arr.length;
    int newArr[] = new int[len];
    int position = len-swift;
    int j = 0;
    for(int i = position; i<len;i++){
        newArr[j] = arr[i];
        j++;
    }
    for(int k=0;k<position;k++) {
        newArr[j] = arr[k];
        j++;
    }

    for (int i = 0; i < newArr.length; i++) {
        System.out.println(newArr[i]);
    }
}

}
