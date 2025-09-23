package unlam.edu.ar.pb2;

public enum MenuEstacionamiento {

	INGRESO_VEHICULOS("0 - Ingresar un vehículo"),UBICAR_VEHICULO("1 - Buscar un vehículo"), RETIRAR_VEHICULO("2 - Retirar un vehículo"), SALIR("3 - Salir");
	
	private String texto;
	
	private MenuEstacionamiento(String textoInicial) {
		this.texto=textoInicial;
	}
	
	public String toString() {
		return texto;
	}
}
