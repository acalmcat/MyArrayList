import java.util.Arrays;
import java.util.Iterator;

public interface MyList {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator<Object> iterator();

    Object[] toArray();

    boolean add(Object e);

    boolean remove(Object o);

    boolean removeAll();

    default void sort(Object[] objs) {
        Arrays.sort(objs);
    }

    boolean equals(Object o);

    int hashCode();
    Object get(int index);
    Object set(int index, Object element);
    void add(int index, Object element);
    Object remove(int index);
    int indexOf(Object o);

}
