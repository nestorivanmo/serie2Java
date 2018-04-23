import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        double A,B,C;
        miExcepcions iiee = new miExcepcion();

        System.out.println("Ingrese los coeficientes de su polinomio para calcular las raices");
        while (true) {
            try{
                Scanner entrada1 = new Scanner(System.in);
                String StringA = entrada1.nextLine();
                A=Double.parseDouble(StringA);        
    
                Scanner entrada2 = new Scanner(System.in);
                String StringB = entrada2.nextLine();
                B = Double.parseDouble(StringB);        
        
                Scanner entrada3 = new Scanner(System.in);
                String StringC = entrada3.nextLine();
                C = Double.parseDouble(StringC);
                break;
            }catch(NumberFormatException nfe) {
                System.out.println("Ingrese un numero valido");
            }
        }

        polinomio p = new polinomio(A,B,C);        
        try {
            p.calRaiz();
            
        }catch(miExcepcion ce) {
            System.out.println(iiee.getMessage());
        }
    }
}
