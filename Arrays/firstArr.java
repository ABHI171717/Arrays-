package Arrays;

import java.util.Scanner;

class ArraysDemo {
    ArraysDemo() {
    }

    public void printArr(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + arr.length + " integers: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(); // To move to the next line after printing the array
    }

    public void arrayDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        printArr(arr);
    }

    public static void main(String[] args) {
        ArraysDemo demo = new ArraysDemo();
        demo.arrayDemo();
    }
}
