package inheritanceDemo;

public class Main {
//Bir class sadece başka bir classı extend edebilir. ikinci bir classı extend edemez
	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
