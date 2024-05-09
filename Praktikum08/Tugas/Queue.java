package Praktikum08.Tugas;

public class Queue{ 
    public Pasien[] antrian;
    public int max;
    public int size;
    public int front;
    public int rear;

    public Queue (int max) {
        this.max = max;
        this.antrian = new Pasien[max];
        this.size = 0;
        this.rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien dt) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            antrian[rear] = dt;
            size++;
            System.out.println("Pasien " + dt.nama + " telah ditambahkan ke dalam antrian");
        } else {
            System.out.println("Antrian penuh, tidak dapat menambahkan pasien baru");
        }
    }

    public Pasien dequeue() {
        if (!isEmpty()) {
            Pasien temp = antrian[front];
            front = (front + 1) % max;
            size--;
            System.out.println("\nPasien " + temp.nama + "telah dipanggil dan dikeluarkan dari antrian");
            return temp;
        } else {
            System.out.println("Antrian kosong, tidak ada pasien yang dapat dipanggil");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("\nDaftar Pasien di Antrian : ");
            for (int i = 0; i < size; i++) {
                System.out.println(antrian[(front + i) % max]);
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("\nPasien yang sedang dipanggil : \n" + antrian[front]);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("\nPasien yang berada di posisi antrian paling belakang : \n" + antrian[rear]);
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void peekPosition(Pasien pasien) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (antrian[(front + i) % max].nama.equals(pasien)){
                    System.out.println("\nPasien " + pasien.nama + "berada di posisi antrian ke-" + (i + 1));
                    return;
                }
            }
            System.out.println("\nPasien dengan nama " +pasien.nama + "tidak ditemukan dalam antrian");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void daftarPaien() {
        if (!isEmpty()) {
            System.out.println("\nDaftar Pasien di Antrian");
            for ( int i = 0; i < size; i++) {
                System.out.println((i + 1) + ". " + antrian[(front + i) % max].nama);
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }
}