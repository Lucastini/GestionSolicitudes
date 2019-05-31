
package negocio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solicitud implements Comparable<Solicitud>{
    
    private String dni;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaSolicitud;
    
    public Solicitud(String dni, String ape, Date fechaNac){
        this.dni=dni;
        apellido=ape;
        fechaNacimiento=fechaNac;
        fechaSolicitud=new Date();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    
    
    public int calcularEdadSolicitante(){
        Date fechaActual=new Date();
        long diasDeVida=(fechaActual.getTime()-fechaNacimiento.getTime())/(1000*60*60*24);
        int edad=(int)diasDeVida/365;
        return edad;
    }
    
    public Date calcularFechaResolucion(){
        Calendar aux=Calendar.getInstance();
        aux.setTime(fechaSolicitud);
        aux.add(Calendar.DAY_OF_YEAR, 15);
        Date res=aux.getTime();
        return res;
    }
    
    public DateFormat formateadorFecha(){
        return new SimpleDateFormat("dd/MM/yyyy");
    }
    
    public String toStringFechaSolicitud(){
        return formateadorFecha().format(fechaSolicitud);
    }
    
    public String tostringFechaResolucion(){
        return formateadorFecha().format(calcularFechaResolucion());
    }
    
    public String toStringFechaNacimiento(){
        return formateadorFecha().format(fechaNacimiento);
    }

    @Override
    public int compareTo(Solicitud t) {
        return fechaNacimiento.compareTo(t.getFechaNacimiento());
    }
    
    
}
