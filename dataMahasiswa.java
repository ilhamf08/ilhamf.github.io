package arrayInObject;

public class dataMahasiswa {
	public static void main(String[] args) {
		int maxSize = 100;
		manageMahasiswa obj = new manageMahasiswa(maxSize);
		obj.insert("119244", "Lionel Messi", 32);
		obj.insert("119245", "Kylian Mbappe", 25);
		obj.insert("119246", "Cristiano Ronaldo", 33);
		obj.insert("119247", "N'golo Kante", 27);
		obj.insert("119248", "Franck Ribery", 37);
		System.out.println("Data Mahasiswa: ");
		obj.display();
	}
}