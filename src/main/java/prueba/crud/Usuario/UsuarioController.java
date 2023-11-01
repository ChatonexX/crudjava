package prueba.crud.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
@CrossOrigin({"*"})
public class UsuarioController {
    //Consumir el servicio
    @Autowired
    private UsuarioService usuarioService;
    //Metodo para crear la sub ruta de crate
    @PostMapping("/")
    public Usuario save(@RequestBody Usuario entity)
    {
        return usuarioService.save(entity);
    }
}
