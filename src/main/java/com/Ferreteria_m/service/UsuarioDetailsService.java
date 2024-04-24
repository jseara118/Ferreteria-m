
package com.Ferreteria_m.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UsuarioDetailsService {
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
    
    
}

