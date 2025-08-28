public class DuplicateElement {

    public static void removeDuplicate(int arr[]) {
        boolean[] s = new boolean[arr.length];
        for (int i = 0; i < s.length; i++) {
            if (s[i] == true) {
                continue;
            }
            for (int j = i; j < s.length; j++) {
                if (arr[i] == arr[j]) {
                    s[j] = true;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void removeDuplicate(String str) {
        boolean s[] = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (s[str.charAt(i)] == true) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    s[str.charAt(j)] = true;
                }
            }
            System.out.print(str.charAt(i));
        }
    }

    public static void findDuplicate(int arr[]) {
        boolean[] s = new boolean[arr.length];
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            if (s[i] == true) {
                continue;
            }
            for (int j = i; j < s.length; j++) {
                if (arr[i] == arr[j]) {
                    s[j] = true;
                    count++;
                }
            }
            System.out.print(count > 1 ? arr[i] + " " : " ");
        }
    }

    public static void findDuplicate(String str) {
        boolean[] s = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (s[str.charAt(i)] == true) {
                continue;
            }
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    s[str.charAt(j)] = true;
                    count++;
                }
            }
            System.out.print(count > 1 ? str.charAt(i) + " " : " ");
        }
    }

    public static void countOccurance(int arr[]) {
        boolean[] s = new boolean[arr.length];
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            if (s[i] == true) {
                continue;
            }
            for (int j = i; j < s.length; j++) {
                if (arr[i] == arr[j]) {
                    s[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : "+count);
        }
    }

    public static void countOccurance(String str) {
        boolean[] s = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (s[str.charAt(i)] == true) {
                continue;
            }
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    s[str.charAt(j)] = true;
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " : "+ count);
        }
    }
    public static void main(String[] args) {

        int arr[] = new int[] { 2, 1, 5, 5, 1, 7, 2, 3, 4 };
        String str = "Saamrruudh";

        System.out.print("Remove Duplicate: ");
        removeDuplicate(arr);
        System.out.println();

        System.out.print("Remove Duplicate: ");
        removeDuplicate(str);
        System.out.println();

        System.out.print("Find Duplicate: ");
        findDuplicate(arr);
        System.out.println();

        System.out.print("Find Duplicate: ");
        findDuplicate(str);
        System.out.println();

        System.out.println("Count Occurance: ");
        countOccurance(arr);
        System.out.println();
      
        System.out.println("Count Occurance: ");
        countOccurance(str);
        System.out.println();
    }
}
