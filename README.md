#  Gym

Aplicación web orientada a la **gestión y organización de entrenamientos de gimnasio**.

El proyecto permite administrar información relacionada con rutinas y entrenamiento desde una aplicación web desarrollada utilizando **Grails** y **Groovy**.

##  Tecnologías

El proyecto fue desarrollado utilizando:

* **Grails 4.0.2**
* **Groovy**
* **GORM / Hibernate**
* **Gradle 5.1.1**
* **Spring Boot**
* **GSP (Groovy Server Pages)**
* **H2 Database**
* **HTML / CSS / JavaScript**

##  Funcionalidades

La aplicación está orientada a facilitar la organización de entrenamientos y la información asociada a ellos.

Entre sus objetivos se encuentran:

* Organización de entrenamientos.
* Administración de ejercicios.
* Gestión de la información desde una interfaz web.
* Persistencia de los datos mediante GORM / Hibernate.
* Gestión de las distintas entidades de la aplicación mediante la arquitectura MVC de Grails.

##  Arquitectura

El proyecto utiliza la arquitectura **MVC (Model - View - Controller)** proporcionada por Grails.

```text
Gym/
├── grails-app/
│   ├── assets/        # CSS, JavaScript e imágenes
│   ├── conf/          # Configuración de la aplicación
│   ├── controllers/   # Controladores
│   ├── domain/        # Entidades del dominio
│   ├── views/         # Vistas GSP
│   └── ...
├── src/               # Código fuente adicional y tests
├── gradle/            # Gradle Wrapper
├── build.gradle       # Dependencias y configuración
├── gradle.properties
├── gradlew
├── grailsw
└── README.md
```

##  Requisitos

Para ejecutar el proyecto es necesario contar con:

* Java/JDK compatible con Grails 4.
* Git.

No es necesario instalar Gradle o Grails globalmente, ya que el repositorio incluye sus respectivos wrappers.

##  Instalación

Clonar el repositorio:

```bash
git clone <URL_DEL_REPOSITORIO>
```

Ingresar al directorio:

```bash
cd Gym
```

### Linux / macOS

Dar permisos de ejecución al wrapper si fuera necesario:

```bash
chmod +x grailsw
```

Ejecutar la aplicación:

```bash
./grailsw run-app
```

### Windows

```bash
grailsw.bat run-app
```

Una vez iniciado el servidor, la aplicación estará disponible normalmente en:

```text
http://localhost:8080
```

##  Base de datos

El proyecto utiliza **H2 Database** como base de datos para el entorno de desarrollo.

La persistencia de las entidades es administrada mediante **GORM** y **Hibernate**.

##  Tests

Los tests pueden ejecutarse utilizando el wrapper de Grails:

```bash
./grailsw test-app
```

En Windows:

```bash
grailsw.bat test-app
```

##  Objetivo del proyecto

El objetivo de **Gym** es aplicar conceptos de desarrollo de aplicaciones web mediante Grails, utilizando una arquitectura MVC y persistencia de datos para construir una herramienta destinada a la administración de entrenamientos.

El proyecto también sirve como práctica de tecnologías del ecosistema Java/Groovy, incluyendo Grails, GORM, Hibernate, Gradle y Spring Boot.

##  Posibles mejoras

Algunas funcionalidades que podrían incorporarse en futuras versiones:

* Seguimiento del progreso del entrenamiento.
* Registro de pesos y repeticiones.
* Historial de entrenamientos.
* Estadísticas de progreso.
* Autenticación de usuarios.
* Creación de rutinas personalizadas.
* Mejoras en la interfaz y experiencia de usuario.
* API REST.
* Migración a una base de datos persistente para producción.

##  Autor

**Cristian**

GitHub: `Cristianfca197`

##  Licencia

Este proyecto se encuentra publicado con fines educativos y de desarrollo personal.

Si se desea distribuir o reutilizar el código, se recomienda incorporar una licencia al repositorio, por ejemplo MIT.
