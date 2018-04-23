public class Zoologico{
	public static void main(String[] args) {
		Leon l = new Leon();
		Cebra c = new Cebra();
		Hiena h = new Hiena();
		
		l.comidaFavorita("carne");
		l.jugar();
		System.out.println();

		c.comidaFavorita("pasto");
		c.jugar();

		System.out.println();

		l.comer(c);
		c.comer(l);
		h.comer(l);

	}
}
