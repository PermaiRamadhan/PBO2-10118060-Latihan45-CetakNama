/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118060.latihan.ke.pkg45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author 
 * Nama     : Permai Ramadhan
 * Kelas    : PBO2
 * NIM      : 10118060
 * Latihan ini berisi tentang bagaimana menampilkan nama yang berulang dan
 * akan dicetak dalam sebuah program java
 */
public class PBO210118060LatihanKe45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Aplikasi Pencetak Nama======");
        System.out.print("Masukkan nama anda : "); 
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama kamu berapa kali? : ");
        printer.setJmlCetak(scanner.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
