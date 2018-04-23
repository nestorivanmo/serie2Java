public class Cifrar{
	public void cifrar(String c, int s){
		
		for (int i = 0;i<c.length() ; i++) {
			char ca = (char)(c.charAt(i) + s);
			System.out.print(ca);
		}
		System.out.println();
	}

	public void descifrar(String c, int s){
		for (int i = 0;i<c.length() ; i++) {
			char ca = (char)(c.charAt(i) - s);
			System.out.print(ca);
		}
		System.out.println();
	}
}