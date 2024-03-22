public class BangunRuang {
    private String name;

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("\n\tInput nilai");
    }

    public void luasPermukaan(){
        System.out.println("\tMenghitung luas permukaan bangun " +this.name);
    }

    public void volume(){
        System.out.println("\tMenghitung volume bangun " + this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
