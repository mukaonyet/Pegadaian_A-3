package SistemPegadaian;
import java.util.Scanner;
import java.util.ArrayList;

public class Tebus {
	ArrayList<Inventory> inventory;
	
	Tebus(ArrayList<Inventory> inventories) {
		int pilihan;
		float bayar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("\n Pilih Barang yang ingin ditebus ");
		pilihan = input.nextInt();
		
		boolean inven = false;
		
		float price = 0;
		float utang = 0;
		float tmpUtang = 0;
	
		for (int i = 0; i < inventories.size(); i++) {
			if (pilihan == inventories.get(i).getId() && inventories.get(i).getStatus() != "Lunas") {
				inven = true;
				price = inventories.get(i).getPrice();
				utang = inventories.get(i).getUtang();
			}
		}

		if (inven == false) {
			new Tebus(inventories);	
		}	
		
		System.out.print("Masukkan Jumlah yg ingin anda bayar ");
		bayar = input.nextFloat();
		tmpUtang = utang - bayar;
		
		for (int i_akhir = 0; i_akhir < inventories.size(); i_akhir++) {
			if (pilihan == inventories.get(i_akhir).getId()) {
				if (tmpUtang == 0) {
					inventories.get(i_akhir).setStatus("Lunas");
					inventories.get(i_akhir).setUtang(0);
				} else {
					inventories.get(i_akhir).setUtang(tmpUtang);
				}
			}
		}
	}
}
