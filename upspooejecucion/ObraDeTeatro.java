package upspooejecucion;
import java.util.ArrayList;

public class ObraDeTeatro extends ContenidoAudiovisual{
	private String teatro;
	private ArrayList<Actor> actores = new ArrayList<>();
	
	public ObraDeTeatro(String titulo, int duracionEnMinutos, String genero, String teatro) {
		super(titulo, duracionEnMinutos, genero);
		this.teatro=teatro;
	}
	public String getTeatro() {
	    return teatro;
	}

	public ArrayList<Actor> getActores() {
	    return actores;
	}
    public void agregarActor(Actor a) {
    	actores.add(a);
    }
    @Override
    public void mostrarDetalles() {
    	System.out.println("Obra de Teatro:");
        mostrarDatosBase();

        System.out.println("Teatro: " + teatro);

        System.out.println("Actores:");
        for (Actor a : actores) {
            System.out.println(a);
        }
        System.out.println();
    }
}
