package academy.learnprogramming;

public class MyLinkedList implements NodeList {

    protected ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            //An int value: 0 if the string is equal to the other string.
            //< 0 if the string is lexicographically less than the other string
            //> 0 if the string is lexicographically greater than the other string (more characters)
            if(comparison < 0) {
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            }
        }
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
