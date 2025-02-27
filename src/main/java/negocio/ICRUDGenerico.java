package negocio;
import java.util.List;

public interface ICRUDGenerico<J, ID> {

    J findById(ID atributoPK);
    int insertOne(J objeto);
    int updateOne(J objeto);
    int deleteById(ID atributoPk);
    int deleteByObjeto(J objeto);
    List<J> findAll();
}