<b>Descripció</b>

Nivel 1 --> Con JUnit

Ejercicio 1:
Creamos una clase que gestiona una colección de libros en una biblioteca. La classe permite añadir libros, recuperar la lista de libros, obtener un libro específico per su posición, añadir un libro en una posición específica y eliminar un libro por título.
Con JUnit, creamos los tests unitarios para comprobar que:
- La lista de libros no es nula después de crear un nuevo objeto.
- La lista tiene una dimensión esperada después de insertar diversos libros.
- La lista contiene un libro específico en su posición correcta.
- No hay títulos de libros duplicados en la lista
- Se puede recuperar el título de un libro dada una posición específica.
- Añadir un libro modifica correctamente la llista
- Eliminar un libro disminuye la dimensión de la lista.
- La lista permanece ordenada alfabèticamente tras añadir o eliminar un libro.

Ejercicio 2:
Se crea una clase para calcular la letra del DNI, recibiendo como parámetro el número de éste.
Se crea una clase de tests unitarios parametrizada para comprobar si el cálculo es correcto para una muestra de 10 números de DNI.

Ejercicio 3:
Se comprueba con JUnit que un método que lanza una ArrayIndexOutOfBoundsException funciona correctamente.

Nivel 2 --> con Assertj

Ejercicio 1:
Creamos una aserción que demuestra que el valor de dos objetos enteros es igual, i otra que indique que no lo es.

Ejercicio 2:
Creamos una aserción que demuestra que la referencia a un objeto es la misma que otra, y otra aserción que indique que es diferente.

Ejercicio 3:
Una aserción que indique que dos arrays de enteros son idénticos.

Ejercicio 4:
A partir de un ArrayList de objetos varios, creamos varias aserciones para comprobar que:
- Los objetos están insertados en el orden correcto
- Los objetos están insertados en cualquier orden
- Un objeto sólo se ha insertado una vez
- Un objeto no se ha insertado en el contenedor

Nivel 2 - Ejercicio 5:
Creamos un map y comprobamos que contiene una de las claves que le hemos añadido

Nivel 2 - Ejercicio 6:
Validamos con una aserción que se dispara una ArrayIndexOutOfBoundsException en un método

Nivel 2 - Ejercicio 7:
Validamos con una aserción que un objeto Optional vacío realmente está vacío.

---------------------------------  
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.2, Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2. Proyecto built con Maven.

Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/1.04_JavaLanguage_Sprint1_Task4.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.
La ejecución de los tests unitarios requiere las dependencias indicadas en el .pom de Maven.

Contribuciones:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/1.01_JavaLanguage_Sprint1_Task1
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
