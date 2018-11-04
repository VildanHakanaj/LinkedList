import java.util.Scanner;

public class LinkedList<T> {
    private Node<T> head;
    private int count;

    public LinkedList(){
        makeEmpty();
    }

    //region Main Methods


    /*
    * Add method will add the item
    * given at the end of the list
    *
    * @param => T item : Item to be inserted
    * @return => void.
    * */
    public void add(T item){
        Node<T> pointer = head;                     //Pointer to be used to nav the list

        if(isEmpty()){                              //Check if the list is empty
            head = new Node<T>(item);               //Set the new node to be the head
        }else{
            while(pointer.getNext() != null){       //Else check if there is the need to move the pointer
                pointer = pointer.getNext();        //Move the pointer to the next node
            }
            pointer.setNext(new Node<T>(item));     //Check if the
        }
        count++;
    }
    
    /*
    * Add the item at a certain position
    * @param => T Item: item to insert
    * @param => int pos: the position of the insertion
    * @return => void
    * */
    public void add(T item, int pos){
        Node<T> pointer = head;
        if(isEmpty()){                                                      //Check if the list is empty
            System.out.println("The list is empty");                        //Don't insert it but notify the user.
        }else{
            if((size() >= pos) && (pos >= 1)){                              //Check if the user is within the range
                if(pos == 1){                                               //If the its the first position
                    addStart(item);                                         //Add to the beginning
                }else{
                    for (int i = 1; i < pos - 1; i++){                      //Loop to position
                        pointer = pointer.getNext();                        //Move the pointer
                    }
                    pointer.setNext(new Node<T>(item, pointer.getNext()));  //Add the item at the position
                }
            }else{
                System.out.printf("Invalid position");
            }
        }
    }
    //endregion

    //region Helper Methods



    /*
    * Print the nodes
    * and the items in them
    * */
    public void print(){
        Node<T> pointer = head;
        if(isEmpty()){
            System.out.println("The list is empty.");
        }else{
            while(pointer.getNext() != null){
                System.out.printf("[ %s ]=>", pointer.getItem());
                pointer = pointer.getNext();
            }
            System.out.printf("[ %s ] ==|", pointer.getItem());
        }
    }


    /*
    * Add to the beginning of the list
    * @param => T item: item to be inserted
    * */
    public void addStart(T item){
        if(isEmpty()){
            head = new Node<T>(item);
        }else{
            head = new Node<T>(item, head);
        }
    }


    /*
    * Check if  the list is empty
    * @return => true if count == 0
    * @return => false if count > 0
    * */
    private boolean isEmpty(){
        return count == 0;
    }

    /*
    * Check the size of the list
    * @return => count;
    * */
    private int size(){
        return count;
    }

    /*
     * by setting the head to null
     * Empty the list
     * and setting the count to 0;
     * */
    public void makeEmpty(){
        head = null;
        count = 0;
    }
    //endregion

}
