public class Cebra extends Herbivoro implements Animal{
	public void jugar(){
		System.out.println("Soy una cebra");
		System.out.println("Estoy corriendo por la selva");
	}
	public void comidaFavorita(String c){
		System.out.println("Mi comida favorita es: "+c);
	}
	public void comer(Animal a){
		if(a instanceof Herbivoro){
			System.out.println("No lo puedo comer, es amigo");
		}else if(a instanceof Carnivoro){
			System.out.println("Comiendo al carnivoro");
		}

	}
}