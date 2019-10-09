/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn5;

/**
 *
 * @author pc
 */
public class BAI3 {

    public static void main(String[] args) {
        String a = "12+456";

        int b = tinhToan(a);
        System.out.println(b);

    }

    public static int tinhToan(String a) {
        char[] b = a.toCharArray();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == '-') {
                return Integer.valueOf(a.substring(0, i)) - Integer.valueOf(a.substring(i + 1, a.length()));
            }
            if (b[i] == '+') {
                return Integer.valueOf(a.substring(0, i)) + Integer.valueOf(a.substring(i + 1, a.length()));
            }
        }
        return 0;
    }
}
