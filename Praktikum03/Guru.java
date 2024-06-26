public class Guru {
    String nama; 
    String nip;
    String jabatan;
    int golongan; 
    float gaji;

    public Guru(String nama, String nip, String jabatan, int golongan) { 
        this.nama = nama;
        this.nip = nip;
        this.jabatan = jabatan;
        this.golongan = golongan;
        tampilGaji();
    }

    public void tampilGaji() { 
        if (jabatan.equalsIgnoreCase("PNS")) {
            gaji = golongan == 1 ? 4000000 : 5000000;
        } else if (jabatan.equalsIgnoreCase("Honorer")) {
            gaji = golongan == 1 ? 1000000 : 2500000;
        } else {
            System.out.println("Jabatan tidak valid");
            gaji = 0;
        }
    }

    public void CetakInfo() { 
        System.out.println("Nama            :" + this.nama);
        System.out.println("NIP             :" + this.nip);
        System.out.println("Jabatan         :" + this.jabatan);
        System.out.println("Golongan        :" + this.golongan);
        System.out.println("Gaji            :" + this.gaji);
    }
}

