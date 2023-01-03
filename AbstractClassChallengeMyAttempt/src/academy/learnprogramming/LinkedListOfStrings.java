package academy.learnprogramming;

public class LinkedListOfStrings extends ListItem {

    public LinkedListOfStrings(String value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.right;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.right = item;
        return this.right;
    }

    @Override
    ListItem previous() {
        return this.left;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.left = item;
        return this.left;
    }

    @Override
    int compareTo(ListItem item) {
        if(item != null) {
            return super.getValue().compareTo(item.getValue());
        } else {
            return -1;
        }
    }
}
