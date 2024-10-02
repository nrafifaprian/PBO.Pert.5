package PBO;
import java.util.Scanner;

public class DiskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total pembelian: Rp. ");
        double totalPembelian = input.nextDouble();

        double potongan;
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.2;
        }

        double jumlahDibayar = totalPembelian - potongan;
        
        System.out.println("\n==================================");
        System.out.println("Total pembelian: Rp. " + totalPembelian);
        System.out.println("Besarnya potongan: Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayar: Rp. " + jumlahDibayar);
        System.out.println("==================================");
    }
}