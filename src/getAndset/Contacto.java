package getAndset;

public class Contacto {
    private String nombre, telefono, email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        setTelefono(telefono);
        setEmail(email);
    }

    public void setTelefono(String tel) {
        if (tel.length() != 8) throw new IllegalArgumentException("El teléfono debe tener 8 dígitos.");
        this.telefono = tel;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) throw new IllegalArgumentException("Email no válido.");
        this.email = email;
    }

    public void mostrar() {
        System.out.println("Contacto: " + nombre + " | Telefono: " + telefono + " | Email: " + email);
    }
}