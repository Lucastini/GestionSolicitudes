
package negocio;

import java.util.Collections;
import java.util.LinkedList;

public class GestorSolicitudes {
    
    private LinkedList<Solicitud> solicitudes;

    public GestorSolicitudes() {
        solicitudes = new LinkedList<>();
    }
    
    public boolean addSolicitud(Solicitud s){
        boolean res=false;
        if(s!=null)
            res= solicitudes.add(s);
        return res;
    }
    
    public Solicitud getSolicitud(int pos){
        Solicitud soli=null;
        if(pos<solicitudes.size())
            soli=solicitudes.get(pos);
        return soli;
            
    }
    
    public boolean removeSolicitud(String dni){
        boolean res=false;
        if(dni!=null)
            for(Solicitud iter:solicitudes)
                if(iter.getDni().equals(dni)){
                    solicitudes.remove(iter);
                    res=true;
                    break;
                }
        return res;
    }
    
    public void ordenarPorFechaSolicitud(){
        Collections.sort(solicitudes);
    }
    
    public int cantSolicitudes(){
        return solicitudes.size();
    }

    
    
    
    
}
