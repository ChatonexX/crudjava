package prueba.crud.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    //
    @Autowired
    private UsuarioRepository usuarioRepository;

    //CRUD Methods
    //Create a new Usuario
    public Usuario save(Usuario entity){
        return usuarioRepository.save(entity);
    }

}
