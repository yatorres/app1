package com.distribuida.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Usuario;

@ApplicationScoped
@Transactional
public class UserServiceImpl implements UserService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Usuario obtenerUsuarioPorId(Integer id) {
		return em.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> obtenerUsuarios() {
		return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
	}

}
