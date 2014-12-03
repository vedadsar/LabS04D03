public class BenjoZadatak5 {

	public static void main(String[] args) {
		String[] recenica1 = new String[20];
		String[] recenica2 = new String[20];
		int brojac = 0;
		int brojac2 = 0;

		for (int i = 0; i < args.length; i++) {

			if (!args[i].equals(".")) {
				args[i] = recenica1[brojac];
				brojac++;
			} else
				break;

		}
		for (int i = (brojac + 1); i < args.length; i++) {
			args[i] = recenica2[brojac2];
			brojac2++;

		}

		for(int i=0; i<recenica1.length;i++){
			if(recenica1[i].equals(recenica2[i])){
				System.out.println(recenica1[i]);
			}
		}
		
	}

}
