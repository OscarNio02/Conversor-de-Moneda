import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaObjetivo;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);
    ConsultaConversion conversion;

    public Calculos(ConsultaConversion conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaObjetivo() {
        return monedaObjetivo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void almacenarValores(String monedaBase, String monedaObjetivo){
        this.monedaBase = monedaBase;
        this.monedaObjetivo = monedaObjetivo;

        System.out.println("Ingrese el valor que desea convertir");

        this.cantidad = Double.parseDouble(lectura.nextLine());
    }

    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaBase().toUpperCase() + " " + getCantidad() + " corresponde al valor final de: " + getMonedaObjetivo().toUpperCase() + " " + conversion.buscaConversion(getMonedaBase(), getMonedaObjetivo(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}
