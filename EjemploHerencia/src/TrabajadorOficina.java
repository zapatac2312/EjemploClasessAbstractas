public class TrabajadorOficina extends Persoanl{

    private int diasVacaciones;

    public TrabajadorOficina(String nombre, int id, int anioIngreso, String rol, String tipoContrato, int diasVacaciones) {
        super(nombre, id, anioIngreso, rol, tipoContrato);
        this.diasVacaciones = diasVacaciones;
    }

    @Override
    public void mostarInfo() {
        System.out.println("El trabajador " + getNombre()+ " con el id "+ getId()+ ", con el tipo de contrato "+ getTipoContrato());
        System.out.println("tiene "+ diasVacaciones +" dias de vacaciones");
    }

    @Override
    public double calcularPago() {
        return 100000;
    }

}
