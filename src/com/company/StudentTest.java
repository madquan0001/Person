package com.company;

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student("Quyen", "ThanhHoa", "Java", 2018, 1.0);
        System.out.println(student.toString());

        Student student1 = new Student("Hoang", "Ha Nam", "Java", 2018, 2.5);
        System.out.println(student1.toString());
    }
}