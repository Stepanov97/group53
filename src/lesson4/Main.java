package lesson4;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Многомерные массивы");
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };
        System.out.println(numbers[3][1]);
        numbers[3][2] = 10;
        System.out.println(numbers[3][2]);

        long[][] longNumbers = new long[10][10];
        for (int rowIndex = 0; rowIndex < longNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < longNumbers[rowIndex].length; colIndex++) {
                System.out.print(longNumbers[rowIndex][colIndex] + " ");
            }
            System.out.println();

        }
        for (int rowIndex = 0; rowIndex < longNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < longNumbers[rowIndex].length; colIndex++) {
                if (rowIndex == colIndex) {
                    System.out.print(longNumbers[rowIndex][colIndex] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();

        }


    }

}
