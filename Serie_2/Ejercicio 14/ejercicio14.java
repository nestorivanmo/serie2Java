import java.util.Scanner;
public class ejercicio14{
	public static void main(String[] args) {
		int opc;
		Scanner sc = new Scanner(System.in);
		Agenda ag = new Agenda();
		do{
			System.out.print("\n1)Agregar persona\n2)Borrar persona\n3)Buscar persona\n4)Borrar todo\n5)Listar\n6)Salir\n\nOpcion: ");
			opc = sc.nextInt();
			switch (opc) {
				case 1:
					ag.guardarPersonas();
					break;
				case 2:
				ag.listar();
				System.out.print("Num persona a borrar: ");
				ag.borrarPers((sc.nextInt()-1));
				System.out.println();
				System.out.println("Lista actualizada: ");
				ag.listar();
				System.out.println();
					break;
				case 3:
				ag.buscarPers();
					break;
				case 4:
					ag.borrarTodo();	
					System.out.println("Se borró todo");
					ag.listar();
					break;
				case 5:
					ag.listar();	
					break;
			}
		}while(opc != 6);	
	}
}