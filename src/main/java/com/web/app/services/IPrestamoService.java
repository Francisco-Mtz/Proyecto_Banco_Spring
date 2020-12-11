package com.web.app.services;

import java.util.List;

import com.web.app.models_entitys.Prestamo;

public interface IPrestamoService {
	
	void insert (Prestamo p);
	List<Prestamo> findAll();
	public List<Prestamo> findAllJoin();
	Prestamo find(Integer id);
	Prestamo updateMonto(Integer id,float monto);
	List<Prestamo> PrestamosPagados();
	void delete(Integer id);
	List<Prestamo> PrestamosActivos();
	public List<Prestamo> findInDates(String DateA , String DateB);
	public List<Prestamo> findIdCliente(Integer idCliente);
	public Integer getIdNewPrestamoId();
}
