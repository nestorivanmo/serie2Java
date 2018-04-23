public class Rombo{
	public void imprimirAsteriscos(int num, int extra, int total){
		int numEsp = total - extra;
		for (int i = 0; i<numEsp ; i++) {
			System.out.print(" ");
		}
		numEsp = 0;
		for (int i = 0; i<num; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}

	
}