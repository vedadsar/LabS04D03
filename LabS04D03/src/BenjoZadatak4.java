public class BenjoZadatak4 {
	/**
	 * Funkcija formira matricu. Na mjestu gdje nadje "0", u koloni i redu od nule ispise sve nule.
	 * @param niz dvodimenzionalni niz koji mi unosimo.
	 * @param nula koordinate "0".
	 * @return matrica sa redom i kolonom 0.
	 */
public static int[][] nulaMatrica(int[][] niz){
		
		int [][] matricaSaNulama = niz;
		
			
		int [] ispisI = new int [20];
		int [] ispisJ = new int [20];
		int index = 0;
		
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if(niz[i][j]==0){
					ispisI[index]=i;
					ispisJ[index]=j;
					index++;
				}
				
			}
		}
		int[] nulaI = new int [index];
		int[] nulaJ = new int[index];
		
		for(int i=0;i<index;i++){
		ispisI[i] = nulaI[i];
		ispisJ[i] = nulaJ[i];
		}
		int brojac = 0;
		
		int red= ispisI[brojac];
		int kolona = ispisJ[brojac];		
		
		
		for(int i=0; i<matricaSaNulama[red].length;i++){
		    matricaSaNulama[red][i] = 0;
		}
		
		for(int i=0; i<matricaSaNulama.length;i++){
		    matricaSaNulama[i][kolona] = 0;
		}
		brojac++;
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
	
	
	
	
	public static void main(String[] args) {

		System.out.println("Unesite velicinu matrice ");
		int dim = TextIO.getInt();
		
		int[][] stariNiz = unesiNiz(dim); // Nas uneseni niz.
		
		
		int [][] matrica = nulaMatrica(stariNiz);//Pozivamo formiranu nula matricu.
		
		
		//For petlja ispisuje matricu.
		for ( int i=0; i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}
