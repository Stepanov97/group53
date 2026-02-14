package lesson5;

public class CalcUtils {
    /**
     * pi - число Пи (математическая константа, равная отношению длины окружности к её радиусу. Для расчетов используется
     * приближённое значение, тк число Пи - иррациональное и не имеет конечного представления.
     */
    private static double pi = 3.14;

    /**
     * Напоминание о корректном вводе нецелых чисел.
     */
    public static void info() {
        System.out.println("Напоминание: Если вводимое вами число не яляется целым, " +
                "в качестве разделителя используйте запятую (,) ");
    }

    /**
     * Метод для расчета периметра треугольника.
     *
     * @param a - длина стороны А.
     * @param b - длина стороны B.
     * @param c - длина стороны C.
     * @return - периметр треугольника.
     */
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        double trianglePerimeter = a + b + c;
        return trianglePerimeter;
    }

    /**
     * Метод для расчета периметра квадрата.
     *
     * @param a - длина стороны квадрата.
     * @return - периметр квадрата.
     */
    public static double calculateSquarePerimeter(double a) {
        double squarePerimeter = 4 * a;
        return squarePerimeter;
    }

    /**
     * Метод для расчета периметра круга.
     *
     * @param a - радиус круга.
     * @return - периметр круга.
     */
    public static double calculateCirclePerimeter(double a) {
        double circlePerimeter = 2 * pi * a;
        return circlePerimeter;
    }

    /**
     * Метод для расчета периметра прямоугольника.
     *
     * @param a - длина стороны А.
     * @param b - длина стороны B.
     * @return - периметр прямоугольника.
     */
    public static double calculateRectanglePerimeter(double a, double b) {
        double rectanglePerimeter = 2 * (a + b);
        return rectanglePerimeter;
    }

    /**
     * Метод для расчета периметра трапеции.
     *
     * @param a - длина стороны A.
     * @param b - длина стороны B.
     * @param c - длина стороны C.
     * @param d - длина стороны D.
     * @return - периметр трапеции.
     */
    public static double calculateTrapezoidPerimeter(double a, double b, double c, double d) {
        double trapezoidPerimeter = a + b + c + d;
        return trapezoidPerimeter;
    }

    /**
     * Метод для расчета периметра овала.
     *
     * @param a - радиус полуоси A.
     * @param b - радиус полуоси B.
     * @return - периметр овала.
     */
    public static double calculateOvalPerimeter(double a, double b) {
        double ovalPerimeter = (2 * a + 2 * b) / 2 * pi;
        return ovalPerimeter;
    }

    /**
     * Метод для расчета периметра произвольной фигуры.
     *
     * @param a - массив значений длин сторон произвольной фигуры (каждый элемент - значение длины одной стороны).
     * @return - периметр произвольной фигуры.
     */
    public static double calculateRandomPerimeter(double[] a) {
        double randomPerimeter = 0;
        for (int i = 0; i < a.length; i++) {
            randomPerimeter += a[i];
        }
        return randomPerimeter;
    }


}
