public class Persona{
	private String nombre;
	private int telefono;
	private Mascota m;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setTel(int telefono){
		this.telefono = telefono;
	}
	public void setMascota(Mascota m){
		this.m = m;
	}

	public String getNombre(){
		return nombre;
	}

	public int getTel(){
		return telefono;
	}

	public String getM(){
		return m.getNombre();
	}

	public void  imprimirDatos(){
		System.out.println(getNombre()+ " "+ getTel() + " " + getM());
	}

}