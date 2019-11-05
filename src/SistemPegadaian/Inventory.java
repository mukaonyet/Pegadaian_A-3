package SistemPegadaian;

public class Inventory {
	int id;
	String product, status;
	float price, utang;	
	
	public Inventory(int id, String product, float price, String status, int utang){
		this.id=id;
		this.product=product;
		this.price=price;
		this.status=status;
		this.utang=utang;
			
	}
	
	static void printHeader() {
        String leftAlignFormat = "| %-3s | %-15s | %-15s | %-9s | %-15s |%n";

        printLine();
        System.out.format(leftAlignFormat, "ID", "Product", "Price", "Status", "Utang");
        printLine();
    }

    static void printLine() {
        System.out.format("+-----+-----------------+-----------------+-----------+-----------------+%n");
    }

    void printRow() {
        String leftAlignFormat = "| %-3s | %-15s | %-15s | %-9s | %-15s |%n";
        System.out.format(leftAlignFormat, id, product, price, status, utang);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getUtang() {
		return utang;
	}

	public void setUtang(float utang) {
		this.utang = utang;
	}
}

