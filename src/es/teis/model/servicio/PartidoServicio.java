/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.teis.model.servicio;

import es.teis.model.Partido;
import es.teis.model.dao.partido.IPartidoDao;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class PartidoServicio implements IPartidoServicio{
    private IPartidoDao partidoDao ;

    public PartidoServicio(IPartidoDao partidoDao) {
        this.partidoDao = partidoDao;
    }
    
    public void crearPartidos(ArrayList<Partido> partidos){
        Partido creado = null;
        for(Partido p: partidos)
        {
            if(!partidoDao.existe(p.getNombre())){
            creado = partidoDao.create(p);
            System.out.println("Se ha creado un partido con id: " + creado.getId());
            }
            else{
                System.out.println("El partido. " + p.getNombre()+" ya existe");
            }
            
        }
    }

    @Override
    public boolean transferirVotos(String nombreOrigen, String nombreDestino, int cantidadVotos) {
     return  partidoDao.transferirVotos(nombreOrigen, nombreDestino, cantidadVotos);
    }
    
}
