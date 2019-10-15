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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);
    public static int h, m, s, giay, gio;

    public static void main(String[] args) {
        // TODO code application logic here
        input();
        tinhThoiGian();
        show();
    }

    private static void input() {
        System.out.print("nhap so giay: ");
        s = sc.nextInt();
        while (true) {
            if (s < 0 || s > 59) {
                System.out.print("giay vuot gioi han!!! Nhap lai: ");
                s = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("nhap so phut: ");
        m = sc.nextInt();
        while (true) {
            if (m < 0 || m > 59) {
                System.out.print("phut vuot gioi han!!! Nhap lai: ");
                m = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.print("nhap so gio: ");
        h = sc.nextInt();
        while (true) {
            if (h < 0 || h > 11) {
                System.out.print("gio vuot gioi han!!! Nhap lai: ");
                h = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("thoi gian ban dau la: " + h + "h" + m + "m" + s + "s AM");
        System.out.print("nhap vao so giay tang them: ");
        giay = sc.nextInt();
    }

    private static void tinhThoiGian() {
        int a = giay / 3600;
        int b = giay % 3600;
        int c = b / 60;
        int d = b % 60;
        gio = h + a + (m + c + (s + d) / 60) / 60;
        h = gio % 12;
        m = (m + c + (s + d) / 60) % 60;
        s = (s + d) % 60;

    }

    private static void show() {
        if ((gio / 12) % 2 == 0) {
            System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s AM");
        } else {
            System.out.println("thoi gian sau khi thay doi: " + h + "h" + m + "m" + s + "s PM");
        }
    }
}
