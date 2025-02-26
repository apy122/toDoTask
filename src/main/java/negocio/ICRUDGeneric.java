package negocio;
import javabeans.Task;
import java.util.List;

public interface ICRUDGeneric<J, id> {
    J findById(id id);
    int insertOne(Task objeto);
    int updateOne(J objeto);
    int deleteById(id atributoPk);
    int deleteByObjeto(J objeto);
    List<J> findAll();
}
