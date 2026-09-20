import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String codLicencia;
    private ArrayList<Mascota> misMascotas;

    public Persona(String nombre, String codLicencia) {
        this.nombre = nombre;
        this.codLicencia = codLicencia;
        this.misMascotas = new ArrayList<Mascota>();
    }

    public void asignarMascota(Mascota m) {
        misMascotas.add(m);
    }

    public String consultarNombreMascotas() {
        if (misMascotas.isEmpty()) {
            return "Sin mascotas asignadas";
        }
        String nombres = "";
        for (int i = 0; i < misMascotas.size(); i++) {
            nombres += misMascotas.get(i).getNombre();
            if (i < misMascotas.size() - 1) {
                nombres += ", ";
            }
        }
        return nombres;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return " | Veterinario: " + nombre
                + " | Licencia: " + codLicencia;
    }
}