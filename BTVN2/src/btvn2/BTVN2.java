/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BTVN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("BAI 1(de).");
        int k;
        System.out.println("nhap vao 1 so tu nhien k: ");
        k = sc.nextInt();
        if (k < 0) {
            System.out.println("error.");
        }
        if (k <= 2) {
            System.out.println("khong co so nguyen to nao nho hon k.");
        }
        System.out.println("cac so nguyen to nho hon k la: ");
        for (int soNguyenTo = 2; soNguyenTo < k; soNguyenTo++) {
            if (check(soNguyenTo)) {
                System.out.println(soNguyenTo);
            }
        }
        
        
        
        System.out.println("BAI 2(de).");
        int a, b;
        System.out.println("nhap vao 2 so nguyen duong co 3 chu so: ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a * (b % 10);
        int d = a * ((b / 10) % 10);
        int e = a * (b / 100);
        System.out.println("mo phong phep nhan tay");
        System.out.println("   " + a);
        System.out.println(" x " + b);
        System.out.println("----------");
        System.out.println("   " + c);
        System.out.println("  " + d);
        System.out.println(" " + e);
        System.out.println("----------");
        System.out.println(" " + (a * b));
        
        
        
        System.out.println("BAI 1(kho)");
        System.out.println("nhap vo 5 so tu nhien.");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        doiCho(arr);
        System.out.println("day so duoc sap xep tang dan: ");
        show(arr);
        
        
        
        System.out.println("BAI 2(kho)");
        System.out.println("kho qua em chua lam duoc....");
        

    }

    public static boolean check(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void doiCho(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
