package negocio;

import javabeans.Task;

import java.util.ArrayList;
import java.util.List;

public class ITaskDaoImpList implements ITaskDao {
    private ITaskDao dao;
    private static Task taskid;
    private static List<ITaskDao> tasks;
    static {
        tasks = new ArrayList<ITaskDao> ( );
        taskid=  new Task ();
    }

    @Override
    public ITaskDao findById(Integer atributoPK) {
        for (ITaskDao task : tasks) {
            if (taskid.getId ().equals ( atributoPK )) {
                return (ITaskDao) task;
            }
        }
        return null;
    }

    @Override
    public int insertOne(ITaskDao objeto) {
        if (tasks.contains(objeto)) {
            return 0;
        } else {
            tasks.add( objeto );
            return 1;
        }
    }

    @Override
    public int updateOne(ITaskDao objeto) {
        int pos = tasks.indexOf(objeto);
        if (pos != -1) {
            tasks.set(pos, objeto);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int deleteById(Integer atributoPk) {
        Task task = (Task) findById( atributoPk );
        if (task != null) {
            tasks.remove(task);
            return 1;
        }
        return 0;
    }

    @Override
    public int deleteByObjeto(ITaskDao task) {
        return tasks.remove (task) ? 1:0;
    }

    @Override
    public List<ITaskDao> findAll() {
        if (tasks.isEmpty ()) {
            System.out.println ( "Lista vacia" );
            return List.of (  );
        } else {
            return tasks;
        }
    }

}