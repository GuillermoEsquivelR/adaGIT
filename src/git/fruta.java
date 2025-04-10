package git;

public class fruta {
	private String nombre;
	private String peso;
	private String color;
	   
	public fruta(String nombre, String peso, String color) {
		this.nombre = nombre;
		this.peso = peso;
		this.color = color;
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