public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        PersegiPanjang[] arrayPersegiPanjang = new PersegiPanjang[3];

        arrayPersegiPanjang[0] = new PersegiPanjang();
        arrayPersegiPanjang[0].panjang = 10;
        arrayPersegiPanjang[0].lebar = 30;

        arrayPersegiPanjang[1] = new PersegiPanjang();
        arrayPersegiPanjang[1].panjang = 80;
        arrayPersegiPanjang[1].lebar = 40;

        arrayPersegiPanjang[2] = new PersegiPanjang();
        arrayPersegiPanjang[2].panjang = 100;
        arrayPersegiPanjang[2].lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + arrayPersegiPanjang[0].panjang + ", lebar: " + arrayPersegiPanjang[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + arrayPersegiPanjang[1].panjang + ", lebar: " + arrayPersegiPanjang[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + arrayPersegiPanjang[2].panjang + ", lebar: " + arrayPersegiPanjang[2].lebar);
    

    }
}
