package T7_Generics;

import java.util.ArrayDeque;

public class P01_Jar<E> {
    private ArrayDeque<E> elements;

    public P01_Jar() {
        this.elements = new ArrayDeque<>();
    }

    public void add(E element) {
        elements.add(element);
    }

    public E remove() {
        return elements.pop();
    }
}
