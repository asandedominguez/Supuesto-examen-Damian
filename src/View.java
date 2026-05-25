import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {

    /**
     * Despliega el menú textual interactivo por consola.
     * Captura las acciones del usuario y delega las operaciones al Controller.
     */
    public void menu() {
        Controller c = new Controller();
        int opcion = 0;
        do {
            System.out.println("\n--- XESTOR COCHES ---");
            System.out.println("1. Engadir Coche");
            System.out.println("2. Cambiar velocidad");
            System.out.println("3. Avanzar (metros)");
            System.out.println("4. Salir");
            System.out.print("Selecciona unha opción: ");

            Scanner sc = new Scanner(System.in);
            try {
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Modelo: ");
                        String modelo = sc.next();
                        System.out.println("Matricula: ");
                        String matricula = sc.next();
                        boolean a = c.añadirCoche(modelo, matricula);
                        if (a == true) {
                            System.out.println("Se ha añadido correctamente");}
                        else {System.out.println("Algo ha fallado");}
                    }

                    case 2 -> {
                        System.out.println("Matricula: ");
                        String matricula = sc.next();
                        System.out.println("Nueva velocidad: ");
                        int velocidad = sc.nextInt();
                        boolean a = c.newVelocidad(matricula,velocidad);
                        if (a == true) {
                            System.out.println("Se ha cambiado correctamente");}
                        else {System.out.println("Algo ha fallado");}
                    }

                    case 3 -> {
                        System.out.println("Matricula: ");
                        String matricula = sc.next();
                        System.out.println("Metros a avanzar: ");
                        int metros = sc.nextInt();
                        boolean a = c.avanzar(matricula, metros);
                        if (a == true) {
                            System.out.println("El coche ha avanzado correctamente");}
                        else {System.out.println("Algo ha fallado");}
                    }

                    case 4 -> {
                        System.out.println("Chao hasta luego....");
                    }
                }
            } catch (Exception e) {
                System.out.println("Introduce un número válido.");
                opcion = 0;
            }
        } while (opcion != 4);
    }

    /**
     * Imprime en la consola la velocidad actual de un coche específico.
     * * @param matricula La matrícula del coche correspondiente.
     * @param v La velocidad actual en km/h.
     * @return Siempre devuelve true como confirmación de la visualización.
     */
    public boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }

    /**
     * Imprime en la consola el kilometraje total acumulado por un coche específico.
     * * @param matricula La matrícula del coche correspondiente.
     * @param km La cantidad de kilómetros totales recorridos.
     * @return Siempre devuelve true como confirmación de la visualización.
     */
    public boolean muestraKilometros(String matricula, Integer km){
        System.out.println(matricula + " lleva recorridos un total de: " + km + " km");
        return true;
    }
}