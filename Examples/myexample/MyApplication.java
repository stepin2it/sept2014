import java.util.List;
import java.util.ArrayList;
public class MyApplication
{
    public static List<Person> mPersons = new ArrayList<Person>();

    public static void main(String[] args)
    {
        Person p = new Person("John", 21);
        mPersons.add(p);
        p = new Person("Smith", 22);
        mPersons.add(p);
        p = new Person("James", 23);
        mPersons.add(p);

        for (Person person : mPersons)
        {
            person.printPersonData();
        }
    }
}


        


