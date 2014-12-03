public class BenjoZadatak3 {
	/**
	 * Funkcija formira matricu. Na mjestu gdje nadje "0", u koloni i redu od nule ispise sve nule.
	 * @param niz dvodimenzionalni niz koji mi unosimo.
	 * @param nula koordinate "0".
	 * @return matrica sa redom i kolonom 0.
	 */
public static int[][] nulaMatrica(int[][] niz, int [] nula ){
		
		int [][] matricaSaNulama = niz;
		int red= nula[0];
		int kolona = nula[1];
		// For petlja, mjenja kolone po "red" redu i  upisuje 0 u kolone.
		for(int i=0; i<matricaSaNulama[red].length;i++){
		    matricaSaNulama[red][i] = 0;
		}
		// For petlja mjenja redove i ispisuje 0 po kolonama "kolona".
		for(int i=0; i<matricaSaNulama.length;i++){
		    matricaSaNulama[i][kolona] = 0;
		}
		
		return matricaSaNulama;
	}
	
	/**
	 * Funkcija koja unosi neki dvodimenzionalni niz.
	 * @param broj integer, format matrice npr 2 = 2x2;
	 * @return dvodimenzionalni niz
	 */
	public static int[][] unesiNiz(int broj) {

		int[][] niz = new int[broj][broj];
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				System.out.println("Unesite clan niza");
				int unos = TextIO.getInt();
				niz[i][j] = unos;
			}
		}
		return niz;
	}
	
	/**
	 * Funkcija trazi 0, i vraca niz(red,kolona) koordinate gdje se nalazi 0;
	 * @param niz = dvodimenzionalna matrica koju smo upisali, a u kojoj trazimo 0.
	 * @return niz, koordinate 0.
	 */
	public static int[] trazi(int niz[][]){
		int [] ispis = new int [20];
		int index = 0;
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if(niz[i][j]==0){
					ispis[index]=i;
					index++;
					ispis[index]=j;
					
				}
				
			}
		}
		int[] nulaIJ = new int [index];
		for(int i=0;i<=index;i++){
		ispis[i] = nulaIJ[i];
		}
		return nulaIJ;
	}
		
	
	
	public static void main(String[] args) {

		System.out.println("Unesite velicinu matrice ");
		int dim = TextIO.getInt();
		
		int[][] stariNiz = unesiNiz(dim); // Nas uneseni niz.
		int [] nula = trazi(stariNiz);// novi niz, pozivamo niz koordinate matrice.
		
		int [][] matrica = nulaMatrica(stariNiz, nula);//Pozivamo formiranu nula matricu.
		
		
		//For petlja ispisuje matricu.
		for ( int i=0; i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}
