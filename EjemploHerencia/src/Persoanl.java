public abstract class Persoanl{

    private String nombre;
    private int Id;
    private int anioIngreso;
    private String rol;
    private String tipoContrato;

    public Persoanl(String nombre, int id, int anioIngreso,String rol, String tipoContrato) {
        this.nombre = nombre;
        this.Id = id;
        this.anioIngreso = anioIngreso;
        this.rol = rol;
        this.tipoContrato = tipoContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return Id;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public String getRol() {
        return rol;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public abstract void mostarInfo();

    public abstract double calcularPago();

}
