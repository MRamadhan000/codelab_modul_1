import java.util.Scanner;
public class Kubus extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    Kubus(String name){
        super(name);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("\tInput tinggi : ");
        double inputTinggi = scanner.nextDouble();
        setTinggi(inputTinggi);
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * getTinggi() * getTinggi();
        super.luasPermukaan();
        System.out.println("===== Hasil luas permukanan " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(getTinggi(), 3);
        super.volume();
        System.out.println("===== Hasil volume: " + hasil);
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }
}
