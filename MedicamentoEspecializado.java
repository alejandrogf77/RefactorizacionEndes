package endes.farmacia.medicamentos;

/**
 * La clase MedicamentoEspecializado representa un tipo específico de medicamento
 * con un nombre, precio y tipo asociado.
 */
class MedicamentoEspecializado {

    /**
     * Nombre del medicamento especializado.
     */
    public String nombre;

    /**
     * Precio del medicamento especializado.
     */
    public double precio;

    /**
     * Tipo del medicamento especializado, que puede representar su categoría
     * o finalidad médica.
     */
    private String tipo;

    /**
     * Constructor de la clase MedicamentoEspecializado.
     * Crea un nuevo medicamento especializado con el nombre, precio y tipo especificados.
     *
     * @param nombre El nombre del medicamento.
     * @param precio El precio del medicamento.
     * @param tipo El tipo del medicamento (categoría o uso médico).
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo del medicamento especializado.
     *
     * @return El tipo del medicamento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece un nuevo tipo para el medicamento especializado.
     *
     * @param tipo El nuevo tipo del medicamento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Muestra los detalles del medicamento especializado. Este método puede ser
     * personalizado para incluir detalles adicionales como número, cantidad,
     * código del medicamento y código de la farmacia.
     *
     * @param numero Número relacionado con el medicamento.
     * @param cantidad Cantidad disponible del medicamento.
     * @param numFarmacia Número de identificación de la farmacia.
     * @param codigoMedicamento Código único del medicamento.
     * @param codigoFarmacia Código único de la farmacia.
     * @return Una cadena con los detalles básicos del medicamento.
     */
    public String mostrarMedicamento(int numero, int cantidad, int numFarmacia, int codigoMedicamento, int codigoFarmacia) {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }

    /**
     * Representa el medicamento especializado en forma de cadena.
     * Incluye el nombre, precio y tipo.
     *
     * @return Una cadena con los detalles del medicamento especializado.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + ", Tipo: " + tipo;
    }
}

