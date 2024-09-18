class LogisticaTerrestre extends Logistica {
    public Transporte crearTransporte() {
        return new Camion();
    }
}