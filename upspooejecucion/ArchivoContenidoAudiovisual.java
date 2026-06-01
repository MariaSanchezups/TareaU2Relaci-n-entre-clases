package upspooejecucion;
import java.util.ArrayList;
import java.io.*;

public class ArchivoContenidoAudiovisual {
     public static void guardarContenidos(
    		 ArrayList<ContenidoAudiovisual>contenidos, String ruta) {
    
   try (BufferedWriter bw= new BufferedWriter(new FileWriter(ruta))){
    	 
     for (ContenidoAudiovisual c: contenidos) {
    	 if (c instanceof Pelicula) {
    		Pelicula p= (Pelicula) c;
    			
    	bw.write("PELICULA," + p.getTitulo() + "," + 
        p.getDuracionEnMinutos() + "," + p.getGenero() + "," +
    	p.getEstudio());
    			
     } else if (c instanceof SerieDeTV) {
    	SerieDeTV s= (SerieDeTV) c;
    			 
        bw.write("SERIE," + s.getTitulo() + "," + s.getDuracionEnMinutos()
        + "," + s.getGenero() + "," + s.getTemporadas());
    			 
     } else if (c instanceof Documental) {
    	 Documental d= (Documental) c;
    	 
    	bw.write("DOCUMENTAL,"+ d.getTitulo() + "," + d.getDuracionEnMinutos()
    	+ "," + d.getGenero() + "," + d.getTema());
    	 
     }else if (c instanceof Podcast) {
    	 Podcast p=(Podcast)c;
    	 
    	bw.write("PODCAST," + p.getTitulo() + "," + p.getDuracionEnMinutos()
    	+ "," + p.getGenero() + "," + p.getPlataforma() + "," + p.getNumeroEpisodios());
    	
     } else if (c instanceof ObraDeTeatro) {
    	 ObraDeTeatro o=(ObraDeTeatro)c;
    	 
    	bw.write("OBRA," + o.getTitulo() + "," + o.getDuracionEnMinutos() 
        + "," + o.getGenero() + "," + o.getTeatro());
    	 
     }
    	bw.newLine();
    	 	
    }
     
     } catch(IOException e){
    	 e.printStackTrace();
    	 
     }
  
   }
     public static ArrayList<ContenidoAudiovisual> leerContenidos( String ruta) {
	
     ArrayList<ContenidoAudiovisual> lista= new ArrayList<>();
     
     try (BufferedReader br= new BufferedReader(new FileReader(ruta))){
    	 
    	 String linea;
    	 
    	 while ((linea=br.readLine())!=null){
    		 String[]datos= linea.split(",");
    		 
    		 switch (datos[0]) {
    		  
     case "PELICULA":
    	 lista.add( new Pelicula(
    			 datos[1],
    			 Integer.parseInt(datos[2]),
                 datos[3],
                 datos[4]));
                 break;
                 
     case "SERIE":
    	 lista.add( new SerieDeTV(
    			 datos[1],
    			 Integer.parseInt(datos[2]),
    			 datos[3],
    			 Integer.parseInt(datos[4])));
    	         break;
    	         
     case "PODCAST":
    	 lista.add(new Podcast(
                 datos[1],
                 Integer.parseInt(datos[2]),
                 datos[3],
                 datos[4],
    	         Integer.parseInt(datos[5])));
                 break;
     case "OBRA":
    	 lista.add(new ObraDeTeatro(
                 datos[1],
                 Integer.parseInt(datos[2]),
                 datos[3],
                 datos[4]));
                 break;
          }
     }
    	 
  } catch (IOException e) {
	  System.out.println("Error al leer archivo");
  }
   	return lista;
    }
     
}
