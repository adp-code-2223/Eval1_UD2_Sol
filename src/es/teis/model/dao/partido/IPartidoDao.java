/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package es.teis.model.dao.partido;

import es.teis.model.Partido;
import es.teis.model.dao.IGenericDao;

/**
 *
 * @author mfernandez
 */
public interface IPartidoDao extends IGenericDao<Partido> {

    boolean existe(String nombre);

    boolean transferirVotos(String nombreOrigen, String nombreDestino, int cantidadVotos);
}
