import java.util.HashMap;

/**
 * Created by ozinal on 08/09/17.
 */
public class Student
{
    private String firstName;

    private String lastName;

    private HashMap<String, Double> lessons;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, Double> getLessons() {
        return lessons;
    }

    public void setLessons(HashMap<String, Double> lessons) {
        this.lessons = lessons;
    }
}
