package upspooejecucion;
	import java.util.ArrayList;

	public class Podcast extends ContenidoAudiovisual {

	 private String plataforma;
	 private int numeroEpisodios;
	 private ArrayList<Investigador> invitados = new ArrayList<>();

    public Podcast(String titulo, int duracionEnMinutos, String genero, String plataforma, 
    		int numeroEpisodios) {
	    super(titulo, duracionEnMinutos, genero);
	    this.plataforma = plataforma;
	    this.numeroEpisodios = numeroEpisodios;
	    }

	    public void agregarInvitado(Investigador i) {
	        invitados.add(i);
	    }
	    public String getPlataforma() {
	        return plataforma;
	    }

	    public int getNumeroEpisodios() {
	        return numeroEpisodios;
	    }

	    public ArrayList<Investigador> getInvitados() {
	        return invitados;
	    }
	    @Override
	    public void mostrarDetalles() {
	    	System.out.println("Podcast:");
	        mostrarDatosBase();

	        System.out.println("Plataforma: " + plataforma);
	        System.out.println("Episodios: " + numeroEpisodios);

	        System.out.println("Invitados:");
	        for (Investigador i : invitados) {
	            System.out.println(i);
	        }
	        System.out.println();  
	        
	    }
}

