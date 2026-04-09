package getAndset;

public class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio);
    }

    public String getCarnet() { return carnet; }
    public void setCarnet(String carnet) { this.carnet = carnet; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 100) {
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 100.");
        }
        this.promedio = promedio;
    }

    public boolean esBecado() {
        return this.promedio >= 85;
    }

    public void mostrar() {
        String becaStatus = esBecado() ? "Si" : "No";
        System.out.println("Carnet: " + carnet + " | Estudiante: " + nombre + 
                           " | Promedio: " + promedio + " | Becado: " + becaStatus);
    }
}