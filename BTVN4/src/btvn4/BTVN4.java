/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn4;

/**
 *
 * @author pc
 */
public class BTVN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []a={1,2,4,2,1};
        char[]b={'a','c','e','b','d'};
        int c=23;
        boolean KT=kiemTra(c);
        boolean Check= check(a);
        char[] sxep=sapXepMang(b);
        int kq= checkSXep(a);
        System.out.println(KT);
        System.out.println(Check);
        System.out.println(kq);
        for (int i = 0; i < b.length; i++) {
            System.out.println(sxep[i]);
        }
        
    }
    public static boolean check( int[]a){
        int length = a.length;
        for (int i = 0; i < length/2; i++) {
            if(a[i]!=a[length-1-i]){
                return false;
            }
        }
        return true;
    }
    public static boolean kiemTra(int a){
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static char[] sapXepMang(char[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                char tg= a[i];
                a[i]=a[j];
                a[j]=tg;
            }
            }
        }
     return a;     
    }
    public static int checkSXep(int[]a){
        if(a[0]<a[a.length-1]){
            for (int i = 0; i < a.length-1; i++) {
                if(a[i]>a[i+1]){
                    return 0;
                }
            }
            return 1;
        }
        if(a[0]>a[a.length-1]){
            for (int i = 0; i < a.length-1; i++) {
                if(a[i]<a[i+1]){
                    return  0;
                }
            }
            return -1;
        }
        return 0;
        
    }
}
