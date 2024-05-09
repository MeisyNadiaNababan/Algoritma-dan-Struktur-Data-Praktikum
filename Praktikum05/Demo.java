public class Demo {

    public static void main(String[] args) {
        // Buat kelas dengan kuota 5 mahasiswa
        Kelas kelas = new Kelas(5);

        // Tambahkan beberapa mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20, 3.8);
        kelas.add(mhs1);
        Mahasiswa mhs2 = new Mahasiswa("Ani", 21, 3.2);
        kelas.add(mhs2);
        Mahasiswa mhs3 = new Mahasiswa("Cici", 22, 3.5);
        kelas.add(mhs3);
        Mahasiswa mhs4 = new Mahasiswa("Deni", 23, 3.0);
        kelas.add(mhs4);

        // Tampilkan daftar mahasiswa sebelum diurutkan
        System.out.println("Sebelum diurutkan:");
        kelas.displayInfo();

        // Urutkan berdasarkan IPK dengan bubble sort
        kelas.bubbleSortByIPK();

        // Tampilkan daftar mahasiswa setelah diurutkan berdasarkan IPK
        System.out.println("\nSetelah diurutkan berdasarkan IPK (bubble sort):");
        kelas.displayInfo();

        // Cari mahasiswa dengan nama "Budi"
        System.out.println("\nPencarian sekuensial berdasarkan nama:");
        String keyword = "Budi";
        Mahasiswa mhsFound = kelas.sequentialSearchByNama(keyword);
        if (mhsFound != null) {
            System.out.println("Mahasiswa dengan nama \"" + keyword + "\" ditemukan:");
            mhsFound.displayInfo();
        } else {
            System.out.println("Mahasiswa dengan nama \"" + keyword + "\" tidak ditemukan");
        }

        System.out.println("\nPencarian biner berdasarkan umur:");
        int umur = 19;
        int foundIndex = kelas.binarySearchByUmur(umur);
        
        if (foundIndex != -1) {
            System.out.println("Mahasiswa dengan umur " + umur + " ditemukan pada indeks ke-" + foundIndex);
            kelas.daftarMahasiswa[foundIndex].displayInfo();
        } else {
            System.out.println("Mahasiswa dengan umur " + umur + " tidak ditemukan");
        }
        
        // Penambahan kode untuk menampilkan semua mahasiswa yang memiliki umur sama dengan yang dicari
        Mahasiswa[] foundMahasiswa = kelas.findAllByUmur(umur);
        if (foundMahasiswa.length > 0) {
            System.out.println("\nDaftar mahasiswa dengan umur " + umur + ":");
            for (Mahasiswa mhs : foundMahasiswa) {
                mhs.displayInfo();
            }
        } else {
            System.out.println("Tidak ada mahasiswa dengan umur " + umur);
        }
        
}
}