//package Praktikum05;

public class Kelas {
    Mahasiswa[] daftarMahasiswa;
    int index;

    public Kelas(int kuota) {
        daftarMahasiswa = new Mahasiswa[kuota];
    }

    public void add(Mahasiswa mahasiswa) {
        if (index < daftarMahasiswa.length) {
            daftarMahasiswa[index] = mahasiswa;
            index++;
        } else {
            System.out.println("Kelas sudah penuh");
        }
    }

    public void displayInfo() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa != null) {
                mahasiswa.displayInfo();
            }
        }
    }

    public void bubbleSortByIPK() {
        int n = index;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarMahasiswa[j].ipk > daftarMahasiswa[j + 1].ipk) {
                    Mahasiswa temp = daftarMahasiswa[j];
                    daftarMahasiswa[j] = daftarMahasiswa[j + 1];
                    daftarMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSortByUmur() {
        int n = index;
    
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
    
            for (int j = i + 1; j < n; j++) {
                if (daftarMahasiswa[j].umur < daftarMahasiswa[minIndex].umur) {
                    minIndex = j;
                }
            }
    
            Mahasiswa temp = daftarMahasiswa[minIndex];
            daftarMahasiswa[minIndex] = daftarMahasiswa[i];
            daftarMahasiswa[i] = temp;
        }
    }
    
    public void insertionSortByIPKDesc() {
        int n = index;
    
        for (int i = 1; i < n; i++) {
            Mahasiswa key = daftarMahasiswa[i];
            int j = i - 1;
    
            while (j >= 0 && daftarMahasiswa[j].ipk < key.ipk) {
                daftarMahasiswa[j + 1] = daftarMahasiswa[j];
                j = j - 1;
            }
    
            daftarMahasiswa[j + 1] = key;
        }
    }
    
    public Mahasiswa sequentialSearchByNama(String keyword) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa != null && mahasiswa.nama.contains(keyword)) {
                return mahasiswa;
            }
        }
        return null;
    } 
    
    public Mahasiswa binarySearchByUmur(int umur) {
        int n = index;
        int low = 0;
        int high = n - 1;
    
        while (low <= high) {
            int mid = (low + high) / 2;
            if (daftarMahasiswa[mid].umur == umur) {
                return daftarMahasiswa[mid];
            } else if (daftarMahasiswa[mid].umur < umur) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }    
}
  