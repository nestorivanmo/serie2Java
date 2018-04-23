import java.util.Scanner;
import java.io.*;
public class Simplificador{

		

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Equis eq = new Equis();
		int a, b, ax = 0, bx = 0, op;

		do{
			System.out.printf("\n1)Simplificar\n2)Salir\n\nOpcion: ");
			op = sc.nextInt();
			switch(op){
				case 1:
							try{
			System.out.println("Vamos a simplificar a/b");
			System.out.print("Introduce a: ");
			a = sc.nextInt();
			System.out.println();
			do{
				System.out.print("Introduce b: ");
				b = sc.nextInt();
				System.out.println();
			}while(b == 0);

			if(a%b == 0){
				System.out.println("Fracción propia, resultado = "+(a/b));
			}else{
				boolean seguir = true;
				do{
					ax = eq.equis(a);
					if((a == ax && b%ax != 0) || b%ax != 0){
						System.out.println(a+"/"+b);
						seguir = false;
					}
					if(ax == 1){
						seguir = false;
						System.out.println(a+"/"+b);

					}
						

						a /= ax;
						b /= ax;

						
				}while(seguir);
			
			}
			}catch(ArithmeticException ae){System.out.println(ae);}
				break;
				}	
		}while(op != 2);
	}	

}

