package git;

public class nodo {
	private String nombre;
	private String peso;
	private String color;
	   public nodo siguiente;
	   public nodo anterior;
	   
	public nodo(String nombre, String peso, String color, nodo siguiente, nodo anterior) {
		this.nombre = nombre;
		this.peso = peso;
		this.color = color;
		this.siguiente = null;
		this.anterior = null;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}