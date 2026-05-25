import java.util.ArrayList;

/**
 * Clase encargada de manejar los datos
 */
public class Model {
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        for (Coche e: parking) {
            if (e.getMatricula().equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     * Cambia la velocidad de un coche
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public int cambiarVelocidad(String matricula, Integer v) {
        Coche coche = getCoche(matricula);

        if (coche != null) {
            coche.setVelocidad(v);
            System.out.println(" LOG esta haciendose");
            return coche.getVelocidad();
        }

        return -1;
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public int getVelocidad(String matricula) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            return coche.getVelocidad();
        }
        return -1;
    }

    /**
     * Avanza el coche sumando los metros convertidos a kilómetros
     * @param matricula identificador unico
     * @param metros de distancia recorridos
     * @return kilometros totales acumulados o -1 si no existe
     */
    public int avanzarCoche(String matricula, int metros) {
        Coche coche = getCoche(matricula);
        if (coche != null) {
            int kmNuevos = metros / 1000;
            coche.setKilometrosRecorridos(coche.getKilometrosRecorridos() + kmNuevos);
            return coche.getKilometrosRecorridos();
        }
        return -1;
    }
}