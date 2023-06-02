package ru.netology;

public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator();
        //демонстрация
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.pow(2, 8));
        System.out.println(calc.mult(5, 7));
        System.out.println(calc.sub(10, 9));
        System.out.println(calc.div(10, 3));


    }
}