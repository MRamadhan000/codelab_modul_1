import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String name,birthDay,getGender;
        char gender;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Nama : ");
        name = userInput.nextLine();

        System.out.print("Jenis Kelamin (L/P) : ");
        gender = userInput.next().charAt(0);
        userInput.nextLine();

        System.out.print("Tanggal Lahir :(yyy-mm-ddd) : ");
        birthDay = userInput.nextLine();

        String[] parts = birthDay.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        LocalDate calculate = LocalDate.of(year,month,day);
        int calYears = Period.between(calculate,today).getYears();
        int calMonth = Period.between(calculate,today).getMonths();

        getGender = (gender == 'P') ? "Perempuan" : "Laki-laki";
        System.out.println("\nNama : " + name + "\nJenis Kelamin: " + getGender + "\nUmur anda : " + calYears + " tahun " + calMonth + " bulan");
    }
}


