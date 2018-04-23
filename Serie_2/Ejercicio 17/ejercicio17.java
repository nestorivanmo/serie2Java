import java.util.Scanner;

public class ejercicio17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingresa el numero de discos: ");
            int ndiscos = Integer.parseInt(sc.nextLine());
		Torre torre = new Torre(ndiscos, 'A', 'B', 'C');
		torre.resolver(ndiscos, 'A', 'B', 'C');
	}
}