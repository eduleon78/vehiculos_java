# Simulator Vehicular - Consola Java

Un sistema de simulación e interacción con vehículos desarrollado en Java orientado a consola. El proyecto aplica los principios fundamentales de la Programación Orientada a Objetos (POO) como **herencia**, **polimorfismo**, **encapsulamiento** y **composición** a través de una arquitectura modular por paquetes.

---

## 📐 Arquitectura del Proyecto

La estructura del código está dividida en paquetes según las responsabilidades de cada componente:

```text
src/
├── conduccion/     # Interfaces y controladores para operar las funciones del vehículo.
├── electronica/    # Componentes eléctricos (luces, estéreo, sistemas de encendido).
├── mecanica/       # Componentes mecánicos internos (motor, transmisión).
├── modelos/        # Jerarquía de clases de vehículos (Vehiculo, Auto, Pickup, Camion).
└── Main.java       # Menú principal e interfaz de interacción por consola.🚀 Funcionalidades
Selección de Vehículos: Permite elegir entre distintas categorías de vehículos (Autos, Pickups, Camiones).

Control Electrónico: Encendido/apagado de luces y sistema de audio/estéreo.

Control Mecánico: Encendido/apagado del motor.

Funciones de Carrocería: Apertura y cierre de puertas.

Funciones Especializadas: Acciones específicas según el tipo de vehículo (ej. apertura de platón en Pickups o acople de remolque en Camiones).

🛠️ Tecnologías Utilizadas
Lenguaje: Java (JDK 17 o superior)

IDE: Eclipse IDE

Control de Versiones: Git / GitHub