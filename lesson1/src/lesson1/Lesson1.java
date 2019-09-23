/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

/**
 *
 * @author pc
 */
public class Lesson1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* System.out.println("hello");
        System.out.println("hello");
        int songuyen = 7; //-2^32...2^23
        // datatype name = initilizeValue;
        boolean bl = true; //T F
        float f = 0.5f;   // 4 byte =
        char c = 'a';     //0-255 ASCII
        double d = 0.5;   // = 2 lan float =8 byte
        byte b = 4;
        char ch = 65;
        int codeA = 'A';
        System.out.println(ch);
        int A = 7;
        int B = 2;
        int ketqua = A / B;
        int phandu = A % B;
        System.out.println("A = " + A);
        System.out.println(B);
        System.out.println(ketqua);
        System.out.println(phandu);
         */
        /*int A = 9;
        int B = 5;
        int ketqua;
        System.out.println("phep cong ");
        ketqua = A + B;
        System.out.println(ketqua);

        System.out.println("phep tru ");
        ketqua = A - B;
        System.out.println(ketqua);

        System.out.println("phep nhan ");
        ketqua = A * B;
        System.out.println(ketqua);

        System.out.println("chia lay nguyen ");
        ketqua = A / B;
        System.out.println(ketqua);

        System.out.println("chia lay du ");
        ketqua = A % B;
        System.out.println(ketqua);

        boolean dieukien; //bool C++
        dieukien = true;
        System.out.println(dieukien);
        dieukien = false;
        System.out.println(dieukien);

        if (dieukien) {
            System.out.println("dk dung");
        } else {
            System.out.println("dk sai");
        }

        System.out.println("cac toan tu so sanh: < > <= >= == !=");

        if (A == B) {
            System.out.println("A bang B ");
        } else {
            System.out.println("A k bang B");
        }

        if (A % 2 == 1) {
            System.out.println("A la so le ");
        } else {
            System.out.println("A la so chan ");
        }
*/
        // AND &&
        // OR ||

        int a = 10;
        int b = 6;
        // ax + b = 0. Tim x?
        float x;
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo so nghiem ");
            } else {
                System.out.println("vo nghiem");
            }
        } else {
            x = (float) -b / a;
            // hoac x -b/((float)a)
            System.out.println("nghiem cua phuong trinh la: " + x);
        }
        
    }

}
