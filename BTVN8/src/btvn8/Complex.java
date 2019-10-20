/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn8;

/**
 *
 * @author pc
 */
public class Complex {

    double real;
    double virtual;

    Complex() {
        real = 0;
        virtual = 0;
    }

    Complex(double thuc) {
        real = thuc;
        virtual = 0;
    }

    Complex(double thuc, double ao) {
        real = thuc;
        virtual = ao;
    }

    void hienThi() {
        if (virtual == 0) {
            System.out.println("so phuc = " + real);
        }
        if (virtual == 1) {
            System.out.println("so phuc = " + real + " + i");
        }
        if (virtual != 0 && virtual != 1) {
            if (virtual > 0) {
                System.out.println("so phuc = " + real + " + " + virtual + "i");
            } else {
                System.out.println("so phuc = " + real + " + (" + virtual + "i)");
            }
        }
    }

}
