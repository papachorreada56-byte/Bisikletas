package datos;

public class Bicicleta {
    private String serial;
    private String color;
    private Usuario usuario;

    public Bicicleta(String serial, String color, Usuario usuario) {
        this.serial = serial;
        this.color = color;
        this.usuario = usuario;
    }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}