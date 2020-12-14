
public class Cliente {

	public static void main(String[] args) {
		UsuarioAdapterImpl adapter = new UsuarioAdapterImpl();
		Usuario user = adapter.getUsuario(1);
		System.out.println(user.getreserva());
		System.out.println(user.getNombre());
		System.out.println(user.getMesa());
	}

}
