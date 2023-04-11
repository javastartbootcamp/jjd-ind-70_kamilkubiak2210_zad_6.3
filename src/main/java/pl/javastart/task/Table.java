package pl.javastart.task;

import java.util.Scanner;

public class Table {
    private static final int MAX_NUMBER_OF_ROWS = 100;
    private static final int MAX_NUMBER_OF_COLUMNS = 100;

    public void tableGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy");
        int numberOfRows = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int numberOfColumns = scanner.nextInt();

        int[][] numbers = new int[numberOfRows][numberOfColumns];
        if (numberOfRows > MAX_NUMBER_OF_ROWS || numberOfColumns > MAX_NUMBER_OF_COLUMNS) {
            System.out.println("goodbye");
        } else {
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    numbers[i][j] = i * j;
                }
            }
            printTable(numbers);
        }
    }

    private static void printTable(int[][] numbers) {
        int count = 4;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.printf("%" + count + "d", numbers[i][j]);
                System.out.print(" |");
            }
            System.out.println();

            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print("------");
            }
            System.out.println();
        }
    }
}
