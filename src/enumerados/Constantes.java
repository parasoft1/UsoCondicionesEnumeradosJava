package enumerados;

public enum Constantes {

    MENSAJE_CUADRO("ESTO ES UN MENSAJE"),
    MENSAJE_TITULO("ESTO ES UN TIULO"),
    MENSAJE_DOLAR_ALTO("EL DOLAR ESTA MUY CARO"),
    MENSAJE_DOLAR_BAJO("EL DOLAR ESTA MUY BARATO"),
    MENSAJE_INGRESO_VALOR("INGRESE UN VALOR");
    private String mensaje;
    Constantes(String s){
        this.mensaje=s;

    }

    public String getMensaje() {
        return mensaje;
    }
}
