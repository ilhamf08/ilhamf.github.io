package arrayInObject;

public class Mahasiswa {
	private String nimMhs;
	private String namaMhs;
	private int umurMhs;
	
	public Mahasiswa() {
		nimMhs = "";
		namaMhs = "";
		umurMhs = 5;
	}
	
	public Mahasiswa(String nim, String nama, int umur) {
		nimMhs = nim;
		namaMhs = nama;
		umurMhs = 0;
	}
	
	public void displayMhs() {
		System.out.println("NIM: " + nimMhs);
		System.out.println("Nama: " + namaMhs);
		System.out.println("Umur: " + umurMhs);
	}
	
	public String getNimMhs() {
		return nimMhs;
	}
		
	public void setNimMhs(String n) {
		nimMhs = n;
	}
	
	public String getNamaMhs() {
		return namaMhs;
	}
	
	public void setNamaMhs(String n) {
		namaMhs = n;
	}
	
	public int getUmurMhs() {
		return umurMhs;
	}
	
	public void setUmurMhs(int n) {
		umurMhs = n;
	}
}