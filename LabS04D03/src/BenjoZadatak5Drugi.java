public class BenjoZadatak5Drugi {

	public static void dupliKarakteri(String[] prvi, String[] drugi) {

		for (int i = 0; i < prvi.length; i++) {
			for (int j = 0; j < drugi.length; j++) {
				if (prvi[i].equalsIgnoreCase(drugi[j])) {
					System.out.println(prvi[i]);
				}
			}
		}

	}

	public static void main(String[] args) {

		String[] prva = args[0].split(" ");
		String[] druga = args[1].split(" ");

		dupliKarakteri(prva, druga);
	}
}
