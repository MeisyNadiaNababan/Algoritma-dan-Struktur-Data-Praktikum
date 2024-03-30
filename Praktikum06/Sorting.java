public class Sorting {

    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr[0] < arr[arr.length - 1]) {
            return binarySearchAsc(arr, key);
        } else {
            return binarySearchDesc(arr, key);
        }
    }

    public static int binarySearchAsc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int binarySearchDesc(int[] arr, int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("sequentialSearch :");
        int[] daftarNilai = { 80, 45, 20, 15, 10, 5 };
        int key = 5;
        int index = sequentialSearch(daftarNilai, key);
        if (index != -1) {
            System.out.println("Data ditemukan pada indeks ke:- " + index);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\nbinarySearchAsc : ");
        int[] sortedNilaiAsc = { 5, 5, 10, 20, 30, 40, 50 };
        int indexAsc = binarySearchAsc(sortedNilaiAsc, 5);

        if (indexAsc != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indexAsc);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("\n binarySearchDesc : ");
        int[] sortedNilaiDesc = { 50, 40, 30, 20, 10, 5, 5 };
        int indexDesc = binarySearchDesc(sortedNilaiDesc, 5);

        if (indexDesc != -1) {
            System.out.println("Data ditemukan pada indeks ke-" + indexDesc);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
