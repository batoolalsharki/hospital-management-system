package mainapp;

import java.util.ArrayList;

public class Utils {
    public static <T> void printList(ArrayList<T> list) {
        clearScreen();
        System.out.println("------ List Items ------");
        for (T item : list) {
            System.out.println(item.toString());
        }
        System.out.println("------------------------");
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
