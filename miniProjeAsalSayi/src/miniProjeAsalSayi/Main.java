package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 1;
		int remainder = number % 2; //remainder kalanı verir.
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayı asal değildir.");
			return; // bağlı bulunduğu bloğu bitirir.
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı.");
		}
		
		for (int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) { // if içerisine sadece isPrime yazmak isPrime == true ile aynı şeydir.
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
