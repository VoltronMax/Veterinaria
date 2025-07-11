package veterinaria;

public class Main {
    public static void main(String[] args) {

        Dueno Dueno = new Dueno();
        Dueno.setNombre("Pedro");
        Dueno.setApellido("Lopez");
        Dueno.setCedula("1059239441");
        Dueno.setDireccion("Manzana JH Casa 69");
        Dueno.setTelefono("9123129343");

        Mascota Firuloco = new Mascota();
        Firuloco.setNombre("Firulais");
        Firuloco.setRaza("Chandoso");
        Firuloco.setEdad(2);
        Firuloco.setPeso(20.8);

        Consulta primeraConsulta = new Consulta();
        primeraConsulta.setDueno(Dueno);
        primeraConsulta.setMascota(Firuloco);


        }

    }
