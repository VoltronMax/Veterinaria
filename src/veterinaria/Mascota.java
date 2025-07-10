package veterinaria;

public class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private double peso;

    public Mascota(String nombre, int edad, String raza, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getRaza(){
        return raza;
    }
    public double getPeso(){
        return peso;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public void mostrarMascota(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Raza: " + raza);
        System.out.println("Peso: " + peso + "kg");

    }

}
