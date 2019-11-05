package SistemPegadaian;

import java.util.Scanner;

public class Gadai {

	static String nama;
	static String kategori;
	static String deskripsi;
	static int harga;
	
	public static void menuGadai(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan form dibawah ini :");
		System.out.println("Nama :");
		nama = input.next();
		System.out.println("Product Category :");
		kategori = input.next();
		System.out.println("Deskripsi / Keterangan Produk:");
		deskripsi = input.next();
		System.out.println("Harga :");
		harga = input.nextInt();
		
		System.out.println();
		System.out.println("              SURAT BUKTI GADAI");
		System.out.format("========================================================%n");
		System.out.println("Nama\t\t\t       : " + nama );
		System.out.println("Product Category\t       : " + kategori );
		System.out.println("Deskripsi / keterangan produk  : " + deskripsi);
		System.out.println("Harga  \t\t\t       : " + harga);
		 
	}
	public static void main(String[] args) {
		menuGadai();
	}

}
