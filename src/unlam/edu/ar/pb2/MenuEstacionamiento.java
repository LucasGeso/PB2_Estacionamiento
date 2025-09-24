package unlam.edu.ar.pb2;

public enum MenuEstacionamiento {

	INGRESO_VEHICULOS("1 - Ingresar un vehículo"),UBICAR_VEHICULO("2 - Buscar un vehículo"), RETIRAR_VEHICULO("3 - Retirar un vehículo"), SALIR("4 - Salir");
	
	private String texto;
	
	private MenuEstacionamiento(String textoInicial) {
		this.texto=textoInicial;
	}
	
	public String toString() {
		return texto;
	}
}
