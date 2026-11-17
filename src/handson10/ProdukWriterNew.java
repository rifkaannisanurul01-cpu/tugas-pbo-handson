package handson10;

import java.io.IOException;
import java.nio.file.*;
        import java.util.*;

class Produk<T, U, V> {
    private T nama;
    private U harga;
    private V stok; // Tambahan atribut stok (Integer)

    public Produk(T nama, U harga, V stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return nama + "," + harga + "," + stok;
    }
}

public class ProdukWriterNew {
    public static void main(String[] args) {
        List<Produk<String, Double, Integer>> produkList = new ArrayList<>();
        produkList.add(new Produk<>("Laptop", 15000000.0, 5));
        produkList.add(new Produk<>("Mouse", 150000.0, 15));
        produkList.add(new Produk<>("Keyboard", 350000.0, 10));

        Path filePath = Paths.get("produk_output.txt");

        try {
            List<String> lines = new ArrayList<>();
            for (Produk<String, Double, Integer> p : produkList) {
                lines.add(p.toString());
            }
            Files.write(filePath, lines);
            System.out.println("Data produk berhasil disimpan menggunakan NIO.2");

            // Membaca kembali isi file (Files.readAllLines())
            System.out.println("\nMembaca kembali dari file:");
            List<String> readLines = Files.readAllLines(filePath);
            for (String line : readLines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Gagal memproses file: " + e.getMessage());
        }
    }
}