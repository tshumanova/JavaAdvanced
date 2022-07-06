package Java_Advanced.Iterators.T07_WorkShop;

public class SmartArray {
    private int[] data;
    private int nextFreeIndex;

    public SmartArray() {
        this.data = new int[4];
        this.nextFreeIndex = 0;
    }

    public void add(int element) {
        this.data[nextFreeIndex] = element;
        nextFreeIndex++;
    }
}
