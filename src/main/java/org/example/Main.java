package org.example;

public class Main{
    public static void main(String[] args) {
        int[] sequence = {5, 4, 1, 3, 0, 8, 2, 6, 9, 7};

        for (int i= 0; i < sequence.length - 1; i++) {
            for (int j = 0; j < sequence.length - i - 1; j++) {
                if (sequence[j] > sequence[j + 1]) {
                    int temporary = sequence[j];
                    sequence[j] = sequence[j + 1];
                    sequence[j + 1] = temporary;
                }
            }
        }
        System.out.println("Отсортированная последовательность:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}