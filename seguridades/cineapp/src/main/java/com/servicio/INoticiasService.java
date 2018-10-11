package com.servicio;

import java.util.List;

import com.modelo.Noticia;

public interface INoticiasService {

	void guardar(Noticia noticia);
	List<Noticia> buscarUltimas();
	List<Noticia> buscarTodas();
	void eliminar(int idNoticia);
	Noticia buscarPorId(int idNoticia);
}
