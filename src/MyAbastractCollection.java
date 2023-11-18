import java.util.Iterator;

public abstract class MyAbastractCollection implements MyCollection{
    @Override
     public abstract int size();

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public abstract boolean contains(Object o);
    public abstract Iterator<Object> iterator();


    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        Iterator<Object> it = iterator();
        if (o==null) {
            while (it.hasNext()) {
                if (it.next()==null) {
                    it.remove();
                    return true;
                }
            }
        } else {
            while (it.hasNext()) {
                if (o.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        boolean modified = false;
        Iterator<?> it = iterator();
        while (it.hasNext()) {
           it.next();
           it.remove();
           modified = true;
        }
        return modified;
    }

    @Override
    public void clear() {
        Iterator<Object> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
