import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilihan = 0;
		Scanner input = new Scanner(System.in);
		
		do {	
			try {
				System.out.println("MENU");
				System.out.println("1. List Karyawan");
				System.out.println("2. List Jadwal");
				System.out.println("3. List Nilai");
				System.out.println("4. Exit");
				
				System.out.print("Masukan pilihan : ");
				pilihan = input.nextInt();
				if (pilihan == 1) {
					System.out.println("==================List Karyawan=================");
				}else if (pilihan == 2) {
					System.out.println("=====================List Jadwal=====================");
				}else if (pilihan == 3) {
					System.out.println("===================List Nilai====================");
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
