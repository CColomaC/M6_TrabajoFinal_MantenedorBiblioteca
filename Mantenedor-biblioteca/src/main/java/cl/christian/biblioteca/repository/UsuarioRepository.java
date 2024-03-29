package cl.christian.biblioteca.repository;

import java.util.List;

import cl.christian.biblioteca.model.Usuario;

public interface UsuarioRepository {

	public List<Usuario> findAll();
	
	public int count();
	
	public Usuario findById(Long id);
	
	public void create(Usuario usuario);
	
	public void edit(Usuario usuario);
	
	public void delete(Long id);
	
	public Usuario findByEmail(String email);
}