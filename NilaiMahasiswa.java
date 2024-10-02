package PBO;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NPM Mahasiswa: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.1 * nilaiKehadiran) + (0.2 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);

        char grade;
        String keterangan;
        if (nilaiAkhir >= 76) {
            grade = 'A';
            keterangan = "ISTIMEWA";
        } else if (nilaiAkhir >= 66) {
            grade = 'B';
            keterangan = "BAIK";

        } else if (nilaiAkhir >= 56) {
            grade = 'C';
            keterangan = "CUKUP";
            
        } else if (nilaiAkhir >= 46) {
            grade = 'D';
            keterangan = "KURANG";
        } else {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        }
        System.out.println("====================================");
        System.out.println("DATA MAHASISWA");
        System.out.println("====================================");
        System.out.println("NPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
        System.out.println("====================================");
    }
}