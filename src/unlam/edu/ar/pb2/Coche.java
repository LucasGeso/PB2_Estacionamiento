package unlam.edu.ar.pb2;

import java.util.Objects;

public class Coche {
	private String marca;
	private String patente;
	
	public Coche(String marca, String patente) {
		this.marca = marca;
		this.patente = patente.toUpperCase();
	}

	public String getPatente() {
		return patente;
	}
	
	public String getMarca() {
		return marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(patente, other.patente);
	}
	
	

}
