public class polinomio {
    double a;
    double b;
    double c;

    public polinomio(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void raiz() throws miExcepcion {
        
        if ((b*b-4*(a)*(c))>0) {
            System.out.printf("Sus raices son:\n%f    %f\n", ((-b + Math.sqrt((b*b)-4*(a*c)))/(2*a)),((-b - Math.sqrt((b*b)-4*(a*c)))/(2*a)));
        }
        else if (b*b-4*(a)*(c)<0){
            throw new miExcepcion();
        }
    }
}
