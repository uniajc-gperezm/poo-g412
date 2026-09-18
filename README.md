# Proyecto de Programación Orientada a Objetos (POO) - Grupo G412

Repositorio colaborativo para la gestión de entidades de tipo Persona y sus relaciones en Java (`com.uniajc`).

---

## 📋 Descripción de las Clases

### 1. Clase `Persona`
La clase `Persona` modela la información básica y el comportamiento de un individuo, aplicando los principios de encapsulamiento (atributos privados y métodos públicos de acceso).

* **Atributos:**
  * `- String identificacion`
  * `- String nombre`
  * `- String apellido`
  * `- int edad`
  * `- String fechaNacimiento` (Formato: `AAAA-MM-DD`)

* **Métodos principales:**
  * Constructores (vacío, por ID, y completo con todos los atributos).
  * Getters y Setters para cada atributo.
  * `getNombreCompleto()`: Devuelve la unión del nombre y el apellido.
  * `calcularEdad()`: Calcula de forma automática la edad actual de la persona basándose en el año de su `fechaNacimiento` utilizando `java.time.LocalDate`.
  * `mostrarInformacion()`: Imprime en consola todos los datos de la persona de forma organizada.
  * `hablar()` y `caminar()`: Métodos de comportamiento de la entidad.

### 2. Clase `Direccion` (Clase adicional)
Clase complementaria diseñada para estructurar la ubicación de las personas.

* **Atributos:**
  * `- String calle`
  * `- String ciudad`
  * `- String pais`
* **Métodos:** Constructores y sus respectivos Getters y Setters.

---

## 📊 Diagrama de Clases UML (Mermaid)

El siguiente diagrama representa la estructura de las clases implementadas y su relación de asociación:

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
        + setNombre(String nombre) void
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
