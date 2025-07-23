package java8;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = scanner.next();
        System.out.println("Enter a age: ");
        int age = scanner.nextInt();
        System.out.println("name is " + name+" and age is "+age);
    }
}
