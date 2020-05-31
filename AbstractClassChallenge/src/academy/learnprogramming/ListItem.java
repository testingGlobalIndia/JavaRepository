package academy.learnprogramming;

import java.util.LinkedList;
import java.util.ListIterator;

public abstract class ListItem {
    protected Object value;
    public ListItem rightLink = null;
    public ListItem leftLink = null;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract  ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
