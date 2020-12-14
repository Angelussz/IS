
public class UsuarioAdapterImpl implements UsuarioAdapter{
	private ServicioRestaurante servicio = new ServicioRestaurante();
	@Override
	public Usuario getUsuario(int reserva) {
		ReserInfo reser = servicio.darInfoReserva(reserva);
		Usuario usuario = new Usuario(reser.getReserva(),reser.getNombre(),reser.getMesa());
		return usuario;
		
	}
}
