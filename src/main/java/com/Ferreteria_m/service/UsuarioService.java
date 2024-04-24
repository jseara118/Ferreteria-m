
package com.Ferreteria_m.service;


import com.Ferreteria_m.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    public List<Usuario> getUsuarios();
    
    public void delete(Usuario usuario);
    
    public Usuario getUsuario(Usuario usuario);
    
    public void save(Usuario usuario,boolean crearRolUser);
    
    public Usuario getUsuarioPorUsername(String username);

    public Usuario getUsuarioPorUsernameYPassword(String username, String password);
    
    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo);
    
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo);
    
}
