# Kata 1 - IntelliJ IDEA

## Objetivo
Practicar con IntelliJ y establecer un flujo de trabajo básico con Git.

## Ejecución
Abre el proyecto en IntelliJ y ejecuta la clase Main.

## JDK y dependencias
Versión 23.
Build: Maven.

Ninguna dependencia externa utilizada.

## Cómo compilar y ejecutar
Desde la raíz del proyecto:

```bash
mvn compile
java -cp target/classes software.ulpgc.kata1.Main
```

También se puede ejecutar desde la clase Main en IntelliJ.

## Estructura de la entrega y clases principales
- Código fuente: src/main/java/software/ulpgc/kata1.
- Paquete: software.ulpgc.kata1.
- Person: Clase con nombre, fecha de nacimiento y cálculo aproximado de la edad.
- Student: Clase con nombre, año de matrícula y cálculo de los años matriculado.
- Main: En la versión final crea un estudiante y muestra sus datos por consola.

Person calcula la edad dividiendo los días transcurridos entre 365.25.
Student calcula los años matriculado restando el año de matrícula al año actual.

Ambas clases rechazan fechas o años futuros.

## Git
Utilicé las ramas first-repetition, second-repetition y third-repetition
para separar las repeticiones.

Integré cada repetición en develop y después en master.
Los cambios están subidos a GitHub.

Durante las integraciones resolví conflictos en el README y en las clases
Main y Person.

## Cambios realizados
- Moví las clases a la estructura src/main/java de Maven.
- Cambié los atributos de Student a final.
- Actualicé el archivo .gitignore.
- Añadí validaciones para evitar fechas y años futuros.
- Renombré getAge a calculateAge.
- Actualicé Main para mostrar un estudiante en la versión final.

## Repeticiones

### Primera repetición
Rama: first-repetition.

Trabajé con Person y Main.
El programa crea a Ana y muestra su nombre, fecha de nacimiento
y edad aproximada.

Añadí una validación para impedir fechas de nacimiento futuras.



### Segunda repetición
Rama: second-repetition.

Volví a trabajar el ejemplo con Person y Main.
Cambié los datos de Ana por los de Luis y renombré el método
getAge a calculateAge, actualizando su llamada desde Main.

Mantuve el cálculo de la edad mediante los días transcurridos
y la constante 365.25.



### Tercera repetición
Rama: third-repetition.

Utilicé Student como variación del ejercicio.
Main crea a Carlos, matriculado en 2022, y muestra su nombre,
el año de matrícula y los años matriculado.

Añadí una validación para impedir años de matrícula futuros.



## Atajos de IntelliJ

- Shift + F10: Ejecutar.
- Shift + F6: Renombrar mediante refactorización.
- Alt + Enter: Mostrar sugerencias y correcciones.
## Comprobación
He comprobado que al clonar el proyecto funciona correctamente

## Verificación
El proyecto compila con Maven y se ejecuta correctamente con JDK 23.
La versión final muestra los datos del estudiante y los años matriculado.

## Vídeo
