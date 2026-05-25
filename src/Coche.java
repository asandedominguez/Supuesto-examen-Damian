/**
 * Representa un vehículo dentro del sistema con sus propiedades básicas
 * como matrícula, modelo, velocidad y kilometraje acumulado.
 */
public class Coche {
    String matricula;
    String modelo;
    Integer velocidad;
    Integer kilometrosRecorridos;

    /**
     * Constructor para crear un nuevo coche.
     * Inicializa la velocidad y los kilómetros recorridos a 0.
     * * @param modelo El modelo o marca del coche.
     * @param matricula La matrícula única del coche.
     */
    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = 0;
        this.kilometrosRecorridos = 0; // Inicializa a 0 km
    }

    /**
     * Obtiene la matrícula del coche.
     * * @return Una cadena de texto con la matrícula.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Obtiene el modelo del coche.
     * * @return Una cadena de texto con el modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Obtiene la velocidad actual del coche.
     * * @return El valor entero de la velocidad en km/h.
     */
    public Integer getVelocidad() {
        return velocidad;
    }

    /**
     * Establece la velocidad actual del coche.
     * * @param velocidad La nueva velocidad en valores enteros.
     */
    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Obtiene el total de kilómetros recorridos acumulados por el coche.
     * * @return El número entero de kilómetros recorridos.
     */
    public Integer getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    /**
     * Establece el total de kilómetros recorridos acumulados por el coche.
     * * @param kilometrosRecorridos El nuevo total de kilómetros acumulados.
     */
    public void setKilometrosRecorridos(Integer kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}