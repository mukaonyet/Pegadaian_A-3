package SistemPegadaian;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

	static int id = 0;
	static String nama;
	static String kategori;
	static String deskripsi;
	static int harga;
	static ArrayList<Inventory> gadai = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilihan = 0;
		Scanner input = new Scanner(System.in);
		
		do {	
			try {
				System.out.format(" ==============================================================================%n");
				System.out.println(" ||===============*\t P E G A D A I A N   S Y S T E M \t*============||");
				System.out.println(" ||==================*\t\t   KELOMPOK 3\t\t*====================||");
				System.out.format("===============================================================================%n");
				System.out.println("1. Gadai");
				System.out.println("2. Tebus");
				System.out.println("3. Tampilkan Inventory");
				System.out.println("4. Exit");
				
				System.out.print("\nMasukan pilihan menu : ");
				pilihan = input.nextInt();
				System.out.println("*******************************************************************************");
				if (pilihan == 1) {
					menuGadai();
				}else if (pilihan == 2) {
					Inventory.printHeader();
			        for (Inventory gadai1 : gadai) gadai1.printRow();
			        Inventory.printLine();
					new Tebus(gadai);
					Inventory.printHeader();
			        for (Inventory gadai1 : gadai) gadai1.printRow();
			        Inventory.printLine();
				}else if (pilihan == 3) {
					System.out.println();
					Inventory.printHeader();
			        for (Inventory gadai1 : gadai) 
			        	if(gadai1.getStatus().equals("gadai")){
			        		gadai1.printRow();
			        	}
			        Inventory.printLine();
				}else if (pilihan == 4) {
					break;
				}else {
					System.out.println("\nPeringatan : Masukan pilihan angka 1 - 4!\n");
				}
			} catch (Exception e) {
				input.nextLine();
				System.out.println("\nPeringatan : Masukan pilihan angka 1 - 4!\n");
			}
		} while (pilihan > 1 || pilihan < 4);
	}
	
	public static void menuGadai(){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan form dibawah ini !\n");
		do {
			System.out.print("a. Nama : ");
			try {
				nama = input.nextLine();										
			} catch (Exception e) {
				input.nextLine();
			}
		} while (nama.length()<3 || nama.length()>15);
		
		String kategoriisi = null;
		do {
			try {
				System.out.print("b. Product Category (Mohon masukkan kategori laptop, emas, atau motor : ");
				kategori = input.next();
				if (kategori.toLowerCase().equals("laptop")) {
					kategoriisi = kategori;
				}else if (kategori.toLowerCase().equals("emas")) {
					kategoriisi = kategori;
				}else if (kategori.toLowerCase().equals("motor")) {
					kategoriisi = kategori;
				}
			} catch (Exception e) {
				input.nextLine();				
			}
		} while (kategoriisi == null);
		
		System.out.print("c. Deskripsi (Mohon masukkan deskripsi dengan minimal 2 kata) : ");
		do {
			try {		
				deskripsi = input.nextLine();
			} catch (Exception e) {
				
				System.out.println("Deskripsi :");
				input.nextLine();
			}
		} while (deskripsi.split(" ").length < 2);
		
		do {			
			try {			
				System.out.print("d. Harga (Masukkan harga minimal 10.000 dan kelipatannya) : ");
				harga = input.nextInt();			
			} catch (Exception e) {
				input.nextInt();
			}
		} while (harga%10000!=0);
		
		gadai.add(new Inventory(id+1, nama, kategori, harga, "gadai", deskripsi, harga));
		id= id+1;
		System.out.println();
		System.out.println("SURAT BUKTI GADAI");
		System.out.format("================================================================================%n");
		System.out.println("Nama\t\t\t: " + nama);
		System.out.println("Product Category\t: " + kategori);
		System.out.println("Deskripsi\t\t: " + deskripsi);
		System.out.println("Harga\t\t\t: Rp." + harga+",-");
		System.out.println();
		
	}

}
