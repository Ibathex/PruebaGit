
public class Monstruo implements FabricaRanger {

	private String nombre;
	private String elementoPrimario;
	private int edad;
	private String color;
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getElementoPrimario() {
		return elementoPrimario;
	}


	public void setElementoPrimario(String elementoPrimario) {
		this.elementoPrimario = elementoPrimario;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public boolean apilar() {
		
		return false;
	}

	
	public boolean desapilar() {
		
		return false;
	}

	
	public boolean encolar() {
		
		return false;
	}

	
	public boolean desencolar() {
		
		return false;
	}

	
	public Monstruo fabricar() {
		
		return null;
	}

}
