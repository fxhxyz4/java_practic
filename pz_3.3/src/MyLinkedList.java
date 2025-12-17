public class MyLinkedList {
    private Element head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addFirst(Integer e) {
        Element newElement = new Element(e);
        newElement.setNext(head);

        head = newElement;
        size++;
    }

    public void addLast(Integer e) {
        if (head == null) {
            addFirst(e);
            return;
        }

        Element temp = head;
        while (temp.hasNext()) {
            temp = temp.next();
        }

        temp.setNext(new Element(e));
        size++;
    }

    public void add(Integer e) {
        addLast(e);
    }

    public void add(int index, Integer element) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if (index == 0) {
            addFirst(element);
            return;
        }

        Element prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next();
        }

        Element newElement = new Element(element);
        newElement.setNext(prev.next());

        prev.setNext(newElement);
        size++;
    }

    public Integer getFirst() {
        if (head == null) return null;
        return head.getElement();
    }

    public Integer getLast() {
        if (head == null) return null;

        Element temp = head;

        while (temp.hasNext()) {
            temp = temp.next();
        }

        return temp.getElement();
    }

    public Integer get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Element temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next();
        }

        return temp.getElement();
    }

    public Integer removeFirst() {
        if (head == null) return null;
        Integer val = head.getElement();

        head = head.next();
        size--;

        return val;
    }

    public Integer removeLast() {
        if (size == 0) return null;
        if (size == 1) return removeFirst();

        Element prev = head;

        for (int i = 0; i < size - 2; i++) {
            prev = prev.next();
        }

        Integer val = prev.next().getElement();
        prev.setNext(null);

        size--;
        return val;
    }

    public Integer remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) return removeFirst();

        Element prev = head;

        for (int i = 0; i < index - 1; i++) {
            prev = prev.next();
        }

        Integer val = prev.next().getElement();
        prev.setNext(prev.next().next());

        size--;
        return val;
    }

    public void set(int index, Integer e) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Element temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next();
        }

        temp.setElement(e);
    }

    public int size() {
        return size;
    }

    public int indexOf(Integer e) {
        Element temp = head;

        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(e)) return i;
            temp = temp.next();
        }

        return -1;
    }
}