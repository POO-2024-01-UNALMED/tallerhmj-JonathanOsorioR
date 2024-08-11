package futbol;

public class Portero extends Futbolista {
	
	public short golesRecibidos;
	public byte dorsal;

	public Portero() {
		// TODO Auto-generated constructor stub
	}

	public Portero(String nombre, int edad, short golesR, byte dorsal) {
		super(nombre, edad, "Portero");
		golesRecibidos = golesR;
		this.dorsal = dorsal;
		
	}

	@Override
	public int compareTo(Futbolista futbolista) {
		Portero portero = (Portero) futbolista;
		
		return Math.abs(this.golesRecibidos - portero.golesRecibidos);
	}

	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+
				" con el dorsal "+ dorsal + ". Le han marcado"+golesRecibidos;
	}
	
}
