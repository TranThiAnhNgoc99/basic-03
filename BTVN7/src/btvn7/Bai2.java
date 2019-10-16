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
    public static int n, up, down;

    public static void main(String[] args) {
        input();
        int[] a = new int[n];
        mangA(a);
        System.out.print("mang ban dau: ");
        show(a);
        movedown(a);
        moveup(a);
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
        System.out.print("chuyen xuong cuoi so thu ");
        down = sc.nextInt();
        while (true) {
            if (down < 0 || down > n - 1) {
                System.out.print("khong hop le! Nhap lai: ");
                down = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("chuyen len dau so thu ");
        up = sc.nextInt();
        while (true) {
            if (up < 0 || up > n - 1) {
                System.out.print("khong hop le! Nhap lai: ");
                up = sc.nextInt();
            } else {
                break;
            }
        }
    }

    private static void show(int[] a) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    private static void movedown(int[] a) {
        int temp = a[down - 1];
        for (int i = down - 1; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        a[n - 1] = temp;
    }

    private static void moveup(int[] a) {
        int temp = a[up - 1];
        for (int i = up - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
    }
}
