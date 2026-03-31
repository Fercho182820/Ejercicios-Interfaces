package UNAM.ICO.Vehiculo;

public class Carro implements Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double distanciaHora;
    private double tiempoHora;

    public Carro() {
    }

    public Carro(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                '}';
    }

    @Override
    public double calcularVelocidadMaxima() {

        return 0;
    }
}
