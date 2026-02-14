package lesson5;

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Добрый день, я калькулятор периметра фигур.");
        System.out.println("Выберете фигуру, перимет которой хотите посчитать:");
        System.out.println("1. Треугольник.");
        System.out.println("2. Квадрат.");
        System.out.println("3. Круг.");
        System.out.println("4. Прямоугольник.");
        System.out.println("5. Трапеция.");
        System.out.println("6. Овал.");
        System.out.println("7. Произвольная фигура.");
        System.out.println("0. Для выхода из калькулятора.");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    }
}
