package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old!");

    }

    public static void main(String[] args) {
        String name = "Petr Arsentev!";
        int age = 33;

       // ArgMethod.hello();

        ArgMethod.hello(name, age);

        //ArgMethod.hello(age);

        //ArgMethod.hello(name, name, name);
    }
}

