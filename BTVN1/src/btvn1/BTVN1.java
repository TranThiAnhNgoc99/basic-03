/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn1;

/**
 *
 * @author pc
 */
public class BTVN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("BAI 1: nhap 2 so thuc A, B dua ra tong, hieu, tich, luy thua, thuong cua 2 so do");
        double A = 2;
        double B = 5;
        double ketqua;
        System.out.println(" A = " + A);
        System.out.println(" B = " + B);
        ketqua = A + B;
        System.out.println(" tong = " + ketqua);
        ketqua = A - B;
        System.out.println(" hieu A - B = " + ketqua);
        ketqua = A * B;
        System.out.println(" tich = " + ketqua);
        ketqua = Math.pow(A, B);
        System.out.println(" luy thua = " + ketqua);
        if (B == 0) {
            System.out.println(" khong ton tai thuong vi b=0");
        } else {
            ketqua = A / B;
            System.out.println(" phep chia lay nguyen = " + ketqua);
            ketqua = A % B;
            System.out.println(" phep chia lay du = " + ketqua);
        }
        System.out.println("BAI 2: giai PT bac 2, dau vao la 3 so thuc a, b, c, dau ra la nghiem cua phuong trinh");
        float a = 1;
        float b = -5;
        float c = 6;
        float x;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
        System.out.println(" c = " + c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(" PT vo so nghiem.");
                } else {
                    System.out.println(" PT vo nghiem.");
                }
            } else {
                x = -c / b;
                System.out.println(" nghiem cua PT la: " + x);
            }
        } else {
            double d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println(" phuong trinh vo nghiem.");
            }
            if (d == 0) {
                x = -b / (a + a);
                System.out.println(" nghiem cua PT la: " + x);
            }
            System.out.println(" PT co 2 nghiem phan biet: ");
            x = (-b - (float) Math.sqrt(d)) / (a + a);
            System.out.println("  x1 = " + x);
            x = (-b + (float) Math.sqrt(d)) / (a + a);
            System.out.println("  x2 = " + x);
        }
    }
}
