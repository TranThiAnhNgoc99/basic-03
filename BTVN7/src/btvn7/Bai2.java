/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn7;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Bai2 {

    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        input();
        int[] a = new int[n];
        mangA(a);
        System.out.print("mang ban dau: ");
        show(a);
        move4(a);
        move2(a);
        System.out.print("mang sau khi chuyen vi tri: ");
        show(a);
    }

    private static void input() {
        System.out.print("nhap vao so ptu cua mang: ");
        n = sc.nextInt();
        while (true) {
            if (n <= 5) {
                System.out.print("so ptu chua thoa man!!! Nhap lai: ");
                n = sc.nextInt();
            } else {
                break;
            }
        }
    }

    private static void mangA(int[] a) {
        System.out.println("nhap vao cac phan tu");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    private static void show(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static void move4(int[] a) {
        int temp = a[3];
        for (int i = 3; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = temp;
    }

    private static void move2(int[] a) {
        int temp = a[1];
        a[1] = a[0];
        a[0] = temp;
    }
}
