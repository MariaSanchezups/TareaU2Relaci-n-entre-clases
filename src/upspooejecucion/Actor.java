package upspooejecucion;

public class Actor { 
	 private String nombre;
	    private int edad;

	    public Actor(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	    public String toString() {
	        return nombre + " (" + edad + " años)";
	    }

}
