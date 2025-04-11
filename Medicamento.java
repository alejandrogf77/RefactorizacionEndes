package endes.farmacia.medicamentos;

/**
 * La clase Medicamento representa un medicamento genérico que puede tener un precio
 * base y un precio subvencionado calculado mediante una constante.
 */
public class Medicamento {
    /**
     * Nombre del medicamento.
     */
    public String nombre;

    /**
     * Precio base del medicamento.
     */
    public double precio;

    /**
     * Constante utilizada para calcular el precio subvencionado.
     * Representa el valor multiplicador del precio base.
     */
    public double constante_subvencionado = 15;

    /**
     * Constructor de la clase Medicamento.
     * Crea un nuevo medicamento con el nombre y precio especificados.
     *
     * @param nombre El nombre del medicamento.
     * @param precio El precio base del medicamento.
     */
    public Medicamento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Método para calcular el precio subvencionado del medicamento.
     * Utiliza la constante subvencionada para multiplicar el precio base.
     *
     * @return El precio subvencionado del medicamento.
     */
    public double getPrecioSubvencionado() {
        return constante_subvencionado * precio;
    }
}

