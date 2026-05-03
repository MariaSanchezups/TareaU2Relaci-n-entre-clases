package upspooejecucion;
import java.util.ArrayList;

public class ObradeTeatro extends ContenidoAudiovisual{
	private String teatro;
	private ArrayList<Actor> actores = new ArrayList<>();
	
	public ObradeTeatro(String titulo, int duracionEnMinutos, String genero, String teatro) {
		super(titulo, duracionEnMinutos, genero);
		this.teatro=teatro;
	}
    public void agregarActor(Actor a) {
    	actores.add(a);
    }
    public void mostrarDetalles() {
    	System.out.println("Obra de Teatro:");
    	System.out.println("Titulo:" + getTitulo());
    	System.out.println("Teatro:" + teatro);
    	
    	System.out.println("Actores:");
    	for (Actor a: actores) {
    		System.out.println(a);
    	}
    }
}
