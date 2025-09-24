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
	
	public Coche encontraCoche(String patente) {
		Coche buscado = null;
		for(int i=0; i<cocheras.length;i++) {
			for(int j=0;j<cocheras[i].length;j++) {
				if(cocheras[i][j]!=null && cocheras[i][j].getPatente().equals(patente)) {
					buscado = cocheras[i][j];
					break;
				}
			}
		}
		return buscado;
	}
	
	public boolean retirarCoche(String patente) {
		for(int i=0; i<cocheras.length;i++) {
			for(int j=0;j<cocheras[i].length;j++) {
		if(cocheras[i][j]!=null && cocheras[i][j].getPatente().equals(patente)) {
			cocheras[i][j] = null;
			return true;
		}
			}
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	

}
