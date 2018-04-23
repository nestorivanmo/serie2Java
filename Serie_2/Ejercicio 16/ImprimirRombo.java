public class ImprimirRombo{
	public static void main(String[] args) {
		Rombo rombo = new Rombo();
		int num = Integer.parseInt(args[0]);
		int[] arrAsteriscos = new int[num];

		for(int i = 0; i<num; i++){
			arrAsteriscos[i] = (2*(i+1))-1;
			//System.out.println(arrAsteriscos[i]);
		}

		for (int i = 0; i<=num; i++) {
			if(i == num){
				for (int j= num-1; j>0; j--) {
					rombo.imprimirAsteriscos(arrAsteriscos[j-1], j-1, num);
				}
			}else{
				rombo.imprimirAsteriscos(arrAsteriscos[i], i, num);
			}
		}
	}
}