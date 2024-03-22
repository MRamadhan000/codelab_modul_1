import java.util.Scanner;

public class Balok extends BangunRuang{
    private double panjang,lebar,tinggi;
    Scanner scanner = new Scanner(System.in);

    Balok(String name){
        super(name);
    }
    @Override
    public void inputNilai(){
        super.inputNilai();
        double inPanjang,inLebar,inTinggi;
        System.out.print("\tInput sisi panjang : ");
        inPanjang = scanner.nextDouble();
        System.out.print("\tInput sisi lebar : ");
        inLebar = scanner.nextDouble();
        System.out.print("\tInput sisi tinggi : ");
        inTinggi = scanner.nextDouble();
        setPanjang(inPanjang);
        setLebar(inLebar);
        setTinggi(inTinggi);
    }

    @Override
    public void luasPermukaan(){
        double hasil = 2*((getPanjang() * getLebar()) + (getPanjang()*getTinggi()) + (getLebar()*getTinggi()) );
        super.luasPermukaan();
        System.out.println("===== Hasil luas permukanan " + hasil);

    }

    @Override
    public void volume(){
        super.volume();
        double hasil = getPanjang() * getTinggi() * getLebar();
        System.out.println("===== Hasil volume: " + hasil);
    }


    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return this.tinggi;
    }


    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public double getPanjang(){
        return this.panjang;
    }


    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    public double getLebar(){
        return this.lebar;
    }


}
