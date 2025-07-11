package veterinaria;

public class Dueno {
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String telefono;

    public Dueno(){

    }

    public Dueno(String nombre, String apellido, String cedula, String direccion, String telefono){
        setNombre(nombre);
        setApellido(apellido);
        setCedula(cedula);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getCedula(){
        return cedula;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getResumen(){
        return "Nombre del dueño: " + nombre + " | Apellido: " + apellido + " | Cedula: " + cedula;
    }

    //Setters

    public void setNombre(String nombre){
        if(nombre==null||nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del dueño es obligatorio");
        }

            this.nombre = nombre;
    }

    public void setApellido(String apellido){
        if (apellido==null||apellido.isBlank()){
            throw new IllegalArgumentException("El apellido del dueño es obligatorio");
        }

            this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        if (cedula==null || cedula.isBlank() || !cedula.matches("[0-9]+")) {
            throw new IllegalArgumentException("El documento ingresado es invalido");
        }

            this.cedula = cedula;
    }

    public void setDireccion(String direccion){
        if(direccion==null||direccion.isBlank()){
            throw new IllegalArgumentException("La direccion es invalida");
        }

        this.direccion = direccion;
    }

    public void setTelefono(String telefono){
        if(telefono==null || telefono.length()!=10 || !telefono.matches("[0-9]+")){
            throw new IllegalArgumentException("El telefono debe tener 10 digitos numericos");
        }

        this.telefono = telefono;
    }

    //Metodo que imprime los datos del dueño para uso en interfaces y/o resumenes
    public void mostrarDueno(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Cedula: " + cedula);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
    }

}
