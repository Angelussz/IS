
public class Usuario {
	private int reserva;
	private String nombre;
	private int mesa;
	
	public Usuario(int reserva,String nombre,int mesa) {
		this.reserva = reserva;
		this.nombre = nombre;
		this.mesa = mesa;
	}
	public int getreserva(){
		return reserva;
	}
	public String getNombre() {
		return nombre;
	}
	public int getMesa() {
		return mesa;
	}
}
