package negocio;

import javabeans.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskDaoImplList implements ITaskDao {
    private static final List<Task> tasks;
    static {
        tasks = new ArrayList<>();
    }

    @Override
    public ITaskDao findById(int id) {
        List<Task> resultado= new ArrayList<>( );
        for (Task task : tasks) {
            if (task.getId() == id) {
                resultado.add(task);
                return (ITaskDao) resultado;
            }
        }
        return  null;
    }

    @Override
    public int insertOne(ITaskDao task) {
        if (tasks.contains ((Task)task)) {
            return 0;
        }else{
            tasks.add ((Task)task);
            return 1;
        }
    }

    @Override
    public int updateOne(ITaskDao objeto) {
        int posicion= tasks.indexOf((Task)objeto);
        if (posicion != -1) {
            tasks.set(posicion, (Task)objeto);
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int deleteById(Integer id) {
       for (Task task : tasks) {
           if (task.getId() == id) {
               tasks.remove ( task );
               return 1;
           }
       }
       return 0;
    }

    @Override
    public int deleteByObjeto(ITaskDao id) {
        return 0;
    }

    @Override
    public List<ITaskDao> findAll() {
        if (tasks.isEmpty()) {
            return new ArrayList<> ();
        }else{
            return ((ITaskDao) tasks).findAll ( );
        }
    }
}
