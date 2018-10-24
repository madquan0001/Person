package com.company;

public class StaffTest {
    public static void main(String[] args){
        Staff staff = new Staff("Quan", "Ha Noi", "Kinh Ky", 100);
        System.out.println(staff.toString());

        Staff staff1 = new Staff("Son", "Ha Noi", "Bach Khoa", 110);
        System.out.println(staff1.toString());
    }
}