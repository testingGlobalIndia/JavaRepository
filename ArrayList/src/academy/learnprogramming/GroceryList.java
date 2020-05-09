package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("you have "+groceryList.size() + " item in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1) + ". "+groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1) + " has been modified");
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryItem(position,newItem);
        }
    }

    public void removeGroceryItem(String newItem){
        int position = findItem(newItem);
        if(position >=0){
            removeGroceryItem(position);
        }
    }

    public boolean onFile(String searchItem){
        int position = groceryList.indexOf(searchItem);
        if(position >=0){
            return true;
        }
        else{
            return false;
        }
    }

}
