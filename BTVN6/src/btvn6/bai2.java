/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn6;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong:");
        int n=sc.nextInt();
        int a=n;
        int tongCS=0;
        int donVi=0;
        while(true){
            if(a<1){
                break;
            }else{
                donVi=a%10;
                tongCS=tongCS +donVi;
                a=a/10;
            }
        }
        System.out.println("tong cac chu so cua so vua nhap la: "+ tongCS);
        if(n%tongCS==0){
            System.out.println("so vua nhap la so dac biet!");
        } else{
            System.out.println("so vua nhap khong la so dac biet!!!");
        }
    }
}
