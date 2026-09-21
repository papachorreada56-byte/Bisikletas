package datos;

import java.time.Duration;
import java.time.LocalDateTime;

public class RegistroParqueo {
    private LocalDateTime horaIngreso;
    private LocalDateTime horaSalida;
    private Bicicleta bicicleta;
    private Pago pago;
    private Boolean completado;

    public RegistroParqueo(LocalDateTime horaIngreso, Bicicleta bicicleta) {
        this.horaIngreso = horaIngreso;
        this.bicicleta = bicicleta;
        this.completado = false;
    }
    public Double calcularTarifa() {
        if (horaSalida == null) {
            this.horaSalida = LocalDateTime.now();
        }
        long minutos = Duration.between(horaIngreso, horaSalida).toMinutes();
        if (minutos <= 0) {
            minutos = 1; // Cobro mínimo de 1 minuto
        }
        return minutos * 10.0;
    }

    public LocalDateTime getHoraIngreso() { return horaIngreso; }

    public LocalDateTime getHoraSalida() { return horaSalida; }
    public void setHoraSalida(LocalDateTime horaSalida) { this.horaSalida = horaSalida; }

    public Bicicleta getBicicleta() { return bicicleta; }

    public Pago getPago() { return pago; }
    public void setPago(Pago pago) { this.pago = pago; }

    public Boolean isCompletado() { return completado; }
    public void setCompletado(Boolean completado) { this.completado = completado; }
}