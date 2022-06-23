package heren_polim_interfa;

public class Main {

    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        Trabajador miTrabajador = new Trabajador();

        miCliente.setNombre("Yenny Taborda Ramírez");
        miCliente.setEdad(28);
        miCliente.setEmail("tarayenny@gmail.com");
        miCliente.setTelefono("3023259903");
        miCliente.setCredito(452.8);

        miTrabajador.setNombre("Yenny Taborda Ramírez");
        miTrabajador.setEdad(28);
        miTrabajador.setEmail("tarayenny@gmail.com");
        miTrabajador.setTelefono("3023259903");
        miTrabajador.setSalario(1855.87);

        System.out.println("*** Datos de la clienta ***\n"+
                "\t\t" +"Nombre: " +miCliente.getNombre() + "\n" +
                "\t\t" +"Edad: " + miCliente.getEdad()+ "\n" +
                "\t\t" +"Email: "+miCliente.getEmail() + "\n" +
                "\t\t" +"Teléfono: "+miCliente.getTelefono()+ "\n"+
                "\t\t" +"Crédito asignado: $" + miCliente.getCredito()+ "\n");

        System.out.println("*** Datos de la trabajadora ***\n"+
                "\t\t" +"Nombre: " +miCliente.getNombre() + "\n" +
                "\t\t" +"Edad: " + miCliente.getEdad()+ "\n" +
                "\t\t" +"Email: "+miCliente.getEmail() + "\n" +
                "\t\t" +"Teléfono: "+miCliente.getTelefono()+"\n"+
                "\t\t" +"Salario: $" + miCliente.getCredito()+ "\n");

    }
}
