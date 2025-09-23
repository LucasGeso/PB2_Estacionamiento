package unlam.edu.ar.pb2;

public class Estacionamiento {
	private String nombre;
	private Coche[][] cocheras;
	
	public Estacionamiento(String nombre, int fila, int columna) {
		this.nombre = nombre;
		this.cocheras = new Coche[fila][columna];
	}
	
	public boolean agregarUnCoche(Coche nuevo) {
		for(int i=0; i<cocheras.length;i++) {
			for(int j=0;j<cocheras[i].length;j++) {
				if(cocheras[i][j]==null) {
					cocheras[i][j] = nuevo;
					return true;
				}
			}
		}
		return false;
	}
	
	public String encontraCoche(String patente) {
		String cadena = "";
		for(int i=0; i<cocheras.length;i++) {
			for(int j=0;j<cocheras[i].length;j++) {
				if(cocheras[i][j]!=null && cocheras[i][j].getPatente().equals(patente)) {
					cadena = "Fila:" + i + "Columna: " + j;
					break;
				}
			}
		}
		return cadena;
	}
	
	public boolean retirarCoche(String patente, int fila, int columna) {
		if(cocheras[fila][columna]!=null && cocheras[fila][columna].getPatente().equals(patente)) {
			cocheras[fila][columna] = null;
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	

}
