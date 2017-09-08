import java.util.List;

/**
 * Created by ozinal on 08/09/17.
 */
public class FileDB implements Database
{
    private Logger logger;

    public FileDB(Logger logger)
    {
        this.logger = logger;
    }

    public Boolean save(Student student) {
        return null;
    }

    public List<String> getAll() {
        return null;
    }
}