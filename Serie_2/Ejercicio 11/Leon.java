public class Leon extends Carnivoro implements Animal{
	public void comidaFavorita(String c){
		System.out.println("Sou un león");	
		System.out.println("Mi comida comida favorita es: "+c);
	}
	public void jugar(){
		System.out.println("Estoy corriendo en la sabana");
	}
	public void comer(Animal a){
		if(a instanceof Carnivoro){
			System.out.println("No lo puedo comer, es amigo");
		}else if(a instanceof Herbivoro){
			System.out.println("Comiendo al herbívoro");
		}

	}
}

