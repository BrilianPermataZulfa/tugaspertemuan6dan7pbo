import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("=======APLIKASI KURSUS BAHASA INGGRIS========");
        System.out.println("=============================================");
        System.out.println();
        Pengajar Pengajar = new Pengajar();
        Pengajar.input_data();
        Pengajar.update_data();
        Pelanggan Pelanggan = new Pelanggan();
        Pelanggan.input_data();
        Pelanggan.lihat_data();
        Petugas Petugas = new Petugas();
        Petugas.input_data();
        Petugas.update_data();
        Siswa Siswa = new Siswa();
        Siswa.lihat_data();
        Siswa.input_data();
        Kursusbahasainggris Kursusbahasainggris= new Kursusbahasainggris();
        Kursusbahasainggris.input_data();
        Kursusbahasainggris.jenis_kelas();
        Kursusbahasainggris.update_data();
    }
}