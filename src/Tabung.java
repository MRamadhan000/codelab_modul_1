import java.util.Scanner;

public class Tabung extends BangunRuang{
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    Tabung(String nameBangun){
        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("\tInput tinggi: ");
        double inputTinggi = scanner.nextDouble();
        setTinggi(inputTinggi);
        System.out.print("\tInput jari-jari: ");
        double inputJariJari = scanner.nextDouble();
        setJariJari(inputJariJari);
    }

    @Override
    public void luasPermukaan(){
        double hasil = 2 * Math.PI * getJariJari() * getJariJari();
        super.luasPermukaan();
        System.out.println("===== Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.PI * Math.pow(getJariJari(), 2) * getTinggi();
        super.volume();
        System.out.println("===== Hasil volume: " + hasil);
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }
    public void setJariJari(double jariJari){
        this.jari_jari = jariJari;
    }

    public double getJariJari(){
        return this.jari_jari;
    }
}