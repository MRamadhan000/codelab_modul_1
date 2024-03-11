import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){

        int choose;
        boolean isRun = true;
        Scanner inputObj = new Scanner(System.in);

        while (isRun) {
            System.out.print("==== MENU ====\n1. Tambah Data Mahasiswa \n2. Tampil Data Mahasiswa\n3. Exit\nPilihan anda : ");
            choose = inputObj.nextInt();
            switch (choose){
                case 1 :
                    option1(inputObj);
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    isRun = false;
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
    public static void option1(Scanner inputObj){
        inputObj.nextLine();
        String inputNIM,inputNama,inputJurusan;
        System.out.print("Masukkan nama mahasiswa : ");
        inputNama = inputObj.nextLine();
        do{
            System.out.print("Masukkan NIM Mahasiswa : ");
            inputNIM = inputObj.nextLine();
            if (inputNIM.length()!=15)
                System.out.println("Nim harus 15 digit");
        }while (inputNIM.length() != 15);
        System.out.print("Masukkan jurusan Mahasiswa : ");
        inputJurusan = inputObj.nextLine();
        System.out.print("Data berhasil ditambahkan\n");
        Mahasiswa maba = new Mahasiswa(inputNama,inputNIM,inputJurusan);
        listMahasiswa.add(maba);
    }
    public static void option2(){
        Mahasiswa.tampilUniversitas();
        for (Mahasiswa x : listMahasiswa){
            x.tampilDataMahasiswa();
        }
    }
}