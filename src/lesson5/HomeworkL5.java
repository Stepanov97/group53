package lesson5;

import java.util.Scanner;

public class HomeworkL5 {
    public static void main(String[] args) {
        boolean workOn = true;
        System.out.println("\nДобрый день, я калькулятор периметра фигур.");
        while (workOn) {
            System.out.println("\nВыберете фигуру, периметр которой хотите посчитать:");
            System.out.println("\n1. Треугольник.");
            System.out.println("2. Квадрат.");
            System.out.println("3. Круг.");
            System.out.println("4. Прямоугольник.");
            System.out.println("5. Трапеция.");
            System.out.println("6. Овал.");
            System.out.println("7. Произвольная фигура.");
            System.out.println("Для выхода из калькулятора введите 0.");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("\nДля расчета периметра треугольника необходимо ввести длины сторон");
                    CalcUtils.info();
                    System.out.println("Введите длину стороны А:");
                    double sideTriangleA = scanner.nextDouble();
                    System.out.println("Введите длину стороны B:");
                    double sideTriangleB = scanner.nextDouble();
                    System.out.println("Введите длину стороны C:");
                    double sideTriangleC = scanner.nextDouble();
                    System.out.print("\nПериметр треугольника равен: ");
                    System.out.println(CalcUtils.calculateTrianglePerimeter(sideTriangleA, sideTriangleB, sideTriangleC));
                    break;
                case 2:
                    System.out.println("\nДля расчета периметра квадрата необходимо ввести длину одной стороны");
                    CalcUtils.info();
                    System.out.println("Введите длину стороны квадрата:");
                    double squareSide = scanner.nextDouble();
                    System.out.print("\nПериметр квадрата равен: ");
                    System.out.println(CalcUtils.calculateSquarePerimeter(squareSide));
                    break;
                case 3:
                    System.out.println("\nДля расчета периметра круга необходимо ввести длину радиуса");
                    CalcUtils.info();
                    System.out.println("Введите радиус круга: ");
                    double radius = scanner.nextDouble();
                    System.out.print("\nПериметр круга равен: ");
                    System.out.printf("%.2f", CalcUtils.calculateCirclePerimeter(radius));
                    break;
                case 4:
                    System.out.println("\nДля расчета периметра прямоугольника необходимо ввести длины двух сторон");
                    CalcUtils.info();
                    System.out.println("Введите длину стороны А:");
                    double sideRectangleA = scanner.nextDouble();
                    System.out.println("Введите длину стороны B:");
                    double sideRectangleB = scanner.nextDouble();
                    System.out.print("\nПериметр прямоугольника равен: ");
                    System.out.println(CalcUtils.calculateRectanglePerimeter(sideRectangleA, sideRectangleB));
                    break;
                case 5:
                    System.out.println("\nДля расчета периметра трапеции необходимо ввести длины четырех сторон");
                    CalcUtils.info();
                    System.out.println("Введите длину стороны А:");
                    double sideTrapezoidA = scanner.nextDouble();
                    System.out.println("Введите длину стороны B:");
                    double sideTrapezoidB = scanner.nextDouble();
                    System.out.println("Введите длину стороны C:");
                    double sideTrapezoidC = scanner.nextDouble();
                    System.out.println("Введите длину стороны D:");
                    double sideTrapezoidD = scanner.nextDouble();
                    System.out.print("\nПериметр трапеции равен: ");
                    System.out.println(CalcUtils.calculateTrapezoidPerimeter(sideTrapezoidA, sideTrapezoidB,
                            sideTrapezoidC, sideTrapezoidD));
                    break;
                case 6:
                    System.out.println("\nДля расчета периметра овала необходимо ввести длины двух радиусов");
                    CalcUtils.info();
                    System.out.println("Введите длину радиуса малой полуоси: ");
                    double radiusSmall = scanner.nextDouble();
                    System.out.println("Введите длину радиуса большой полуоси: ");
                    double radiusBig = scanner.nextDouble();
                    System.out.print("\nПериметр овала равен: ");
                    System.out.printf("%.2f", CalcUtils.calculateOvalPerimeter(radiusSmall, radiusBig));
                    break;
                case 7:
                    System.out.println("\nДля расчета периметра произвольной фигуры необходимо ввести длины всех сторон");
                    CalcUtils.info();
                    System.out.println("Введите количество сторон произвольной фигуры: ");
                    int quantity = scanner.nextInt();
                    double[] randomSidesFigure = new double[quantity];
                    System.out.println("\nВведите длины всех сторон фигуры через пробел пример (2б,5 13 71 65,7 98)");
                    for (int index = 0; index < randomSidesFigure.length; index++) {
                        randomSidesFigure[index] = scanner.nextDouble();
                    }
                    System.out.print("\nПериметр произвольной фигуры равен: ");
                    System.out.println(CalcUtils.calculateRandomPerimeter(randomSidesFigure));
                    break;
                case 0:
                    System.out.println("\nРад был вам помочь. До скорых встреч!");
                    workOn = false;
                    break;
                default:
                    System.out.println("\nВВЕДЕНО НЕКОРРЕКТНОЕ ЗНАЧЕНИЕ !!!");
                    break;

            }

        }
    }
}