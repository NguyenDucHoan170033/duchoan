/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import common.Algorithm;
        
import view.Menu;

/**
 *
 * @author ADMIN
 */
public class SortProgramming extends Menu<Object> {
   public int[]arr;

    public SortProgramming() {
        String[] menuOptions = {
            "Bubble Sort",
            "Quick Sort"
        };
        super.title = "Sort Program";
        super.mChon = new ArrayList<>(Arrays.asList(menuOptions));
    }

    @Override
    public void excute(int n) {
        switch (n) {
            case 1:
                inputArray();
                Algorithm algorithm = new Algorithm();
                algorithm.bubbleSort(arr);
                System.out.println("mang sau khi sap xep bang bubble sort :");
                printArray(arr);
                break;
            case 2:
                inputArray();
                Algorithm algorithm2 = new Algorithm();
                algorithm2.quickSort(arr, 0, arr.length - 1);
                System.out.println("mang sau khi sap xep bang quick sort:");
                printArray(arr);
                break;
        }
    }

    public void inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu cua mang : ");
        int n = scanner.nextInt();
        arr = new int[n];
        System.out.println("nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}