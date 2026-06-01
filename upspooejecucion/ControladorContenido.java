package upspooejecucion;
import java.util.ArrayList;

public class ControladorContenido {
	private ArrayList<ContenidoAudiovisual> lista;
    private VistaConsola vista;

    public ControladorContenido(ArrayList<ContenidoAudiovisual> lista,
                                VistaConsola vista) {
        this.lista = lista;
        this.vista = vista;
    }

    public void mostrarTodo() {
        for (ContenidoAudiovisual c : lista) {
            c.mostrarDetalles();
        }
    }

    public void guardar() {
        ArchivoContenidoAudiovisual.guardarContenidos(lista, "contenidos.csv");
        vista.mostrarMensaje("Guardado exitoso");
    }

    public void leer() {
        lista = ArchivoContenidoAudiovisual.leerContenidos("contenidos.csv");
        vista.mostrarMensaje("Lectura exitosa");
    }

    public ArrayList<ContenidoAudiovisual> getLista() {
        return lista;
    }
}
