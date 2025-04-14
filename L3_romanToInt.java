import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L3_romanToInt {

    public static int romanToInt(String str) {
        int num = 0;
        int ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            switch (str.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    break;
            }
            if (num*4<ans) {
                ans-=num;
            } else {
                ans+=num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(romanToInt("MCMXCIV"));
        // System.out.println(romanToInt("III"));

        // int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        // Map<Character, Integer> mp = new HashMap<>();
        // mp.put('I', 1);
        // mp.put('V', 5);
        // mp.put('X', 10);
        // mp.put('L', 50);
        // mp.put('C', 100);
        // mp.put('D', 500);
        // mp.put('M', 1000);

        // System.out.println("Enter the Roman Numbers");
        // // String str = s.next();
        // // String str = "MCMXCIV";
        // String str = "CIV";

        // str = str.toUpperCase();
        // int pi = 0;
        // int sum = 0;

        // if (str.charAt(0) == 'I') {
        // sum = mp.get('I');
        // } else if (str.charAt(0) == 'V') {
        // sum = mp.get('V');
        // } else if (str.charAt(0) == 'X') {
        // sum = mp.get('X');
        // } else if (str.charAt(0) == 'L') {
        // sum = mp.get('L');
        // } else if (str.charAt(0) == 'C') {
        // sum = mp.get('C');
        // } else if (str.charAt(0) == 'D') {
        // sum = mp.get('D');
        // } else if (str.charAt(0) == 'M') {
        // sum = mp.get('M');
        // } else {
        // System.out.println("Invalid");
        // }

        // for (int j = 1; j < str.length(); j++) {

        // pi = mp.get(str.charAt(j - 1));

        // if (str.charAt(j) == 'I') {

        // if (pi >= I && j < str.length()) {
        // sum += I;
        // } else {
        // sum -= I;
        // }

        // } else if (str.charAt(j) == 'V') {

        // if (pi >= V && j < str.length()) {
        // sum += V;
        // } else {
        // sum -= V;

        // }
        // } else if (str.charAt(j) == 'X') {

        // if (pi >= X && j < str.length()) {
        // sum += X;
        // } else {
        // sum -= X;
        // }
        // } else if (str.charAt(j) == 'L') {

        // if (pi >= L && j < str.length()) {
        // sum += L;
        // } else {
        // sum -= L;
        // }
        // } else if (str.charAt(j) == 'C') {

        // if (pi >= C && j < str.length()) {
        // sum += C;
        // } else {
        // sum -= C;
        // }
        // } else if (str.charAt(j) == 'D') {

        // if (pi >= D && j < str.length()) {
        // sum += D;
        // } else {
        // sum -= D;
        // }
        // } else if (str.charAt(j) == 'M') {

        // if (pi >= M && j < str.length()) {
        // sum += M;
        // } else {
        // sum -= M;
        // }
        // } else {
        // System.out.println("Invalid character");
        // break;
        // }
        // }
        // sum = +sum;
        // System.out.println(sum);

        s.close();
    }
}
