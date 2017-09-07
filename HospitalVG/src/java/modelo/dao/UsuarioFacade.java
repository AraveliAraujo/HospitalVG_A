package modelo.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import modelo.entity.Usuario;
import servicios.Funciones;

@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "HospitalVGPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }
    
    public Usuario validarUsuario(Usuario us){
        Usuario user = null;
        String clave = Funciones.encriptar(us.getPwdusu());
        String jpql = "SELECT u FROM Usuario u WHERE u.usuusu = :usuusu and u.pwdusu = :pwdusu";
        Query query = getEntityManager().createQuery(jpql);
        query.setParameter("usuusu", us.getUsuusu());
        query.setParameter("pwdusu", clave);
        List<Usuario> lista;
        lista = query.getResultList();
        if(lista.size() > 0){
            user = lista.get(0);
        }
        return user;
    }
    
}
