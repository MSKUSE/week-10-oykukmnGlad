public class StackItem {

    private Object item;
    private Stack next;

    public StackItem(){

    }

    public StackItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Stack getNext() {
        return next;
    }

    public void setNext(StackItem next) {

        this.item = next;
    }
}
