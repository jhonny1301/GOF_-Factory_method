public class Main {
    public static void main(String[] args) {
        Logistica logistica = new LogisticaTerrestre();
        Transporte transporte = logistica.crearTransporte();
        transporte.entregar();
    }
}