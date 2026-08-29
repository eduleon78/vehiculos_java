import java.util.Scanner;
import com.leonstudios.modelos.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Subida implícita a Vehiculo por herencia
        Vehiculo[] garaje = {
            new Auto("Toyota", "Corolla"),
            new Pickup("Chevrolet", "Silverado"),
            new Camion("Volvo", "FH16", 24.5)
        };

        System.out.println("=== SELECCIONE UN VEHÍCULO ===");
        for (int i = 0; i < garaje.length; i++) {
            System.out.println((i + 1) + ". " + garaje[i].getNombre());
        }

        System.out.print("Opción: ");
        int seleccion = scanner.nextInt() - 1;

        if (seleccion >= 0 && seleccion < garaje.length) {
            operarVehiculo(garaje[seleccion], scanner);
        } else {
            System.out.println("Selección inválida.");
        }
    }

    private static void operarVehiculo(Vehiculo vehiculo, Scanner scanner) {
        int opcion = 0;
        do {
            System.out.println("\n--- PANEL DE CONTROL: " + vehiculo.getNombre() + " ---");
            System.out.println("1. Encender motor");
            System.out.println("2. Apagar motor");
            System.out.println("3. Encender luces");
            System.out.println("4. Apagar luces");
            System.out.println("5. Encender estéreo");
            System.out.println("6. Apagar estéreo");
            System.out.println("7. Abrir puertas");
            System.out.println("8. Cerrar puertas");
            
            // Acciones específicas por tipo de vehículo
            if (vehiculo instanceof Pickup) {
                System.out.println("9. Abrir platón de carga");
            } else if (vehiculo instanceof Camion) {
                System.out.println("9. Acoplar remolque");
            }
            
            System.out.println("0. Salir");
            System.out.print("Seleccione una función: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> vehiculo.encender();
                case 2 -> vehiculo.apagar();
                case 3 -> vehiculo.encenderLuces();
                case 4 -> vehiculo.apagarLuces();
                case 5 -> vehiculo.encenderEstereo();
                case 6 -> vehiculo.apagarEstereo();
                case 7 -> vehiculo.abrirPuertas();
                case 8 -> vehiculo.cerrarPuertas();
                case 9 -> {
                    if (vehiculo instanceof Pickup p) p.abrirPlaton();
                    else if (vehiculo instanceof Camion c) c.acoplarRemolque();
                }
                case 0 -> System.out.println("Saliendo del vehículo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}