import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CompareObjects {
    public static void main(String[] args) {

        List st = new ArrayList<Student>();
        st.add(new Student(22, "Samrudh"));
        st.add(new Student(12, "Sarthak"));
        st.add(new Student(32, "Ramya"));
        st.add(new Student(21, "Emma"));

        // Comparable: By default the Integer class implements comparable interface
        // Collections.sort(st);
        // for (Object s : st) {
        //     System.out.println(s);
        // }
    

        // Step 2: Comparator Implementation for student object, It is a functional interface we can use lambda expression

        // Comparator com = new Comparator<Student>() {
        // public int compare(Student s1, Student s2) {
        // if (s1.age > s2.age) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        //using lambda expression
        Comparator<Student> com = ( s1, s2) -> s1.age>s2.age?1:-1;

        Collections.sort(st, com);

        for (Object s : st) {
        System.out.println(s);
        }




        // Step 1 Implementation

        // // Comparator is used to iterate using user defined logic
        // Comparator com = new Comparator<Integer>(){
        // public int compare(Integer o1, Integer o2){
        // if (o1%10 > o2%10) {
        // return 1;
        // } else {
        // return -1;
        // }
        // }
        // };

        // List list = new ArrayList();

        // list.add(41);
        // list.add(26);
        // list.add(13);
        // list.add(54);

        // Collections.sort(list, com);
        // System.out.println(list);

    }
}
