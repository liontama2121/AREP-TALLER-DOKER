# TAREA INTRODUCCIÓN MVN-GITY HEROKU

>La tarea costa en 
## Pre-requisitos

> Para  elaborar este proyecto requerimos de las siguientes tecnologias:
> * [Maven](https://es.wikipedia.org/wiki/Maven): Herramienta la cual permite realizar la construción de proyectos, realizarles pruebas y otras funciones.
> * [Git](https://es.wikipedia.org/wiki/Git): Software de control de versionamiento centralizado.
> * [Mongo](https://es.wikipedia.org/wiki/Heroku): Heroku es una plataforma como servicio (PaaS) de computación en la Nube que soporta distintos lenguajes de programación.

## Instalación
>
> Antes de bajar el repositorio debemos saber que para visualizar correctamente el contenido de lo ```JSON``` que seran retornados es necesario instalar una extension, esta varia dependiendo del navegador y se encuentran a continación:
>
> > [Google Chrome visualizador JSON](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh/related)
> > [Microsoft Edge visualizador JSON](https://chrome.google.com/webstore/detail/json-viewer/gbmdgpbipfallnflgajpaliibnhdgobh/related)
> > [Mozilla Firefox visualizador JSON](https://addons.mozilla.org/es/firefox/addon/json-lite/)
>
> Ahora clonamos este repositario desde ```cmd```, con el siguiente comando
>
> ```
> git clone > git clone https://github.com/liontama2121/TALLER1_MOLINA

> ```
> 
> Despues accedemos a la carpeta con el comando
> 
> ```
> cd Taller_Spark_heroku
> ```
> 
> Finalmente realizamos la construcción de nuestro proyecto en ```mvn``` con el siguiente comando
> ```
> mvn package
> ```

## Pruebas con ClientTest
>
> Teniendo las el proceso de instalación completo, ahora podemos proceder a realizar nuestras pruebas locales, en nuestro caso seran ejecudo por medio de nuestro ```ClientTest``` y las podemos ejecutar del siguiente modo:
>
> > Ejecutar prueba de igualdad entre el contenido de lo que obtiene nuestro servicio ```Heroku``` en la consulta a ```Alpha ventage API``` y la consulta directa a ```Alpha ventage API```, ambos siendo consultados a IBM como es por defecto en nuestro caso.
> >
> > ```
> > mvn test -Dtest=TestClient#PruebaIgualHerokuAlphaIBMVSAlphaIBM test
> > ```
> >
> > Ejecutar prueba de desigualdad entre el contenido de lo que obtiene nuestro servicio ```Heroku``` en la consulta a ```Alpha ventage API``` hacia Microsoft y la consulta directa a ```Alpha ventage API``` hacia IMB.
> >
> > ```
> > mvn test -Dtest=TestClient#PruebaDiferenteHerokuAlphaIBMVSAlphaMSTF test
> > ```
> >
> > Ejecutar prueba de igualdad entre el contenido de lo que obtiene nuestro servicio ```Heroku``` en la consulta a ```Alpha ventage API``` hacia Google y la consulta directa a ```Alpha ventage API``` hacia Google también.
> >
> > ```
> > mvn test -Dtest=TestClient#PruebaIgualHerokuAlphaGOOGVSAlphaGOOG test
> > ```
> >
> > Ejecutar prueba de igualdad entre el contenido de lo que obtiene nuestro servicio ```Heroku``` en la consulta a ```Iex Cloud API``` y la consulta directa a ```Iex Cloud API``` ambas con stock como ```aapl```.
> >
> > ```
> > mvn test -Dtest=TestClient#PruebaIgualHerokuIEXvsIEX test
> > ```
> >
> > Ejecutar todas las pruebas del cliente
> >
> > ```
> > mvn test -Dtest=TestClient

### Despliegue web con Heroku y JSClient
> Para desplegar el programa directamente desde el servicio de ```Heroku``` junto con nuestro cliente ```JSClient``` podemos pulsar el siguiente boton.
>
> [![](/image/deploy.PNG)](https://tallermolina.herokuapp.com/JSClient)

## Construido con

* [Maven](https://es.wikipedia.org/wiki/Maven): Herramienta la cual permite realizar la construción de proyectos, realizarles pruebas y otras funciones.
* [Git](https://es.wikipedia.org/wiki/Git): Software de control de versionamiento centralizado.
* [Heroku](https://es.wikipedia.org/wiki/Heroku): Heroku es una plataforma como servicio (PaaS) de computación en la Nube que soporta distintos lenguajes de programación.
* [Intelij](https://es.wikipedia.org/wiki/IntelliJ_IDEA): es un entorno de desarrollo integrado (IDE) para el desarrollo de programas informáticos. Es desarrollado por JetBrains, y está disponible en dos ediciones: edición para la comunidad1 y edición comercial.
* [Java](https://www.oracle.com/java/): Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.
* [Spark Web](https://es.wikipedia.org/wiki/Spark_Framework): Es un conjunto de librerías para el desarrollo de aplicaciones web en Java inspirado en el framework Sinatra para Ruby.
* [Html](https://desarrolloweb.com/home/html): Es un lenguaje de marcación que sirve para definir el contenido de las páginas web. Se compone en base a etiquetas, también llamadas marcas o tags, con las cuales conseguimos expresar las partes de un documento, cabecera, cuerpo, encabezados, párrafos, etc.
* [Bootstrap](https://es.wikipedia.org/wiki/Bootstrap_(framework)): Es una biblioteca multiplataforma o conjunto de herramientas de código abierto para diseño de sitios y aplicaciones web. Contiene plantillas de diseño con tipografía, formularios, botones, cuadros, menús de navegación y otros elementos de diseño basado en HTML y CSS, así como extensiones de JavaScript adicionales.
* [Java Script](https://es.wikipedia.org/wiki/JavaScript): Es un lenguaje de programación interpretado, dialecto del estándar ECMAScript. Se define como orientado a objetos, basado en prototipos, imperativo, débilmente tipado y dinámico.

## Autor
[Juan Camilo Molina Leon ](https://github.com/liontama2121)

## Licencia & Derechos de Autor
**©** Juan Camilo Molina Leon, Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito


