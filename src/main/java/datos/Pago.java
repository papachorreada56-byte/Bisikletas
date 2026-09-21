package datos;

public class Pago {
    private Double monto;

    public Pago(Double monto) {
        this.monto = monto;
    }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
}