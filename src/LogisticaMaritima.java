class LogisticaMaritima extends Logistica {
    public Transporte crearTransporte() {
        return new Barco();
    }
}