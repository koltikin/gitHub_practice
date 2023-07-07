package day4;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("ziya");
        studentList.add("abdullah");
        studentList.add("kerim");
        studentList.add("muhammed");
        studentList.add("seyfullah");

        System.out.println("studentList = " + studentList);
        int i = 1;

        for (String s : studentList) {
            System.out.println("(" + i + ") = " + s);
            i++;
        }
    }
}
