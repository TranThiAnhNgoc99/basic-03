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
public class BAI4 {

    public static void main(String[] args) {
        int a[][] = {{-1, 2, 4}, {5, 6, 7}, {8, 3, 9}};
        boolean KQ = check(a);
        System.out.println(KQ);
    }

    public static boolean check(int[][] a) {

        int lap = 0;
        int b[] = new int[9];
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[k] = a[i][j];
                k++;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (b[i] < 1 || b[i] > 9) {
                return false;

            }

            for (int j = i + 1; j < 9; j++) {
                if (b[i] == b[j]) {
                    lap++;
                }
            }

        }

        if (lap == 0) {
            return true;
        } else {
            return false;
        }

    }

}
