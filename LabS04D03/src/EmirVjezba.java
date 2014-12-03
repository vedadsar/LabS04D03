public class EmirVjezba {

	public static void main(String[] args) {
		int brojRedova = 3;
		int brojKolona = 5;
		char[][] igra = novaIgra(brojRedova, brojKolona);

		ispisiStanjeIgre(igra);

		//char znak = 'X';
		//String pozicija = "A0";
		// odigrajPotez(igra, znak, pozicija);
		//odigrajPotez(igra, 'Y', "B0");
		
	}

	private static void odigrajPotez(char[][] igra, char znak, String pozicija) {
		int kolona = pozicija.toUpperCase().charAt(0) - 'A';
		int red = Integer.parseInt(pozicija.substring(1));
		igra[red][kolona] = znak;
		ispisiStanjeIgre(igra);
	}

	private static void ispisiStanjeIgre(char[][] igra) {
		int brojReda = igra.length;
		int brojKolona = igra[0].length;
		ispisiZaglavlje(brojKolona);
		for (int i = 0; i < brojReda; i++) {
			char[] red = igra[i];
			ispisiRed(red, i);
		}
		ispisiHorizontalnuLiniju(brojKolona);
	}

	private static void ispisiHorizontalnuLiniju(int brojKolona) {
		System.out.println();
		System.out.println("    +");
		for(int i = 0; i<brojKolona;i++){
			System.out.println("---+");
		}
		System.out.println();
	}

	private static void ispisiRed(char[] red, int indexReda) {
		ispisiIndexReda(indexReda);
		System.out.print("|");
		for (int i = 0; i < red.length; i++) {
			char polje = red[i];
			if (polje == 0) {
				polje = ' ';
			}
			System.out.printf("%4c |", red[i]);
		}
		ispisiHorizontalnuLiniju(red.length);
 	}

	private static void ispisiIndexReda(int indexReda) {
		System.out.printf("%d", indexReda);
	}

	private static void ispisiZaglavlje(int brojKolona) {
		for (int i = 0; i < brojKolona; i++) {
			char imeKolona = (char) ('A' + i);
			System.out.printf(" %c  ", imeKolona);
		}
		ispisiHorizontalnuLiniju(brojKolona);
	}

	private static char[][] novaIgra(int brojRedova, int brojKolona) {
		return new char[brojRedova][brojKolona];
	}
}
