package com.clickmed.security;

import com.clickmed.dao.UsuarioDAO;
import com.clickmed.entity.Usuario;
import com.clickmed.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
@Transactional
public class UserService implements UserDetailsService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioDAO.findByEmail(email);
        System.out.println("Usuário recuperado " + usuario);

        if (usuario == null){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return new User(usuario.getUsername(), usuario.getPassword(), true, true, true, true, usuario.getAuthorities());


/*
        User.UserBuilder builder =  null;
        if (usuario != null){
            builder = org.springframework.security.core.userdetails.User.withUsername(email);
            builder.disabled(!usuario.isEnabled());
            builder.password(usuario.getPassword());
            System.out.println("Permissoes " + usuario.getPermissao());
            String[] permissoes = usuario.getAuthorities()
                    .stream().map(a -> a.getAuthority()).toArray(String[]::new);


            builder.authorities(permissoes);
        }else{
            throw new UsernameNotFoundException("Usuário não encontrado.");
        }
        return builder.build();
*/

    }
}
