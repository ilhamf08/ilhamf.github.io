package arrayTest;

public class arrayExample {
	public static void main(String[] args) {
		String[] dataProdi = new String[7];
		dataProdi[0] = "Matematika";
		dataProdi[1] = "Biologi";
		dataProdi[2] = "Fisika";
		dataProdi[3] = "Kimia";
		dataProdi[4] = "Agroteknologi";
		dataProdi[5] = "Teknik Elektro";
		dataProdi[6] = "Teknik Informatika";
		
		System.out.println("Menampilkan Index 1, 4, 6");
		System.out.println("-------------------------");
		System.out.println("Data jurusan ke-1: "+dataProdi[0]);
		System.out.println("Data jurusan ke-4: "+dataProdi[3]);
		System.out.println("Data jurusan ke-6: "+dataProdi[5]);
		System.out.println(" ");
		
		System.out.println("Menampilkan Data Jurusan Tanpa Index");
		System.out.println("-------------------------");
		for (int i=0; i<7; i++)
		{
			if(i==4)
				continue;
			System.out.println("Data Jurusan ke-"+i+" "+dataProdi[i]);
		}
	}
}

