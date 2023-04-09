package pl.javastart.task;

import java.util.Scanner;

public class Table {
    private final int maxNumberOfRows = 100;
    private final int maxNumberOfColumns = 100;

    public void tableGenerator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę wierszy");
        int numberOfRows = scanner.nextInt();
        System.out.println("Podaj liczbę kolumn");
        int numberOfColumns = scanner.nextInt();

        int[][] numbers = new int[numberOfRows][numberOfColumns];
        if (numberOfRows > maxNumberOfRows || numberOfColumns > maxNumberOfColumns) {
            System.out.println("goodbye");
        } else {
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    numbers[i][j] = i * j;
                }
            }
            printTable(numberOfRows, numberOfColumns, numbers);
        }
    }

    private static void printTable(int numberOfRows, int numberOfColumns, int[][] numbers) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.printf("%3d", numbers[i][j]);
                System.out.print(" |");
            }
            System.out.println();

            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("-----");
            }
            System.out.println();
        }
    }
}
