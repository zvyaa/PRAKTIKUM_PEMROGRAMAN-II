package praktikum2.Soal3;

// Error: Nama class pada soal adalah Employee, tapi pada Soal3Main.java objeknya dibuat dari class Pegawai.
// Perbaikannya: Nama class diubah menjadi 'Pegawai'.
public class Pegawai {
    public String nama;

    // Error: Tipe data untuk 'asal' seharusnya String ("Kingdom of Orvel").
    // Perbaikannya: Tipe data diubah menjadi 'String'.
    public String asal;

    public String jabatan;

    // Error: umur belum diatur pada Soal3Main dengan nilai 17
    // Umur diisi dengan nilai 17 agar sesuai dengan output yang diminta.
    public int umur = 17;

    public String getNama() {
        return nama;
    }

    // Error: Metode tersebut berusaha mengembalikan nilai bertipe char (asal), padahal metode itu sendiri dideklarasikan untuk mengembalikan tipe String.
    // Perbaikannya: tipe data 'asal' diubah menjadi String.
    public String getAsal() {
        return asal;
    }

    // Error: Method 'setJabatan' tidak memiliki parameter untuk menerima nilai, sehingga variabel 'j' didalam method tidak dikenali.
    // Perbaikan: Tambahkan parameter (String jabatan) agar method dapat menerima input, lalu gunakan this.jabatan untuk mengacu pada variabel milik kelas.
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
