package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70};

        for (int i=0; i < array.length; i++) {
            if (i == 4) {
                continue;

            }
            System.out.println(array[i]);
    }

}
}