# TareaU2Relaci-n-entre-clases

Ampliación de Contenido Audiovisual

Este proyecto consiste en una aplicación desarrollada en Java que permite gestionar diferentes tipos de contenido audiovisual, como películas, series de televisión y documentales.

Objetivos:
Implementar un sistema basado en POO en Java.
Aplicar relaciones entre clases (herencia, asociación, agregación y composición).
Gestionar distintos tipos de contenido audiovisual.

Clases:

Las clases principales que se dieron en el código base son: ContenidoAudiovisual, Pelicula, SerieDeTV y Documental (+ la clase Main encargada de mostrar como se ejecuta correctamente el sistema).

Nos piden que agregemos tres clases más: Actor,Temporada e Investigador.
Y aparte dos nuevas subclases a nuestro criterio, en mi caso: Podcast y Obra de Teatro. 

Relación entre Clases:

Herencia:
Pelicula, SerieDeTV, Documental, Podcast y ObraTeatral heredan de ContenidoAudiovisual.

Agregación:
Pelicula → Actor
ObraTeatral → Actor

Composición:
SerieDeTV → Temporada

Asociación:
Documental → Investigador
Podcast → Investigador (En el informe se detallara más este tema).

En lo que corresponde a instrucciones de uso usted debe:

Clonar el repositorio
git clone https://github.com/MariaSanchezups/TareaU2Relaci-n-entre-clases.git
Ejecutar el proyecto, Abrir el proyecto en Eclipse.
Ubicar la clase PruebaAudioVisual la cual es el metodo main y ejecutarlo.

Estructura del Proyecto:

Project name: ups,poo,relacion entre clases

src contiene dos packages

1. upspoomain el cual contiene: PruebaAudiovisual.java (main)
2. upspooejecucion este contiene: ContenidoAudiovisual.java, Pelicula.java, SerieDeTV.java, Documental.java, Actor.java, Temporada.java, Investigador.java, Podcast.java, ObraTeatral.java

:)

