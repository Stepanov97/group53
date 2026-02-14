package lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Есть ширина и есть длина стола. Сколько столов влезет в комнату.");
        double widthOfTable = 0.8;
        double lengthOfTable = 1.2;
        double widthOfRoom = 4.5;
        double lengthOfRoom = 3.8;

        double squareOfTable = widthOfTable * lengthOfTable;
        double squareOfRoom = widthOfRoom * lengthOfRoom;

        int quantityOfTables = (int) (squareOfRoom / squareOfTable);
        System.out.println("В комнату влезет " + quantityOfTables + " столов.");


        int number = 5;
        number += 1;
        System.out.println(number);
        number++;
        System.out.println(number);


        System.out.println("Задача 2: Определить тип треугольника.");

        int a = 7;
        int b = 9;
        int c = 8;

        if (a == b && a == c) System.out.println("треугольник равносторонний");
        else {
            if (a == c || b == c || a == b) {
                System.out.println("треугольник равнобедренный");
            } else System.out.println("треугольник обычный");
        }

        System.out.println("задача 3: Написать фразу 10 раз.");
        for (int index = 1; index <= 10; index++) {
            System.out.println(index + ". Hello world!");
        }

        System.out.println("Задача 4:");
        for (int index = 30; index < 300 ; index++) {
            if(index%3==0 && index%5==0){
                System.out.println(index);
            }

        }


        System.out.println("Задача 5:");
        double money = 10_000_000;
        for (int day = 1; day <= 15 ; day++) {
            money = money + (money/100 * 13);
        }
        System.out.printf ("%.2f", money);

    }
}