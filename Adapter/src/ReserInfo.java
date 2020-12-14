
public class ReserInfo {
	private int numreser;
	private String nombre;
	private int mesa;
	
	public ReserInfo(int numreser, String nombre, int mesa) {
		this.numreser = numreser;
		this.nombre = nombre;
		this.mesa = mesa;
	}
	public int getReserva() {
		return numreser;
	}
	public String getNombre() {
		return nombre;
	}
	public int getMesa() {
		return mesa;
	}
}
