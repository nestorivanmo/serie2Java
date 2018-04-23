import java.util.Scanner;
public class CifradoCesar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cadena1;
		String cadena2[];
		Cifrar cifrado = new Cifrar();
		int opc = Integer.parseInt(args[0]);
		switch(opc){
			case 0:
				System.out.print("Introduce la cadena a cifrar: ");
				cadena1 = sc.next();
				System.out.print("Introduce el cambio: ");
				cifrado.cifrar(cadena1, sc.nextInt());
			break;
			case 1:
				System.out.print("Introduce la cadena a descifrar: ");
				cadena1 = sc.next();
				System.out.print("Introduce el cambio: ");
				cifrado.descifrar(cadena1, sc.nextInt());
			break;
			default:
				System.out.println("Introduce otra opción");
			break;
		}
	}
}