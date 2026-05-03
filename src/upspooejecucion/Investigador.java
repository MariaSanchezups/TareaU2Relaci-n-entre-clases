package upspooejecucion;

public class Investigador {
	 private String nombre;
	    private String especialidad;

	    public Investigador(String nombre, String especialidad) {
	        this.nombre = nombre;
	        this.especialidad = especialidad;
	    }
	    public String toString() {
	        return nombre + " - " + especialidad;
	    }

}
