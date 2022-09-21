package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("Beşinci eleman : "+mesaj.charAt(4)); //string ifadenin belirli indeksindeki elemanı bulmak için charAt kullanılır
		System.out.println(mesaj.concat(" Yaşasın!")); //iki stringi birleştirmek için concat kullanılır
		System.out.println(mesaj.startsWith("b")); // startsWith true ya da false olur. hangi harfle başladığını kontrol eder. küçük büyük harf duyarlılığı vardır.
		System.out.println(mesaj.endsWith(".")); //endsWith; startsWith'in tersidir. Hangi harfle bittiğini kontrol eder. true ya da false döner
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); //karakterleri vermesini isteriz ama onun için öncesinde karakter dizisi oluşturmamız lazım.
		// mesaj'daki karakterlerin 0. indeksten başla 5. indekse kadar (buradaki 5. indeks dahil değildir) karakterler dizisine 0. indeksten başlayarak ata.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); //aramaya soldan başlar. içine yazılan karakterin kaçıncı eleman olduğunu bulmaya yarar. ilk bulduğunu verir.
		System.out.println(mesaj.lastIndexOf("a")); // aramaya sağdan başlar, indexOf la aynı işi yapar.*/
		
		String yeniMesaj = mesaj.replace(' ', '-');  //karakterleri değiştirmek için kullanılır. burada boşluklar - ile değiştirilmiştir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5)); // görevi bir metnin içerisinden parça almaktır. belirtilen indeksten itibaren alır. son alacağı karakteri de indeks sayısı ile belirleyebiliriz.
		
		for(String kelime : mesaj.split(" ")){// bir metni belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // harfleri küçültür
		System.out.println(mesaj.toUpperCase()); // harfleri büyütür
		
		System.out.println(mesaj.trim()); // baştaki ve sondaki boşlukları siler	
	}

}
