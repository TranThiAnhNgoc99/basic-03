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
public class Point {

    float hoanh;
    float tung;
    float cao;

    Point() {
        hoanh = 0;
        tung = 0;
        cao = 0;
    }

    Point(float x, float y, float z) {
        hoanh = x;
        tung = y;
        cao = z;
    }

    void hienThiTD() {
        System.out.println("toa do: (" + hoanh + ", " + tung + ", " + cao + ")");
    }
}
