/**
 *
 * @author Diego Estrada 18540
 * @author Isabel Ortiz 18176
 * Extraído de: Java Structures (2007), Duane A. Bailey.
 */
public interface PriorityQueue<E extends Comparable<E>> {
    public E getFirst();
    public E remove();
    public void add(E value);
    public boolean isEmpty();
    public int size();
}