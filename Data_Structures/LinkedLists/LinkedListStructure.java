public class LinkedListStructure {
    public static class LinkedList{
        class Node{
            /*
                Since LinkedLists are comprised of data packets called nodes which link each other we can declare the Node class within
                the LinkedList class. Each node is comprised of a stored value and a pointer that directs to another Node in the list.
                Nodes are initialized with a value as otherwise they are of no use.
            */
            Node next;
            int value;
            public Node(int value){
                this.value = value;
            }
            public String toString(){
                return " [" + value + "] ";
            }
        }
        /*
            Lists are comprised of a beginning Node called a head, this is the start of the list which will after enough iterations pass
            every node stored within. Additionally we store a variable called size so that we may know how many elements are within the array
            without having to iterate through the entire list and count. The former is an O(1) operation while the latter is a O(N) operation.
        */
        private Node head;
        private int size;
        public LinkedList(){
            /* No need to initialize anything here, the value of head should be empty initially and size should be zero. Both default values. */
        }
        public int getSize(){
            /* Return the value of the size of the array. Will not be utilized here, however, may be used in larger projects. */
            return size;
        }
        public int get(int index){
            /* Return the value of the Node at the index provided, if the index does not exist then return -1 to show that it doesn't exist. */
            if (index < 0 || index >= size){
                /* Less than zero indexes are invalid, and any index greater than or equal to the size exceeds the indexing provided. */
                return -1;
            }
            else {
                /* 
                    Begin at the first node element: the head. Follow the chain of nodes until you reach the desired node at the desired 
                    index then return that node's value.
                */
                Node current = head;
                for (int i = 0;i<index;i++){
                    current = current.next;
                }
                return current.value;
            }
        }
        public int getHead(){
            return get(0);
        }
        public int getTail(){
            return get(size-1);
        }
        public void addAtIndex(int index, int val){
            /*
                Add a node at the index provided, if invalid bounds are given do nothing, and if an index one greater than the final index
                is provided, append the node at the end.
                LinkedList: 2 -> 6 -> 9 -> 4
                addAtIndex(1,3);
                LinkedList: 2 -> 3 -> 6 -> 9 -> 4
            */
            if (index < 0 || index > size){
                /* Negative indexing is not allowed, and any index greater than {1 + last_index} is also not allowed. */
                return;
            }
            if (index == 0){
                /* Edge case, here we must replace the head of the LinkedList, not simply rearange Node pointers. */
                Node newNode = new Node(val);
                Node prev = head;
                /* Point the newNode to the value of the head. */
                newNode.next = prev;
                /* Set newNode as the new head. */
                head = newNode;
                size++;
            }
            else{
                Node newNode = new Node(val);
                Node current = head;
                for (int i = 0;i<index-1;i++){
                    /* 
                        This loop will take {current} to the node right before the index to which we add. [] reprents selected node.
                        LinkedList: [2] -> 6 -> 9 -> 4
                        addAtIndex(3,{SOME VALUE});
                        LinkedList: 2 -> 6 -> [9] -> 4
                    */
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                size++;
            }
        }
        public void addAtHead(int val){
            /* This is simply a helper function that uses addAtIndex() */
            addAtIndex(0, val);
        }
        public void addAtTail(int val){
            /* This is simply a helper function that uses addAtIndex() */
            addAtIndex(size, val);
        }
        public void deleteAtIndex(int index){
            if (index < 0 || index >= size){
                /* At this situation again, the index is invalid. */
                return;
            }
            size--;
            if (index == 0){
                /* Edge case, we must treat the head node differently */
                head = head.next;
            }
            else{
                Node current = head;
                for (int i=0;i<index-1;i++){
                    /*
                        Returns node one index before than wanted value. See addAtIndex for more information.
                    */
                    current = current.next;
                }
                /* Point towards the Node that the deleted Node was pointing at as to not break and lose the chain. */
                current.next = current.next.next;
            }
        }
        public void deleteHead(){
            deleteAtIndex(0);
        }
        public void deleteTail(){
            deleteAtIndex(size-1);
        }
        public String toString(){
            Node current = head;
            String response = "LinkedList:";
            while(current != null){
                response += (current.toString() + "=>");
                current = current.next;
            }
            response += " null";
            return response;
        }
    }
    public static void main(String args[]){
        LinkedList ListObject = new LinkedList();
        ListObject.addAtTail(1);
        ListObject.addAtTail(9);
        ListObject.addAtTail(5);
        ListObject.addAtTail(0);
        ListObject.addAtTail(9);
        ListObject.addAtTail(3);
        System.out.println(ListObject);
        System.out.println("Print Object at Index 3: " + ListObject.get(3));
        System.out.println("Removed Object at Index 3, Head, then Tail");
        ListObject.deleteAtIndex(3);
        ListObject.deleteHead();
        ListObject.deleteTail();
        System.out.println(ListObject);
        System.out.println("Added the value 5 at Index 2.");
        ListObject.addAtIndex(2, 5);
        System.out.println(ListObject);
    }
}
