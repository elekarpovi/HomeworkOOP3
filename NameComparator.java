import java.util.Comparator;

public class NameComparator<E> implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
