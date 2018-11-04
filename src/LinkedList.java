public class LinkedList<T> {
    Node<T> head;
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
    public void Add(T item){
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

    public void Add(T item, int pos){

    }
    //endregion

    //region Helper Methods

    /*
    * Print the nodes
    * and the items in them
    * */
    public void Print(){
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
    private void makeEmpty(){
        head = null;
        count = 0;
    }
    //endregion

}
