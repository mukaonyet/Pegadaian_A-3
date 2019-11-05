package SistemPegadaian;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilihan = 0;
		Scanner input = new Scanner(System.in);

		ArrayList<Inventory> gadai = new ArrayList<>();
		
		do {	
			try {
				System.out.format("==============================================================================%n");
				System.out.println("||====================\t P E G A D A I A N   S Y S T E M \t============||");
				System.out.println("||====================\t\t   KELOMPOK 3\t\t====================||");
				System.out.format("==============================================================================%n");
				System.out.println("1. Gadai");
				System.out.println("2. Tebus");
				System.out.println("3. Tampilkan Inventory");
				System.out.println("4. Exit");
				
				System.out.print("Masukan pilihan menu : ");
				pilihan = input.nextInt();
				if (pilihan == 1) {
					// gadai
				}else if (pilihan == 2) {
					// tebus
				}else if (pilihan == 3) {
					Inventory.printHeader();
			        for (Inventory gadai1 : gadai) gadai1.printRow();
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

}
