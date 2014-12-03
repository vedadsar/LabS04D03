import java.util.Arrays;

public class BenjoZadatak1 {

	public static int[] unosNiza(int broj) {
		int[] niz = new int[broj];
		for (int i = 0; i < broj; i++) {
			System.out.println("Unesite " + (i + 1) + " clan niza");
			int unos = TextIO.getInt();
			niz[i] = unos;
		}
		return niz;
	}

	public static void ispisNiza(int[] niz) {

		System.out.println("Clanovi niza su: ");
		for (int i = 0; i < niz.length - 1; i++) {
			System.out.print(niz[i] + ", ");
		}
		System.out.println(niz[niz.length - 1]);
	}

	public static int trazi(int[] niz, int broj) {

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == broj) {
				return (i + 1);
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Unesite broj elemanata niza");
		int unosBroja = TextIO.getInt();
		System.out.println("unesite broj koji trazite");
		int traziBroj = TextIO.getInt();
		// ispisNiza(unosNiza(unosBroja));
		int index = trazi(unosNiza(unosBroja), traziBroj);
		if (index == -1) {
			System.out.println("Taj broj nije u vasem nizu");
			return;
		}
		System.out.println("Vas broj je pod rednim brojem: " + index
				+ " u nizu.");

	}
}
