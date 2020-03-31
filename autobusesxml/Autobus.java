package autobusesxml;

public class Autobus {
	private String nombre,salida,llegada;

	public Autobus(String nombre, String salida, String llegada) {
		super();
		this.nombre = nombre;
		this.salida = salida;
		this.llegada = llegada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	public String getLlegada() {
		return llegada;
	}

	public void setLlegada(String llegada) {
		this.llegada = llegada;
	}
	
}
