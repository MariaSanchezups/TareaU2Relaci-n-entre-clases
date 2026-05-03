package upspoomain;
import upspooejecucion.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello!");

        // Crear instancias de las subclases
        Pelicula peli= new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        peli.agregarActor(new Actor("Sam Worthington", 40));
        peli.agregarActor(new Actor("Zoe Saldana", 42));
        
        
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        
        Documental doc = new Documental("Cosmos", 45, "Science", "Astronomy");
        doc.agregarInvestigador(new Investigador("Carl Sagan", "Astronomia"));
        
        Podcast Podcast= new Podcast("La Cotorrisa",90,"Humor","Spotify", 370);
        Podcast.agregarInvitado(new Investigador("Eugenio Derbez", "Actor"));
        
        ObradeTeatro Obra= new ObradeTeatro ("Quien es Quien", 90, "Comedia", "Multitabaris");
        Obra.agregarActor(new Actor("Luis Brandoni",85));
        
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = peli;
        contenidos[1] = serie;
        contenidos[2] = doc;
        contenidos[3] = Podcast;
        contenidos[4] = Obra;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}