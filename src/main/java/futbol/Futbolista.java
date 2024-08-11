package futbol;

public abstract class Futbolista implements Comparable<Object> {
	
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista() {
		this.edad = 30;
		this.nombre = "Maradona";
		this.posicion = "delantero";
	}

	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		
		if (f == null) {
			return false;
		}

		return this == f;
	}
	
	//Metodo abstracto
	public abstract boolean jugarConLasManos();
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

}
