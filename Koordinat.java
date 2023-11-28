/**
 *
 * @author User
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// kelas koordinat sebagai super class
public class Koordinat{
// deklarasi variabel
    protected int x;
    protected int y;
    
// konstruktor
    public Koordinat(int x, int y) {
        this.x = x;
        this.y = y;
    }   
// metode getter dan setter untuk mengambil dan mengisi data obyek
    public int getX(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
 // membuat sub class warna koordinat   
static class warnaKoordinat extends Koordinat{
    String namaWarna;
 
// metode getter dan setter
    public String getNamaWarna(){
        return namaWarna;
    }
    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }
 // konstruktor
 public warnaKoordinat(int x, int y, String namaWarna){
     super(x,y);
     this.namaWarna = namaWarna;
    }
}
// membuat obyek warna koordinat
 public static void main(String[] args) {
        warnaKoordinat warna = new warnaKoordinat(10, 4, "Jingga");
        System.out.println("Warna koordinat: " + warna.getNamaWarna());
        System.out.println("Koordinat sumbu x: " + warna.getX() + ", y: " + warna.getY());
}
    
    }
