# Proyecto de Programación Orientada a Objetos (POO) - Grupo G412

Repositorio colaborativo para la gestión de entidades de tipo Persona, manejo de nombres completos, cálculo automático de edad y control de ubicaciones en Java (`com.uniajc`).

---

## 📋 Descripción de las Clases

### 1. Clase `Persona`
La clase `Persona` modela la información principal de un individuo, incorporando el manejo de apellidos, validación de fechas y el cálculo dinámico de la edad.

* **Atributos:**
  * `- String identificacion`
  * `- String nombre`
  * `- String apellido`
  * `- int edad`
  * `- String fechaNacimiento` (Formato de texto: `AAAA-MM-DD`)

* **Métodos principales:**
  * Constructores (vacío, por ID, y completo con todos los atributos).
  * Getters y Setters para todos los atributos (incluyendo apellido).
  * `getNombreCompleto()`: Devuelve la unión del nombre y el apellido.
  * `calcularEdad()`: Evalúa de forma segura mediante un condicional si la fecha de nacimiento existe y calcula el año actual restándole el año de nacimiento (`java.time.LocalDate.now().getYear()`). Retorna la edad calculada o un valor por defecto.
  * `mostrarInformacion()`: Imprime por consola de manera ordenada todos los datos de la persona.
  * `hablar()` y `caminar()`: Métodos de comportamiento de la entidad.

### 2. Clase `Direccion` (Clase adicional)
Clase complementaria creada para estructurar los datos geográficos de los usuarios.

* **Atributos:**
  * `- String calle`
  * `- String ciudad`
  * `- String pais`
* **Métodos:** Constructores, Getters y Setters para el encapsulamiento.

---

## 📊 Diagrama de Clases UML (Mermaid)

El siguiente diagrama representa la estructura de las clases y su relación de asociación dentro del proyecto:

```mermaid
classDiagram
    class Persona {
        - String identificacion
        - String nombre
        - String apellido
        - int edad
        - String fechaNacimiento
        + Persona()
        + Persona(String id)
        + Persona(String id, String nombre, String apellido, int edad, String fechaNacimiento)
        + getIdentificacion() String
        + setIdentificacion(String id) void
        + getNombre() String
        + setNombre(String name) void
        + getApellido() String
        + setApellido(String apellido) void
        + getEdad() int
        + setEdad(int edad) void
        + getFechaNacimiento() String
        + setFechaNacimiento(String fecha) void
        + getNombreCompleto() String
        + calcularEdad() int
        + mostrarInformacion() void
        + hablar() String
    }

    class Direccion {
        - String calle
        - String ciudad
        - String pais
        + Direccion(String calle, String ciudad, String pais)
        + getCalle() String
        + setCalle(String calle) void
        + getCiudad() String
        + setCiudad(String ciudad) void
        + getPais() String
        + setPais(String pais) void
    }

    Persona ..> Direccion : usa / asocia

En este caso, el diagrama de `Persona` refleja encapsulamiento: sus atributos
son privados y se accede a ellos mediante métodos públicos, mientras que
`caminar` permanece disponible únicamente dentro de la clase.
