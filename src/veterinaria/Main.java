package veterinaria;

public class Main {
    public static void main(String[] args) {

        Dueno dueno = new Dueno();
        dueno.setNombre("Pedro");
        dueno.setApellido("Lopez");
        dueno.setCedula("1059239441");
        dueno.setDireccion("Manzana JH Casa 69");
        dueno.setTelefono("9123129343");

        Mascota Firuloco = new Mascota();
        Firuloco.setNombre("Firulais");
        Firuloco.setRaza("Chandoso");
        Firuloco.setEdad(2);
        Firuloco.setPeso(20.8);

        Consulta primeraConsulta = new Consulta();
        primeraConsulta.setDueno(dueno);
        primeraConsulta.setMascota(Firuloco);
        primeraConsulta.setFecha("2025-07-11");
        primeraConsulta.setMotivoConsulta("Lo van a castrar");
        primeraConsulta.setTratamiento("Le van a quitar los cocos");
        primeraConsulta.setCosto(200.000);
        primeraConsulta.mostrarDatosConsulta();

       }

    }
