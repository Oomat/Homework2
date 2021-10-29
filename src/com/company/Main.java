package com.company;

public class Main {

    public static void main(String[] args) {
        contact(20, 34);
        contact(56,32);
        contact(37,8);
        contact(5,2);
        contact(6,90);

    }

    public static void contact(int temp , int age) {
        if (age > 20 && age <= 45 && temp > -20 && temp <= 30) {
            System.out.println("Можно идти гулять!");
        }else if (age <20 && temp > 0 && temp <= 28){
            System.out.println("Можно идти гулять!");
        }else if (age > 45 && temp > -10 && temp <= 25){
            System.out.println("Можно идти гулять!");
        }else System.out.println("Оставайтесь дома!");
    }
}
