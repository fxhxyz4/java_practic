import java.util.ArrayList;

public class MyArrayList {
    private int capacity;
    private ArrayList<Box> arrayList = new ArrayList<Box>(10);

    public MyArrayList() {
        this.capacity = 10;
        arrayList = new ArrayList<>(capacity);
    }

    public MyArrayList(int initialCapacity) {
        this.capacity = initialCapacity;
        arrayList = new ArrayList<>(capacity);
    }

    private void ensureInternalCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            capacity = Math.max(minCapacity, capacity * 2);
            ArrayList<Box> newList = new ArrayList<>(capacity);

            newList.addAll(arrayList);
            arrayList = newList;
        }
    }

    public void add(Box e) {
        ensureInternalCapacity(arrayList.size() + 1);
        arrayList.add(e);
    }

    public void add(int index, Box element) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("index exception");
            return;
        }

        ensureInternalCapacity(arrayList.size() + 1);
        arrayList.add(index, element);
    }

    public void addAll(Box[] c) {
        ensureInternalCapacity(arrayList.size() + c.length);
        for (Box elem : c) arrayList.add(elem);
    }

    public void addAll(int index, Box[] c) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("index exception");
            return;
        }

        ensureInternalCapacity(arrayList.size() + c.length);
        for (int i = 0; i < c.length; i++) {
            arrayList.add(index + i, c[i]);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            capacity = minCapacity;
            ArrayList<Box> newList = new ArrayList<>(capacity);
            newList.addAll(arrayList);
            arrayList = newList;
        }
    }

    public Box get(int index) {
        if (index < 0 || index >= arrayList.size()) {
            System.out.println("index exception");
            return null;
        }

        return arrayList.get(index);
    }

    public void set(int index, Box element) {
        if (index < 0 || index >= arrayList.size()) {
            System.out.println("index exception");
            return;
        }

        arrayList.set(index, element);
    }

    public Box remove(int index) {
        if (index < 0 || index >= arrayList.size()) {
            System.out.println("index exception");
            return null;
        }

        Box removed = arrayList.remove(index);

        if (arrayList.size() <= capacity / 2 && capacity > 10) {
            capacity = Math.max(capacity / 2, 10);
            ArrayList<Box> newList = new ArrayList<>(capacity);

            newList.addAll(arrayList);
            arrayList = newList;
        }

        return removed;
    }

    public int size() {
        return arrayList.size();
    }
}
