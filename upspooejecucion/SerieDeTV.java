/**
 * Class SerieDeTV
 */
package upspooejecucion;
import java.util.ArrayList;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas = new ArrayList<>();
    public void agregarTemporada(Temporada t) {
    	listaTemporadas.add(t);
    }
     
    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public ArrayList<Temporada> getListaTemporada() {
    	return listaTemporadas;
    }	
    @Override
    public void mostrarDetalles() {
    	System.out.println("Detalles de la serie:");
        mostrarDatosBase();

        System.out.println("Temporadas: " + temporadas);

        for (Temporada t : listaTemporadas) {
            System.out.println(t);
        }
        System.out.println();
        }
        
    
}