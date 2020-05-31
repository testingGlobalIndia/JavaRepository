package academy.learnprogramming;

public class MyLinkList implements  NodeList{

    private ListItem root = null;

    public MyLinkList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        int comparision = newItem.compareTo(currentItem);
        if(comparision < 0){
            if(currentItem.next() !=null){
                currentItem = currentItem.next();
            }else{
                currentItem.setNext(newItem);
                newItem.setPrevious(currentItem);
            }
            if(comparision > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);

                }else{
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            }else{
                System.out.println(newItem.getValue() + " is already present, not added");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
