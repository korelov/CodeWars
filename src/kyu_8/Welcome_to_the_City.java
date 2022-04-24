package kyu_8;

// https://www.codewars.com/kata/5302d846be2a9189af0001e4/train/java

public class Welcome_to_the_City {
    public static String sayHello(String[] name, String city, String state) {
        String fullName = String.join(" ", name);
        return String.format("Hello, %s! Welcome to %s, %s!", fullName, city, state);
    }


    public static void main(String[] args) {
        String[] name = {"John", "Smith"};
        System.out.println(sayHello(name, "Phoenix", "Arizona"));
    }
}
