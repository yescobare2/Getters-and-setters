package getAndset;

public class Jugador {
    private String nombre;
    private int puntajeActual, puntajeMaximo;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntajeActual = 0;
        this.puntajeMaximo = 0;
    }

    public void actualizarPuntaje(int nuevo) {
        if (nuevo < 0) throw new IllegalArgumentException("El puntaje no puede ser negativo.");
        this.puntajeActual = nuevo;
        if (nuevo > puntajeMaximo) this.puntajeMaximo = nuevo;
    }

    public void mostrar() {
        System.out.println("Jugador: " + nombre + " | Actual: " + puntajeActual + " | Máximo: " + puntajeMaximo);
    }
}