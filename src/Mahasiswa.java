public class Mahasiswa {
    private String name;
    private String NIM;
    private String jurusan;
    Mahasiswa(String name, String NIM, String jurusan){
        this.name = name;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }
    public static void tampilUniversitas(){
        System.out.println("UNIVERSITAS MUHAMMADIYAH MALANG");
    }
    public void tampilDataMahasiswa(){
        System.out.println("Name " + this.name + " , NIM : " + this.NIM + " , Jurusan : " + this.jurusan);
    }
}
