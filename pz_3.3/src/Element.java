public class Element {
    private Integer value;
    private Element next;

    public Element(Integer value) {
        this.value = value;
        this.next = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Element next() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Integer getElement() {
        return value;
    }

    public void setElement(Integer value) {
        this.value = value;
    }
}