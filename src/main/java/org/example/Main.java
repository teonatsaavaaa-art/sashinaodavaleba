package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String courseName = "ტესტირების ავტომატიზაცია";
        System.out.println(courseName.length());

        int length = courseName.length();

        if (length % 2 ==0) {

            System.out.println("Even");
        }
else {

    System.out.println("Odd");
    }
}
}