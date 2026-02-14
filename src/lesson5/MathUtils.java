package lesson5;

public class MathUtils {

    public static double calcPerimeter(double a, double b, double c){
        return a+b+c;
    }

    /**
     * выводит Hello в консоль
     */
    public static void sayHello(){
        System.out.println("Hello");
    }

    public static void calculateRandomPerimeter (double... sides){
        double perimeter =0;
        for (int index = 0; index < sides.length; index++) {
            perimeter += sides[index];
        }
        System.out.println("Perimeter: " + perimeter);
    }

}
