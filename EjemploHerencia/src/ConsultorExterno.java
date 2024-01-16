public class ConsultorExterno extends Persoanl{

    private int tarifaHoras;
    private int horasTrabajadas;
    public ConsultorExterno(String nombre, int id, int anioIngreso, String rol, String tipoContrato, int tarifaHoras, int horasTrabajadas) {
        super(nombre, id, anioIngreso, rol, tipoContrato);
        this.tarifaHoras = tarifaHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void mostarInfo() {
        System.out.println("El trabajador " + getNombre()+ " con el id "+ getId()+ ", con el tipo de contrato "+ getTipoContrato());
        System.out.println("Las horas trabajadas esta semana fueron: "+ horasTrabajadas + " y el valor por hora fue de: "+ tarifaHoras);
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas*tarifaHoras;
    }
}
