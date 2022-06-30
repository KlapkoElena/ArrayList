package List;

import java.util.*;

public class Element implements List<Integer> {

    public int size;
    public int[] Element = new int[4];
    public int element;

    public Element(int size) {
        this.size = size;
    }

    public static int[] array(int size) {
        int[] elementN = new int[size];
        for (int i = 0; i < size - 1; i++) {
            elementN[i] = 0;
        }
        return elementN;
    }

    public void add(int element) {
        this.element++;
        if (this.element > this.size) {
            return;
        }
        Element[this.element - 1] = element;
    }

    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (Element[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                ", Element=" + Arrays.toString(Element) +
                '}';
    }

    public boolean add(int index, int element) {
        this.element++;
        int temporary;
        int i = 0;
        temporary = Element[index + i];
        Element[index + i] = element;
        i++;

        while (i < size - index) {
            int temporary2 = Element[index + i];
            Element[index + i] = temporary;
            i++;
            temporary = temporary2;
        }
        return true;
    }

    @Override
    public Integer remove(int index) {
        Element[index] = 0;
        return null;
    }

    @Override
    public Integer set(int index, Integer element) {
        Element[index] = element;
        return null;
    }

    @Override
    public void clear() {
        Element = array(size);
    }

    @Override
    public Integer get(int index) {
        return Element[index];
    }

    @Override
    public int size() {
        return this.size;
    }

    public void removeByValue(int element) {
        for (int i = 0; i < Element.length; i++) {
            if (Element[i] == element) {
                Element[i] = 0;
            }
        }
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void add(int index, Integer element) {
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

}
