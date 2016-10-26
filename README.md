# Ejercicios Test Doubles con EasyMock

En este ejercicio vamos a trabajar el concepto de los *Test Doubles* utilizando la biblioteca EasyMock.

El punto de partida es un proyecto que contiene una clase principal `CustomerFacade` que queremos testear. Esta clase depende de la interfaz `CustomerDAO`, de la cual no tenemos una implementación, por lo que deberemos crear un *test double* para sustituirla. Concretamente, crearemos un *mock* utilizando la biblioteca EasyMock.

Como ayuda y complemento a este ejercicio, es recomendable leer la [Guía de Usuario de EasyMock](http://easymock.org/user-guide.html).

## Preparación
Empieza el ejercicio clonando el repositorio del proyecto. Para ello, ejecuta:
```
git clone http://sing.ei.uvigo.es/dt/gitlab/dgss-1617/test-doubles.git
```

A continuación, puedes importar el proyecto en Eclipse del mismo modo que hemos visto en ejercicios anteriores.

## Ejercicio
El objetivos principal de este ejercicio es completar el caso de prueba `CustomerFacadeTest`. Verás que esta clase incluye todos los tests necesarios para evaluar `CustomerFacade`, pero que, al no disponer de una implementación de `CustomerDAO`, estas pruebas no están realmente completas.

Deberás crear los *mocks* que sean necesarios para completar los casos de prueba. Para ello, utiliza la biblioteca EasyMock.

Es importante que te fijes en la documentación Javadoc de cada método para saber qué es lo que hace o que debería hacer. Si quieres verla en formato HTML, puedes ejecutar el comando `mvn javadoc:javadoc` y abrir el fichero `target/site/apidocs/index.html`.

En este ejercicio **solo se puede modificar la clase `CustomerFacadeTest`**. El resto de clases están completas, por lo que no deben ser modificadas.

## Utilidades
Este ejercicio incluye las siguientes clases de utilidad para realizar los tests:
* `CustomerDataset`: Contiene un conjunto de datos que podría estar almacenado en la base de datos. Facilita la creación de entidades para los tests.
* `IsEqualsToCustomer`: *Matcher* de Hamcrest que compara dos entidades `Customer` o dos `Iterable` de `Customer` sin tener en cuenta el orden.
