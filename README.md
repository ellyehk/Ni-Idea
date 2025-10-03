# Ni-Idea
🎓 Plataforma "Ni Idea" - Diagnóstico del Perfil del Programador
Taller de Investigación I | Docente: Francisco Javier Motecillo Puentes | Periodo: Agosto-Diciembre 2025

🚀 1. Descripción del Proyecto
"Ni Idea" es un prototipo de aplicación desarrollado en Java con el objetivo de centralizar y analizar las evidencias académicas y técnicas de los alumnos de Ingeniería en TICS.

El propósito de este desarrollo inicial fue generar un diagnóstico integral del perfil del programador al validar el modelado UML y la persistencia de datos local.

💻 2. Arquitectura y Tecnología
Tecnología Utilizada
Categoría	Herramienta	Notas
Lenguaje	Java	Implementación orientada a objetos.
IDE	NetBeans	Entorno de desarrollo principal.
Gestión de Dependencias	Maven	Usado para gestionar JUnit.
Pruebas	JUnit 5 (Plataforma Jupiter)	Validación de pruebas unitarias.
Persistencia	Serialización de Objetos	Almacenamiento local en archivos .bin.

Exportar a Hojas de cálculo
Modelo de Clases
La arquitectura se diseñó con UML. La clase central es Portafolio, la cual actúa como un contenedor para un Alumno y una lista dinámica de Logros (evidencias).

Clase	Propósito
Portafolio	Contenedor principal del perfil del estudiante.
Alumno	Entidad de identificación del estudiante.
Logro	Evidencia académica (e.g., Certificación Java).
Usuario	Clase base para perfiles de acceso (Tutor, Coordinador).


