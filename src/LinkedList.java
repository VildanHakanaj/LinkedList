public class LinkedList<T> {
    Node<T> head;
    private int count;

    public LinkedList(){
        makeEmpty();
    }


    //region Helper Methods

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
