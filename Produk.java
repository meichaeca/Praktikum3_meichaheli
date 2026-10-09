public class Produk {
    private String kodeProduk;
    private String nama;
    private int stok;

    // Constructor
    public Produk(String kodeProduk, String nama, int stok) {
        this.kodeProduk = kodeProduk;
        this.nama = nama;
        this.stok = stok;
    }

    // Getter dan Setter untuk kodeProduk
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk stok
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
} 