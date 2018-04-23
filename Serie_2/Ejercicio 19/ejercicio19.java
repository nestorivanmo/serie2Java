import java.util.Scanner;
import java.util.ArrayList;

class ejercicio19 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        ArrayList <Matriz> matrices= new ArrayList <Matriz>();
        int orden;
        int opc;
        do{
            
            System.out.println("1)Nueva matriz");
            System.out.println("2)Matrices existentes");
            System.out.println("3)Calcular determinante");
            System.out.println("4)Salir");
            System.out.println("");
            System.out.print("Opcion: ");
            
            
            opc=sc.nextInt();
            System.out.println("");
            switch(opc){

                case 1: //nueva matriz
                    System.out.println("de que orden deseas la nueva matriz");
                    int nue= sc.nextInt();
                    if (nue == 0){
                        System.out.println("no hay matrices de orden 0");
                    }else{
                        int k;
                        Matriz nueva= new Matriz(nue);
                        nueva.llenar();
                        matrices.add(nueva);
                    }
                    System.out.println("");
                break;

                case 2: //ver matrices
                    int ind=1;
                    for (Matriz mat : matrices){ //para todas las matrices del arreglo
                        System.out.println("matriz numero/indice de arreglo "+ind+"\n");
                        mat.imprimir();
                    }
                System.out.println("");
                break;

                case 3:
                    System.out.println("elija una matriz para sacar determinante");
                    for (Matriz mat : matrices){ //para todas las matrices del arreglo
                        mat.imprimir();
                    }
                    System.out.println("");
                    //imprimirMatrices(matrices);
                    System.out.println("elija la matriz con un indice entero entre 1 y n");
                    int uno = sc.nextInt();
                    uno -=1;
                    
                    Matriz mat1 = matrices.get(uno);
                    double det= mat1.getDeterminante(mat1,0);

                    System.out.println("el determinante de esta matriz es  "+det);
                    System.out.println("");
            
                break;


               

                }
        }while(opc != 4);
    }
}
