import java.util.HashMap;

public class MainInventaris {
    public static void main(String[] args) {
        HashMap<String, Produk> mapInventaris = new HashMap<>();

        mapInventaris.put("P001", new Produk("P001", "Laptop HP", 10));
        mapInventaris.put("P002", new Produk("P002", "Mouse ", 25));
        mapInventaris.put("P003", new Produk("P003", "Keyboard Mechanical", 15));
        mapInventaris.put("P004", new Produk("P004", "Monitor 20 Inch", 8));
        mapInventaris.put("P005", new Produk("P005", "Headset", 20));

        System.out.println("=== DAFTAR INVENTARIS AWAL ===");
        tampilkanDaftar(mapInventaris);

        System.out.println("\n--- PROSES UPDATE & HAPUS ---");
        String kodeUpdate = "P002";
        if (mapInventaris.containsKey(kodeUpdate)) {
            mapInventaris.get(kodeUpdate).setStok(30);
            System.out.println("Stok produk dengan kode " + kodeUpdate + " berhasil diubah menjadi 30.");
        }

        String kodeHapus = "P004";
        if (mapInventaris.containsKey(kodeHapus)) {
            mapInventaris.remove(kodeHapus);
            System.out.println("Produk dengan kode " + kodeHapus + " berhasil dihapus dari inventaris.");
        }

        System.out.println("\n=== DAFTAR INVENTARIS AKHIR ===");
        tampilkanDaftar(mapInventaris);
    }

    private static void tampilkanDaftar(HashMap<String, Produk> mapInventaris) {
        int totalStok = 0; 

        for (String key : mapInventaris.keySet()) {
            Produk p = mapInventaris.get(key);
            System.out.println(p.getKodeProduk() + " | " + p.getNama() + " - stok: " + p.getStok());
            totalStok += p.getStok(); 
        }

        System.out.println("----------------------------------------");
        System.out.println("Total Keseluruhan Stok: " + totalStok);
    }
}