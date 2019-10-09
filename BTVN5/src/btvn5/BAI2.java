/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn5;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class BAI2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //////////bai 2
        Scanner sc = new Scanner(System.in);
        int soTien;
        soTien = sc.nextInt();
        String sotien = Tien(soTien) + "vnd";
        System.out.println(sotien);
    }

    public static String Tien(int a) {

        String sotien = String.valueOf(a % 1000);

        while (a > 1000) {
            a = a / 1000;
            int b = a % 1000;
            sotien = String.valueOf(b) + "," + sotien;

        }
        return sotien;
    }
}
