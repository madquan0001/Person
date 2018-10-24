package com.company;

public class PersonTest {
    public static void main(String[] args){
        Person person = new Person("Quan", "Ha Noi");
        System.out.println(person.toString());

        Person person1 = new Person("Thanh", "Ha Noi");
        System.out.println(person1.toString());
    }
}