/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author code
 */
public class hitungcuti {
    
    public static void main(String[]args){
    String NamaKaryawan;
    double MasaKerja;
    int CutiDiAjukan;
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Nama Karyawan = ");
    NamaKaryawan = scan.nextLine();
    System.out.print("Masa Kerja = ");
    MasaKerja = scan.nextDouble();
    System.out.print("Cuti di Ajukan = ");
    CutiDiAjukan = scan.nextInt();
    
    if(MasaKerja < 1){
        int SisaCuti = 0;
        int TunjanganCuti = CutiDiAjukan*0;
        
        System.out.println("========================================");
        System.out.println("                Hasil                   ");
        System.out.println("========================================");
        System.out.println();    
        System.out.println("Nama Karyawan        : "+NamaKaryawan);
        System.out.println("Masa Kerja           : "+MasaKerja+ " Tahun");
        System.out.println("Jatah Cuti           : "+0+ " Hari");
        System.out.println("Cuti yang di Ajukan  : "+CutiDiAjukan);
        System.out.println("Sisa Cuti            : "+SisaCuti);
        System.out.println("Tunjangan Cuti       : "+TunjanganCuti);
        
    }
    else if(MasaKerja < 5){
        int SisaCuti = 10 - CutiDiAjukan;
        int TunjanganCuti = CutiDiAjukan*50000;
        
        System.out.println("========================================");
        System.out.println("                Hasil                   ");
        System.out.println("========================================");
        System.out.println();    
        System.out.println("Nama Karyawan        : "+NamaKaryawan);
        System.out.println("Masa Kerja           : "+MasaKerja+ " Tahun");
        System.out.println("Jatah Cuti           : "+10+ " Hari");
        System.out.println("Cuti yang di Ajukan  : "+CutiDiAjukan);
        System.out.println("Sisa Cuti            : "+SisaCuti);
        System.out.println("Tunjangan Cuti       : "+TunjanganCuti);
        
    }
     else if(MasaKerja < 10){
        int SisaCuti = 15 - CutiDiAjukan;
        int TunjanganCuti = CutiDiAjukan*100000;
        
        System.out.println("========================================");
        System.out.println("                Hasil                   ");
        System.out.println("========================================");
        System.out.println();    
        System.out.println("Nama Karyawan        : "+NamaKaryawan);
        System.out.println("Masa Kerja           : "+MasaKerja+ " Tahun");
        System.out.println("Jatah Cuti           : "+15+ " Hari");
        System.out.println("Cuti yang di Ajukan  : "+CutiDiAjukan);
        System.out.println("Sisa Cuti            : "+SisaCuti);
        System.out.println("Tunjangan Cuti       : "+TunjanganCuti);
        
    }
     else if(MasaKerja >= 10){
        int SisaCuti = 20 - CutiDiAjukan;
        int TunjanganCuti = CutiDiAjukan*150000;
        
        System.out.println("========================================");
        System.out.println("                Hasil                   ");
        System.out.println("========================================");
        System.out.println();    
        System.out.println("Nama Karyawan        : "+NamaKaryawan);
        System.out.println("Masa Kerja           : "+MasaKerja+ " Tahun");
        System.out.println("Jatah Cuti           : "+20+ " Hari");
        System.out.println("Cuti yang di Ajukan  : "+CutiDiAjukan);
        System.out.println("Sisa Cuti            : "+SisaCuti);
        System.out.println("Tunjangan Cuti       : "+TunjanganCuti);
        
    }

  }
    
}
