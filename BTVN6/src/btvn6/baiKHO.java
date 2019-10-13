/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class baiKHO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao so so tu nhien: ");
        int n = sc.nextInt();
        System.out.print("nhap vao do dai n thang: ");
        int len = sc.nextInt();
        int[] a = new int[n];
        System.out.println("nhap vao n so tu nhien:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = 0;
        int dem = 1;

        while (true) {
            int b = a[k] + len;
            System.out.println("diem ket thuc: " + b);
            for (int i = 0; i < n; i++) {
                if (b < a[i]) {
                    dem++;
                    k = i;
                    System.out.println("index: " + k);
                    break;
                }
            }
            if (b > a[n - 1]) {
                break;
            }

        }
        System.out.println("so doan thang: " + dem);
    }

}
