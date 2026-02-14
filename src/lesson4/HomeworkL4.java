package lesson4;

public class HomeworkL4 {
    public static void main(String[] args) {
        System.out.println("Задание:\n" +
                "1. Создать массив 6 на 6 сразу с числами (сразу с числами)\n" +
                "2. Перезаписать во все ячейки нули (0)\n" +
                "3. Вывести диагональ снизу вверх слева направо\n" +
                "4. Вывести в шахматном порядке");
        int[][] intNumbers = {
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1}
        };
        System.out.println();

        System.out.println("1. Сам массив: ");
        for (int rowIndex = 0; rowIndex < intNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < intNumbers[rowIndex].length; colIndex++) {
                System.out.print(intNumbers[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("2. Переписать во все ячейки нули: ");
        for (int rowIndex = 0; rowIndex < intNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < intNumbers[rowIndex].length; colIndex++) {
                intNumbers[rowIndex][colIndex] = 0;
                System.out.print(intNumbers[rowIndex][colIndex] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("3. Массив снизу вверх и слева направо(диагональ): ");
        int abscissa = intNumbers.length - 1;
        int ordinate = 0;
        for (int rowIndex = 0; rowIndex < intNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < intNumbers[rowIndex].length; colIndex++) {
                if (rowIndex == ordinate && colIndex == abscissa) {
                    System.out.print(intNumbers[rowIndex][colIndex] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            ordinate++;
            abscissa--;
            System.out.println();
        }
        System.out.println();


        System.out.println("4. Массив в виде шахмат: ");
        for (int rowIndex = 0; rowIndex < intNumbers.length; rowIndex++) {
            for (int colIndex = 0; colIndex < intNumbers[rowIndex].length; colIndex++) {
                if ((rowIndex + 2) % 2 == 0) {
                    System.out.print(intNumbers[rowIndex][colIndex] + " ");
                    colIndex++;
                } else {
                    System.out.print(" " + " ");
                }
                if ((rowIndex + 2) % 2 != 0) {
                    colIndex++;
                    System.out.print(intNumbers[rowIndex][colIndex] + " ");
                } else System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
