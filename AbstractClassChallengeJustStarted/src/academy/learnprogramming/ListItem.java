package academy.learnprogramming;

public abstract class ListItem {
    protected ListItem rightLink;
    protected ListItem leftLink;

    protected String value;

    public ListItem(String value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
