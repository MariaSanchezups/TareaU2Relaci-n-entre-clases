package upspooejecucion;

public class Temporada { 
	 private int numeroTemporada;
	    private int episodios;

	    public Temporada(int numeroTemporada, int episodios) {
	        this.numeroTemporada = numeroTemporada;
	        this.episodios = episodios;
	    }

	    @Override
	    public String toString() {
	        return "Temporada " + numeroTemporada + 
	               " - Episodios: " + episodios;
	    }

}
