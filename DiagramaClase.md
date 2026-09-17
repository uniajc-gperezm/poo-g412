# Diagrama de clases UML: `Persona` y `Estudiante`
## Eva Maria Diaz

El siguiente diagrama representa la clase `Persona` definida en
`src/main/java/com/uniajc/Persona.java`y la clase `Estudiante` definida en `src/main/java/com/uniajc/Estudiante.java`

### Versión Mermaid

```mermaid
classDiagram
    class Persona {
        -String identificacion
        -String nombre
        -int edad
        -LocalDate fechaNacimiento
        +Persona()
        +Persona(String id)
        +Persona(String id, String name, int edad)
        +Persona(String identificacion, String nombre, int anio, int mes, int dia)
        +getIdentificacion() String
        +setIdentificacion(String identificacion) void
        +getNombre() String
        +setNombre(String nombre) void
        +getEdad() int
        +setEdad(int edad) void
        +getFechaNacimiento() LocalDate
        +setFechaNacimiento(LocalDate fechaNacimiento) void
        +calcularEdad() int
        +mostrarInformacion() void
        -caminar() String
        +hablar() String
    }

    class Estudiante {
        -String codigo
        -String programa
        -double promedio
        +Estudiante()
        +Estudiante(String codigo, String programa, double promedio)
        +getCodigo() String
        +setCodigo(String codigo) void
        +getPrograma() String
        +setPrograma(String programa) void
        +getPromedio() double
        +setPromedio(double promedio) void
        +aprobo() void
        +mostrarInformacionEstudiante() void
    }