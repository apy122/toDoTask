package negocio;
import javabeans.Task;
import java.util.List;

public interface ICRUDGeneric<T, id> {
    T findById(int id);
    int insertOne(T objeto);
    int updateOne(T objeto);
    int deleteById(id atributoPk);
    int deleteByObjeto(T objeto);
    List<T> findAll();
}
