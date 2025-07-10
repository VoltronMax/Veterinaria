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

    //getters
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

    //setters (Con excepciones para evitar datos sin sentido)
    public void setNombre(String nombre){
        if (nombre==null||nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del dueño no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad){
        if(edad<0 || edad>30){
            throw new IllegalArgumentException("La edad de la mascota debe estar entre 0 y 30 años");
        }
        this.edad = edad;
    }

    public void setRaza(String raza){
        if (raza==null||raza.isBlank()){
            throw new IllegalArgumentException("Debe especificar la raza de la mascota");
        } else {
            this.raza = raza;
        }
    }

    public void setPeso(double peso){
        if(peso<0.1 || peso>100){
            throw new IllegalArgumentException("El peso de la mascota esta fuera del rango permitido");
        } else {
            this.peso = peso;
        }
    }

    public void mostrarMascota(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Raza: " + raza);
        System.out.println("Peso: " + peso + "kg");
    }
}
