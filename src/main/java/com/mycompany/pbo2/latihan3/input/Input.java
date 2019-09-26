/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan3.input;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Steven Danesswaralay
 * KELAS    : PBO2
 * NIM      : 10118078
 * Deskripsi Program : Input
 */
public class Input {
    public static void main(String[] args){
        System.out.println("Masukan nama anda: = ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+ nama);
    }
}
