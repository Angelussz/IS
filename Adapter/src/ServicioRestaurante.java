
public class ServicioRestaurante {
	public ReserInfo darInfoReserva(int numreser) {
		if(numreser == 1) {
			return new ReserInfo(numreser,"Pedro",4);
		}
		else if(numreser == 2) {
			return new ReserInfo(numreser,"Juan",8);
		}
		else {
			return null;
		}
	}
}
