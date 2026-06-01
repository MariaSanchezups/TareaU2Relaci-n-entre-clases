# Sistema de Contenido Audiovisual

## Descripción

Este proyecto fue desarrollado en Java utilizando Programación Orientada a Objetos. El sistema permite gestionar diferentes tipos de contenidos audiovisuales como películas, series de televisión, documentales, podcasts y obras de teatro.

Durante el desarrollo se implementaron mejoras mediante refactorización, principios SOLID, manejo de archivos CSV, patrón MVC y pruebas unitarias con JUnit.

---

## Funcionalidades

* Gestión de contenidos audiovisuales.
* Uso de herencia y polimorfismo.
* Lectura de datos desde archivos CSV.
* Escritura de datos en archivos CSV.
* Menú interactivo en consola.
* Aplicación del patrón MVC.
* Pruebas unitarias con JUnit 5.

---

## Estructura del Proyecto

### Modelo (Model)

Clases que representan las entidades del sistema:

* ContenidoAudiovisual
* Pelicula
* SerieDeTV
* Documental
* Podcast
* ObradeTeatro
* Actor
* Investigador
* Temporada

### Vista (View)

* VistaConsola

Responsable de la interacción con el usuario mediante la consola.

### Controlador (Controller)

* ControladorContenido

Gestiona la comunicación entre el modelo y la vista.

### Persistencia

* ArchivoContenidoAudiovisual

Permite guardar y leer información desde archivos CSV.

### Pruebas

Clases de prueba desarrolladas con JUnit 5 ubicadas en la carpeta test.

---

## Principios SOLID Aplicados

### SRP (Single Responsibility Principle)

Cada clase tiene una única responsabilidad específica.

### OCP (Open/Closed Principle)

El sistema permite agregar nuevos tipos de contenido sin modificar las clases existentes.

### LSP (Liskov Substitution Principle)

Las subclases pueden utilizarse como objetos de tipo ContenidoAudiovisual.

### ISP (Interface Segregation Principle)

Las clases implementan únicamente los métodos necesarios para su funcionamiento.

### DIP (Dependency Inversion Principle)

Se trabaja principalmente con abstracciones como ContenidoAudiovisual.

---

## Patrón MVC

El sistema implementa el patrón Modelo-Vista-Controlador:

* Modelo: entidades del sistema.
* Vista: interfaz en consola.
* Controlador: lógica de coordinación entre modelo y vista.

---

## Ejecución del Proyecto

1. Clonar el repositorio.
2. Importar el proyecto en Eclipse.
3. Ejecutar la clase:

PruebaAudioVisual.java

4. Utilizar el menú mostrado en consola.

---

## Ejecución de las Pruebas

1. Abrir la carpeta de pruebas.
2. Seleccionar una clase de prueba.
3. Ejecutar:

Run As → JUnit Test

4. Verificar que todas las pruebas finalicen correctamente.

---

## Autor

Mae Sánchez
# Código limpio a Contenido Audiovisual

## Descripción

Este proyecto fue desarrollado en Java utilizando Programación Orientada a Objetos. El sistema permite gestionar diferentes tipos de contenidos audiovisuales como películas, series de televisión, documentales, podcasts y obras de teatro.

Durante el desarrollo se implementaron mejoras mediante refactorización, principios SOLID, manejo de archivos CSV, patrón MVC y pruebas unitarias con JUnit.

---

## Funcionalidades

* Gestión de contenidos audiovisuales.
* Uso de herencia y polimorfismo.
* Lectura de datos desde archivos CSV.
* Escritura de datos en archivos CSV.
* Menú interactivo en consola.
* Aplicación del patrón MVC.
* Pruebas unitarias con JUnit 5.

---

## Estructura del Proyecto

### Modelo (Model)

Clases que representan las entidades del sistema:

* ContenidoAudiovisual
* Pelicula
* SerieDeTV
* Documental
* Podcast
* ObradeTeatro
* Actor
* Investigador
* Temporada

### Vista (View)

* VistaConsola

Responsable de la interacción con el usuario mediante la consola.

### Controlador (Controller)

* ControladorContenido

Gestiona la comunicación entre el modelo y la vista.

### Persistencia

* ArchivoContenidoAudiovisual

Permite guardar y leer información desde archivos CSV.

### Pruebas

Clases de prueba desarrolladas con JUnit 5 ubicadas en la carpeta test.

---

## Principios SOLID Aplicados

### SRP (Single Responsibility Principle)

Cada clase tiene una única responsabilidad específica.

### OCP (Open/Closed Principle)

El sistema permite agregar nuevos tipos de contenido sin modificar las clases existentes.

### LSP (Liskov Substitution Principle)

Las subclases pueden utilizarse como objetos de tipo ContenidoAudiovisual.

### ISP (Interface Segregation Principle)

Las clases implementan únicamente los métodos necesarios para su funcionamiento.

### DIP (Dependency Inversion Principle)

Se trabaja principalmente con abstracciones como ContenidoAudiovisual.

---

## Patrón MVC

El sistema implementa el patrón Modelo-Vista-Controlador:

* Modelo: entidades del sistema.
* Vista: interfaz en consola.
* Controlador: lógica de coordinación entre modelo y vista.

---

## Ejecución del Proyecto

1. Clonar el repositorio.
2. Importar el proyecto en Eclipse.
3. Ejecutar la clase:

PruebaAudioVisual.java

4. Utilizar el menú mostrado en consola.

---

## Ejecución de las Pruebas

1. Abrir la carpeta de pruebas.
2. Seleccionar una clase de prueba.
3. Ejecutar:

Run As → JUnit Test

4. Verificar que todas las pruebas finalicen correctamente.

---

##
