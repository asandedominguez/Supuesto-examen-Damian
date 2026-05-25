import java.lang.module.ModuleDescriptor;

/**
 * Clase controladora del sistema. Actúa como intermediario directo
 * entre la interfaz de usuario (View) y la lógica de negocio (Model).
 */
public class Controller {
    static View miView = new View();
    static Model miModel = new Model();

    /**
     * Método principal de entrada de la aplicación.
     * Inicia el menú interactivo para el usuario.
     * * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        miView.menu();

        /**
         *

         // Instanciamos la vista y el modelo

         // Crear tres coches
         miModel.crearCoche("LaFerrari", "SBC 1234");
         miModel.crearCoche("Alpine", "HYU 4567");
         miModel.crearCoche("Aston Martin", "FGH 3333");

         Coche ferrari = miModel.getCoche("SBC 1234");
         // modifica la velocidad
         int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

         // recoje la velocidad y la muestra (tarea de la View)
         boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));


         if (hecho) {
         System.out.println("[LOG] Correcto");
         } else {
         System.out.println("[LOG] Error");
         } ; **/
    }

    /**
     * Solicita al modelo la creación de un nuevo coche y verifica si se ha guardado correctamente.
     * * @param modelo El modelo del coche a añadir.
     * @param matricula La matrícula del coche a añadir.
     * @return true si el coche se creó y guardó correctamente; false en caso contrario.
     */
    public boolean añadirCoche(String modelo, String matricula){
        Coche creado = miModel.crearCoche(modelo,matricula);
        if (creado == miModel.getCoche(matricula)) {
            return true;}
        else {return false;}
    }

    /**
     * Modifica la velocidad de un coche a través del modelo y solicita a la vista que la muestre.
     * * @param matricula La matrícula del coche a modificar.
     * @param velocidad La nueva velocidad que se le asignará.
     * @return El estado booleano que devuelve la vista al mostrar la velocidad.
     */
    public boolean newVelocidad(String matricula, int velocidad){
        int nuevaVelocidad = miModel.cambiarVelocidad(matricula, velocidad);
        boolean hecho = miView.muestraVelocidad(matricula, miModel.getVelocidad(matricula));
        return hecho;
    }

    /**
     * Gestiona el desplazamiento de un coche en metros, actualiza su kilometraje
     * a través del modelo y envía los datos a la vista para enseñarlos.
     * * @param matricula La matrícula del coche que va a avanzar.
     * @param metros La distancia en metros que recorrerá el vehículo.
     * @return true si el coche existía y se procesó el avance; false si el coche no fue encontrado.
     */
    public boolean avanzar(String matricula, int metros){
        int kilometrosTotales = miModel.avanzarCoche(matricula, metros);
        if (kilometrosTotales != -1) {
            boolean hecho = miView.muestraKilometros(matricula, kilometrosTotales);
            return hecho;
        }
        return false;
    }
}