import java.util.List;

/**
 * Created by ozinal on 08/09/17.
 */
interface Database
{
    Boolean save(Student student);
    List<String> getAll();
}
