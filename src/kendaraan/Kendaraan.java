package kendaraan;
public abstract class Kendaraan {
    private String name;
    private String model;
    private String warna;
    private int tahun;

    public abstract void Start();
    public abstract void Brake();
    public abstract void Stop();
    
    public void getInfo(){
        System.out.println("Kendaraan: " + this.getName());
        System.out.println("Model : " + this.getModel());
        System.out.println("Warna : " + this.getWarna());
        System.out.println("Tahun : " + this.getTahun());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public int getTahun(){
        return tahun;
    }

    public void setTahun(int tahun){
        this.tahun = tahun;
    }
}
