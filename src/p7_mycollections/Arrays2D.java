package p7_mycollections;

public class Arrays2D {

	public static void main(String[] args) {

		// Two dimensions arrays with type int
		int[][] sayýlar = new int[4][5];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				sayýlar[i][j] = i * j;
				System.out.print(sayýlar[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("===========================");

		// Two dimensions array with type Nesne
		Nesne[] nesneler = new Nesne[5];
		for (int j = 0; j < 5; j++) {
			nesneler[j] = new Nesne();  // you have to create Nesne objects !
			nesneler[j].eleman = j;
			System.out.print(nesneler[j].eleman + " ");
		}

		System.out.println();
		System.out.println("===========================");

		// Two dimensions array with type Nesne
		Nesne[][] nesneler_2d = new Nesne[5][4];
		for (int j = 0; j < 5; j++) {
			// nesneler_2d[j] = new Nesne[4];   you dont have to do this.
			for (int i = 0; i < 4; i++) {
				nesneler_2d[j][i] = new Nesne();
				
				nesneler_2d[j][i].eleman = i*j;
				System.out.print(nesneler_2d[j][i].eleman + " ");
			}

			System.out.println();
		}

		System.out.println("===========================");

		
		
		
		
	}

}
