package priv_Abstracc_Encap;

public class Main {

    public static void main(String[] args) {
        Persona miPersona = new Persona();

        miPersona.setNombre("Yenny Taborda Ramírez");
        miPersona.setEdad(28);
        miPersona.setEmail("tarayenny@gmail.com");
        miPersona.setTelefono("3023259903");

        System.out.println("**Datos del usuario**\n"+
                "Nombre: " +miPersona.getNombre() + "\n" +
                "Edad: " + miPersona.getEdad()+ "\n" +
                "Email: "+miPersona.getEmail() + "\n" +
                "Teléfono: "+miPersona.getTelefono());

    }
}
