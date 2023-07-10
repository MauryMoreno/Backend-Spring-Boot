# Proyecto backend intermedio 

## Descripción del Proyecto

Este proyecto es una aplicación de gestión de citas médicas. Fue desarrollado por Maury Moreno  como parte de un proyecto para el curso de backend intermedio de todos a la U impartido por la Universidad Districal Francisco Jose de Caldas. 

La aplicación permite a los usuarios programar citas con doctores en diversas especialidades, manteniendo un registro organizado y accesible de todas las citas pasadas y futuras.

## Tecnologías Empleadas

Este proyecto está construido con las siguientes tecnologías:

- Backend: JAVA Spring Boot
- Base de datos: MongoDB


## Modelo de Datos

El modelo de datos empleado en esta aplicación consiste en tres entidades principales: Paciente, Doctor y Cita. 

Paciente:
- cedula: string
- nombre: string
- apellido: string
- correo: string

Doctor:
- nombre: string
- apellido: string
- especialidad: string
- consultorio: string
- correo: string

Cita:
- doctor: referencia al doctor
- paciente: referencia al paciente
- fecha: date

## Instalación y Uso

Para instalar y correr este proyecto, sigue estos pasos:

1. Clona el repositorio en tu máquina local usando `git clone https://github.com/MauryMoreno/Backend-Spring-Boot.git`

2. Cambia al directorio del proyecto `cd Backend-Spring-Boot`

5. Inicia el servidor usando `./mvnw spring-boot:run`.

5. Abre tu navegador y navega a `http://localhost:8080`.

Por favor, ten en cuenta que este proyecto requiere una conexión a una base de datos MongoDB. Deberás proporcionar tus propias credenciales de MongoDB como variables de entorno.


[![Alt text](https://img.youtube.com/vi/DKzz2AdNElo/0.jpg)](https://www.youtube.com/watch?v=DKzz2AdNElo)
