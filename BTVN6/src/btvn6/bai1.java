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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong: ");
        int n = sc.nextInt();
        long a = giaiThua(n);
        System.out.println("gia thua cua so vua nhap la: " + a);
        int count = count0(a);
        System.out.println("so chu so 0 lien tiep tinh tu hang don vi cua n! la: " + count);

    }

    public static int count0(long n) {
        int dem = 0;
        while (true) {
            if (n % 10 == 0) {
                dem++;
                n = n / 10;
            } else {
                break;
            }
        }
        return dem;
    }

    public static long giaiThua(int n) {
        long kq = 1;
        for (int i = 1; i < n + 1; i++) {
            kq = kq * i;
        }
        return kq;
    }

}
