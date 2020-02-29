package com.distribuida.service;

import java.util.List;

import com.distribuida.dto.Usuario;

public interface UserService {
	public Usuario obtenerUsuarioPorId(Integer id);
	public List<Usuario> obtenerUsuarios();
	
}
