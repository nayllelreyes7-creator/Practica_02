import java.time.Year;

public class Mascota {

    private String nombre;
    private String raza;
    private int anioDeNacimiento;
    private Persona miVeterinario;

    public Mascota(String nombre, String raza) {
        this(nombre, raza, 0);
    }

    public Mascota(String nombre, String raza, int anioDeNacimiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public void asignarVeterinario(Persona v) {
        miVeterinario = v;
    }

    public String consultarNombreVeterinario() {
        if (miVeterinario == null) {
            return "Sin asignar";
        }
        return miVeterinario.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    private int calcularEdadCanina() {
        if (anioDeNacimiento == 0) {
            return 0;
        }
        return Year.now().getValue() - anioDeNacimiento;
    }

    private int calcularEdadHumana() {
        return calcularEdadCanina() * 7;
    }

    public String toString() {
        return "Mascota -> Nombre: " + nombre
                + " | Raza: " + raza
                + " | Año de nacimiento: " + anioDeNacimiento
                + " | Edad canina: " + calcularEdadCanina()
                + " | Edad humana: " + calcularEdadHumana();
    }
}