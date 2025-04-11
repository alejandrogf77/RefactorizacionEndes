package endes.farmacia.medicamentos;

/**
 * La clase MedicamentoGenerico extiende la clase Medicamento y representa
 * un medicamento genérico.
 * Hereda las propiedades y métodos de la clase Medicamento.
 */
class MedicamentoGenerico extends Medicamento {

    /**
     * Constructor de la clase MedicamentoGenerico.
     * Llama al constructor de la clase base Medicamento para inicializar
     * el nombre y el precio del medicamento genérico.
     *
     * @param nombre El nombre del medicamento genérico.
     * @param precio El precio base del medicamento genérico.
     */
    public MedicamentoGenerico(String nombre, double precio) {
        super(nombre, precio);
    }

}

