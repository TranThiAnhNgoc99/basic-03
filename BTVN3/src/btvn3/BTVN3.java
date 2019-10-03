/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BTVN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BAI 1(de).");
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("nhap cac phan tu cua mang a: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" a[%d]=", i);
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("tong cac phan tu trong mang la: " + sum);
        System.out.println("BAI 2(de). Lay mang o bai 1.");
        int tongChan = 0;
        System.out.println("cac phan tu o vi tri chan trong mang: ");
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(a[i]);
            tongChan = tongChan + a[i];
        }
        System.out.println("cac phan tu o vi tri le trong mang: ");
        for (int i = 1; i < 10; i = i + 2) {
            System.out.println(a[i]);
        }
        boolean check = false, kiemTra = false;
        System.out.println("cac phan tu chia het cho 2");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("khong co phan tu nao chia het cho 2.");
        }
        System.out.println("cac phan tu chia 5 du 1 la: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 5 == 1) {
                System.out.println(a[i]);
                kiemTra = true;
            }
        }
        if (kiemTra = false) {
            System.out.println("k co phan tu chia 5 du 1.");
        }
        System.out.println("tong cac phan tu chan la: " + tongChan);

        System.out.println("BAI KHO.");
        System.out.println("nhap kich thuoc ma tran.");
        int n = sc.nextInt();
        int[][] A = new int[n][n];
        System.out.println("nhap cac phan tu trong ma tran: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("A[%d][%d]= ", i, j);
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("ma tran A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        int tongDCC = 0;
        for (int i = 0; i < n; i++) {
            tongDCC = tongDCC + A[i][i];
        }
        System.out.println("tong cac phan tu tren duong cheo chinh cua ma tran: " + tongDCC);

    }

}
