import java.util.Iterator;

public abstract class MyAbstractArrayList extends MyAbastractCollection implements MyList {
    public boolean add(Object e) {
        add(size(), e);
        return true;
    }
    abstract public Object get(int index);
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    public Object remove(int index) {
        throw new UnsupportedOperationException();
    }
    public abstract int indexOf(Object o);
    public abstract int lastIndexOf(Object o);
    public void clear() {
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
