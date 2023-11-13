import java.util.Scanner;

public class penjualan_irsyad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namaBarang = {
                "Lipstik Matte", "Eyeshadow Palette", "Mascara Waterproof",
                "Foundation Cushion", "Blush On", "Eyeliner Liquid",
                "Makeup Remover", "Skincare Set", "Perfume", "Hair Serum"
        };

        int[] harga = {75_000, 120_000, 45_000, 90_000, 35_000, 50_000, 25_000, 150_000, 80_000, 60_000};

        // Menampilkan judul aplikasi
        System.out.println("=== Aplikasi Penjualan Kosmetik ===");

        // Menginisialisasi total invoice
        int totalInvoice = 0;

        // Menggunakan perulangan for untuk mengolah setiap produk
        for (int i = 0; i < namaBarang.length; i++) {
            // Menampilkan informasi produk
            System.out.println("\nProduk ke-" + (i + 1));
            System.out.println("Nama Barang: " + namaBarang[i]);
            System.out.println("Harga: " + formatHarga(harga[i]));

            // Meminta pengguna untuk memasukkan jumlah barang yang dibeli (Qty)
            System.out.print("Qty: ");
            int qty = scanner.nextInt();

            // Menghitung subtotal untuk produk saat ini
            int subtotal = harga[i] * qty;

            // Menambahkan subtotal ke total invoice
            totalInvoice += subtotal;

            // Menampilkan subtotal untuk produk saat ini
            System.out.println("Subtotal: " + formatHarga(subtotal));
        }

        // Menampilkan total invoice setelah semua produk diinput
        System.out.println("\nTotal Invoice: " + formatHarga(totalInvoice));

        // Menutup scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }

    // Metode untuk mengonversi harga menjadi format yang diinginkan
    private static String formatHarga(int harga) {
        return String.format("%,d", harga).replace(',', '.');
    }
}

