package day02;

public class Soal01 {

	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 3;
		int angka = 1;
		int hasil = 0;
		int angka0 = 0;
		int angka1 = 1;
		int angka2 = 2;
		for(int counter = 0; counter < n1; counter++) {

			switch(counter) {
			case 0:
//				System.out.print(angka);
				angka0 = angka;
				hasil = hasil + angka;
				break;
			case 1:
//				System.out.print(angka);
				angka1 = angka;
				hasil = hasil + angka;
				break;
			case 2:
//				System.out.print(angka);
				angka2 = angka;
				hasil = hasil + angka;
				break;
			}
			
			angka = angka * 3;
			
		}
		
		System.out.println(angka0 + " + " + angka1 + " + " + angka2 + " = " + hasil);
		
	}

}
