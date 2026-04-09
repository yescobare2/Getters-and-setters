package getAndset;

public class Reloj {
    private int hora, minuto, segundo;

    public Reloj(int h, int m, int s) {
        setTime(h, m, s);
    }

    public void setTime(int h, int m, int s) {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            throw new IllegalArgumentException("Hora, minutos o segundos inválidos.");
        }
        this.hora = h; this.minuto = m; this.segundo = s;
    }

    public void mostrar() {
        System.out.printf("Hora: %02d:%02d:%02d\n", hora, minuto, segundo);
    }
}