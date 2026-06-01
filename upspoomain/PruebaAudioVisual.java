package upspoomain;
import java.util.ArrayList;
import java.util.Scanner;
import upspooejecucion.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        
		ArrayList<ContenidoAudiovisual> lista = new ArrayList<>();

        Pelicula peli = new Pelicula("Avatar",125,"Accion","20th Century Studios");
        SerieDeTV serie = new SerieDeTV("Game of Thrones",60,"Fantasy",8);
        Documental doc = new Documental("Cosmos",45,"Science","Astronomy");
        Podcast podcast = new Podcast("La Cotorrisa",90,"Humor","Spotify",370);
        ObraDeTeatro obra = new ObraDeTeatro("Quien es Quien",90,"Comedia","Multitabaris");

        lista.add(peli);
        lista.add(serie);
        lista.add(doc);
        lista.add(podcast);
        lista.add(obra);

        // ===== MVC =====
        VistaConsola vista = new VistaConsola();
        ControladorContenido controller = new ControladorContenido(lista, vista);

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            vista.mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    controller.mostrarTodo();
                    break;

                case 2:
                    controller.guardar();
                    break;

                case 3:
                    controller.leer();
                    break;

                case 4:
                    vista.mostrarMensaje("Saliendo...");
                    break;
            }

        } while (opcion != 4);

    }
}