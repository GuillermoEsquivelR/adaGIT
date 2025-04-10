package git;

public class fruta {
	private String nombre;
	private String peso;
	private String color;
	   public fruta siguiente;
	   public fruta anterior;
	   
	public fruta(String nombre, String peso, String color, fruta siguiente, fruta anterior) {
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