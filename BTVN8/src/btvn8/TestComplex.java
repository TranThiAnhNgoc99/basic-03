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
public class TestComplex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Complex a = new Complex();
        Complex b = new Complex(3);
        Complex c = new Complex(2, -1);
        a.hienThi();
        b.hienThi();
        c.hienThi();
        Complex tong = Cong(b, c);
        tong.hienThi();
        Complex hieu = Tru(b, c);
        hieu.hienThi();
        Complex tich = Nhan(b, c);
        tich.hienThi();
        Complex thuong = Chia(b, c);
        thuong.hienThi();
    }

    static Complex Cong(Complex x, Complex y) {
        Complex kq = new Complex();
        kq.real = x.real + y.real;
        kq.virtual = x.virtual + y.virtual;
        return kq;
    }

    static Complex Tru(Complex x, Complex y) {
        Complex kq = new Complex();
        kq.real = x.real - y.real;
        kq.virtual = x.virtual - y.virtual;
        return kq;
    }

    static Complex Nhan(Complex x, Complex y) {
        Complex kq = new Complex();
        kq.real = x.real * y.real - x.virtual * y.virtual;
        kq.virtual = x.real * y.virtual + x.virtual * y.real;
        return kq;
    }

    static Complex Chia(Complex x, Complex y) {
        Complex kq = new Complex();
        double z = Math.pow(y.real, 2) + Math.pow(y.virtual, 2);
        kq.real = (x.real * y.real - x.virtual * y.virtual) / z;
        kq.virtual = (x.real * y.virtual - x.virtual * y.real) / z;
        return kq;
    }
}
