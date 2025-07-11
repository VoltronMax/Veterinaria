package veterinaria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Consulta {
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private Dueno dueno;
    private Mascota mascota;
    private String fecha;
    private String motivoConsulta;
    private String tratamiento;
    private Double costo;

    public Consulta(){

    }

    public Consulta(Dueno dueno, Mascota mascota, String fecha, String motivoConsulta, String tratamiento, double costo){
        setDueno(dueno);
        setMascota(mascota);
        setFecha(fecha);
        setMotivoConsulta(motivoConsulta);
        setTratamiento(tratamiento);
        setCosto(costo);
    }


//Getters
public Dueno getDueno(){
    return dueno;
}

public Mascota getMascota(){
    return mascota;
}

public String getFecha(){
    return fecha;
}

public String getMotivoConsulta(){
    return motivoConsulta;
}

public String getTratamiento(){
    return tratamiento;
}

public double getCosto(){
    return costo;
}

//Setters

    public void setDueno(Dueno dueno){
    if (dueno==null){
        throw new IllegalArgumentException("No hay registros de dueño");
    }

    this.dueno=dueno;
    }

    public void setMascota(Mascota mascota){
    if (mascota==null){
        throw new IllegalArgumentException("No hay registros de mascota");
    }

    this.mascota=mascota;
    }

    public void setFecha(String fecha){
    if (fecha==null || fecha.isBlank()){
        throw new IllegalArgumentException("La fecha es obligatoria");
    }

    LocalDate fechaConvertida;
    try {
        fechaConvertida = LocalDate.parse(fecha, FORMATO_FECHA);
    } catch (DateTimeParseException e){
        throw new IllegalArgumentException("El formato de fecha es invalido. Se debe usar yyyy-MM-dd");
    }

    if (fechaConvertida.isAfter((LocalDate.now()))){
        throw new IllegalArgumentException("La fecha no puede ser posterior a hoy");
    }

    this.fecha = fecha;


    }

    public void setMotivoConsulta(String motivoConsulta){
    if(motivoConsulta==null||motivoConsulta.isBlank()){
        throw new IllegalArgumentException("El motivo no puede estar vacio");
    }

    this.motivoConsulta = motivoConsulta;
    }

    public void setTratamiento(String tratamiento){
        if(tratamiento==null||tratamiento.isBlank()){
            throw new IllegalArgumentException("Se debe especificar el tratamiento");
        }

        this.tratamiento = tratamiento;
    }

    public void setCosto (Double costo){
    if (costo==null || costo<0.1 || costo>5000000){
        throw new IllegalArgumentException("El costo no es un monto logico");
    }

    this.costo = costo;
    }

    public void mostrarDatosConsulta(){
    dueno.getResumen();
    mascota.getResumenMascota();
        System.out.println("Fecha de atencion: " + fecha);
        System.out.println("Motivo de la consulta: " + motivoConsulta);
        System.out.println("Tratamiento: " + tratamiento);
        System.out.println("Costo total: " + costo);
    }



}
