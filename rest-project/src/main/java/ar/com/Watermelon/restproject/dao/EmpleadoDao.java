package ar.com.Watermelon.restproject.dao;

import org.springframework.transaction.annotation.Transactional;

import ar.com.Watermelon.restproject.model.Empleado;

@Transactional
public interface EmpleadoDao extends BaseDao<Empleado> {

}
