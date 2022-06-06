public class EjercicioTema5 {
    public static void main(String[] args) {
	
	Persona persona = new Persona();

	persona.setEdad(23);
	persona.setNombre("Fabricio");
	persona.setTel(12345678);

	System.out.println("Edad: " + persona.getEdad());
	System.out.println("Nombre: " + persona.getNombre());
	System.out.println("Teléfono: " + persona.getTel());
    }
}

class Persona {
    private String nombre;
    private int edad, telefono;

    // setters
    public void setEdad(int edad) {
	this.edad = edad;
    }
    
    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setTel(int telefono) {
	this.telefono = telefono;
    }

    // getters
    public int getEdad() {
	return edad;
    }

    public String getNombre() {
	return nombre;
    }

    public int getTel() {
	return telefono;
    }
}
