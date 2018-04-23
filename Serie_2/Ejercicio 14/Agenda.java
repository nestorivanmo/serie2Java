import java.util.Scanner;
import java.util.ArrayList;

public class Agenda{

	ArrayList<Persona> agenda = new ArrayList<Persona>();

	public void guardarPersonas(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de personas a agregar ");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++){

			System.out.println("Persona #"+(i+1));
			Persona p = new Persona();
			System.out.print("Nombre persona: ");
			p.setNombre(sc.next());
			System.out.println();
			System.out.print("Telefono persona: ");
			p.setTel(sc.nextInt());
			System.out.println();
			System.out.print("Nombre mascota: ");
			Mascota m = new Mascota(sc.next());
			p.setMascota(m);
			agenda.add(p);

		}
	}

	public void agregarPersona(Persona pers){
		agenda.add(pers);
	}
	
	public void borrarPers(int num){
		agenda.remove(num);
	}

	public void borrarTodo(){
		
                         
        
	}

	public void buscarPers(){

		Boolean encontro = false;

		Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese el nombre de la persona que desea buscar: ");
          String nombrep=sc.next();
               
    
                    for (int  i = 0; i < agenda.size(); i++) {
                        if(nombrep.equals(agenda.get(i).getNombre())){
                        	encontro = true;
                            System.out.println("Se encontró la persona buscada...");
                            System.out.println(agenda.get(i).getNombre());
                            System.out.println(agenda.get(i).getTel());
                            System.out.println(agenda.get(i).getM());
                            break;
                        }
                       
                     }

                     if(!encontro){
                     	System.out.println("No se encontró la persona buscada");
                     }
	
                     
	}


	public void listar(){
		for (int  i = 0; i < agenda.size(); i++) {
                        
                            System.out.println("Número pers: " + (i+1));
                            System.out.println(agenda.get(i).getNombre());
                            System.out.println(agenda.get(i).getTel());
                           	System.out.println(agenda.get(i).getM());
                            
                        
                       
        }
	}
}