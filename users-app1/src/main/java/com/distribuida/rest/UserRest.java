package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Usuario;
import com.distribuida.service.UserService;

@Path("users")
@ApplicationScoped
public class UserRest {

	@Inject
	private UserService srv;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarUsuarios() {
		return srv.obtenerUsuarios();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Usuario usuarioPorId(@PathParam("id") Integer id) {
		return srv.obtenerUsuarioPorId(id);
	}
	
	@GET
	@Path(value = "/pingUser")
	@Produces(MediaType.APPLICATION_JSON)
	public String ping() {	
		return "ok";
	}

}
