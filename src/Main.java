import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (true) {
            System.out.print("Nama ke-" + i + ": ");
            String nama = scanner.nextLine();
            try {
                if (nama.trim().isEmpty()) {
                    throw new IllegalArgumentException("Nama tidak boleh kosong");
                }
                if (nama.equalsIgnoreCase("selesai")) {
                    break;
                } else {
                    namaMahasiswa.add(nama);
                    i++;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        Iterator<String> iterator = namaMahasiswa.iterator();
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }
    }
}


