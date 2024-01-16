public class main {
    public static void main(String[] args) {

        TrabajadorOficina trabajador1 = new TrabajadorOficina("Pedro", 123, 2023, "Trabajador Oficina", "Definido", 15);
        ConsultorExterno trabajador2 = new ConsultorExterno("Juan", 234, 2018, "Consultor Externo", "Por horas", 10000, 40);

        trabajador1.mostarInfo();
        System.out.println(trabajador1.calcularPago());
        trabajador2.mostarInfo();
        System.out.println(trabajador2.calcularPago());

    }
}
