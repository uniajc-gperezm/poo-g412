## Diagrama de clase Estudiante

# Estilo Mermaid

```mermaid
classDiagram
    class Estudiante {
        -String nombre
        -int edad
        -String codigoEstudiantil
        -String programaAcademico
        -double promedioAcademico
        +Estudiante()
        +Estudiante(String codigoEstudiantil)
        +Estudiante(String nombre, int edad, String codigoEstudiantil, String programaAcademico, double promedioAcademico)
        +String getNombre()
        +void setNombre(String nombre)
        +int getEdad()
        +void setEdad(int edad)
        +String getCodigoEstudiantil()
        +void setCodigoEstudiantil(String codigoEstudiantil)
        +String getProgramaAcademico()
        +void setProgramaAcademico(String programaAcademico)
        +double getPromedioAcademico()
        +void setPromedioAcademico(double promedioAcademico)
        +void mostrarInformacion()
        +String matricularMaterias()
        +String estudiar()
    }
 
```

