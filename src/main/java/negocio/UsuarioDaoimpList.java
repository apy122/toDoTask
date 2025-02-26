package negocio;

import javabeans.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoimpList implements IUsuarioDao {
    private static final List<Usuario> usuarios;

    static {
        usuarios = new ArrayList<> ( );
    }


    @Override
    public UsuarioDaoimpList findById(int id) {
        List<Usuario> resultado= new ArrayList<> ();
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                resultado.add(usuario);
                return (UsuarioDaoimpList) resultado;
            }
        }
        return null;
    }

    @Override
    public int insertOne(IUsuarioDao usuario) {
       if (usuarios.contains(usuario)) {
           return 0;
       }else{
           return 1;
       }
    }

    @Override
    public int updateOne(IUsuarioDao id) {
        int posicion = usuarios.indexOf (id);
        if (posicion == -1) {
            usuarios.set(posicion, (Usuario) id);
            return 1;
        } else{
            return 0;
        }
    }

    @Override
    public int deleteById(Integer id) {
        for(Usuario usuario : usuarios){
            if (usuario.getId() == id){
                usuarios.remove(usuario);
                return 1;
            }
        }
        return 0;
    }

    @Override
    public int deleteByObjeto(IUsuarioDao objeto) {
        return 0;
    }

    @Override
    public List<IUsuarioDao> findAll() {
        if (usuarios.isEmpty()) {
            return new ArrayList<> ();
        }else{
            return ((IUsuarioDao) usuarios).findAll ();
        }
    }

}
