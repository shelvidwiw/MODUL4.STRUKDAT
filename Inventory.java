import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Pensil", 50);
        inventory.put("Buku", 35);
        inventory.put("Penghapus", 25);

        System.out.println("Inventory Awal : " + inventory);

        inventory.put("Pensil", inventory.get("Pensil") + 20);

        inventory.remove("Penghapus");

        System.out.println("Inventory setelah diupdate: " + inventory);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang yang ingin dicari: ");
        String barang = scanner.nextLine();

        cariBarang(inventory, barang);
    }

    public static void cariBarang(HashMap<String, Integer> inventory, String barang){
    if (inventory.containsKey(barang)) {
        System.out.println("Stok " + barang + ": " + inventory.get(barang) + " unit.");
    } else {
        System.out.println("Barang " + barang + " tidak tersedua di inventory.");
    }
    }
}