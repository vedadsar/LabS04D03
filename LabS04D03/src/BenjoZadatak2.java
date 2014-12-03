public class BenjoZadatak2 {

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
    
	public static int[] trazi(int niz[][], int broj){
		int [] ispis = new int [2];
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				if(niz[i][j]==broj){
					ispis[0]=i;
					ispis[1]=j;
				}
				
			}
		}
		return ispis;
	}
	
	public static void main(String[] args) {
       System.out.println("Unesite dimenzije matrice ");
       int dim = TextIO.getInt();
       System.out.println("Unesite broj koji trazite ");
       int idx = TextIO.getInt();
       
       int [] traziNiz = trazi(unesiNiz(dim),idx);
       
       System.out.print("Clan koji ste trayili je na poziciji:  ");
       for(int i= 0; i<traziNiz.length;i++){
    	   System.out.print(traziNiz[i] +" ");
       }
       
	}

}
