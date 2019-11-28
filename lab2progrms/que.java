// Design an interface named Iqueue with the following methods:
// a) insert and delete elements from the queue
// b) check whether the queue is empty or not.
// Implement the Iqueue with the help of arrays and if the size of the array becomes too small to 
//hold the elements, create a new one. Test this interface by inheriting it in its subclass QueueTest.java.

interface Iqueue{
    void insert();
    void delete();
    void check();
}

class queue implements Iqueue{
    int front = 0, rear = 0;
    int array1[] = new int[3];
    int array2[] = new int[6];

    public void insert(int ele){
        array[++rear] = ele;
    }
}

class quedemo{
    public static void main(String[] args) {
        queue qi = new queue();

    }
}