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
public class BAI1 {

    public static void main(String[] args) {
        String s = "abcxyz)";
        boolean k = test(s);
        System.out.println(k);
    }

    public static boolean test(String s) {
        char[] KT = {'!', '@', '#', '%', '^', '&', '*', '(', ')'};
        int len = s.length();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < KT.length; j++) {
                if (s.charAt(i) == KT[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
