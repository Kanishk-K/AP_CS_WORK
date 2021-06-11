public class DoubleLinkedListStructure {
    public static class DoubleLinkedList{
        public class Node{
            /*
                Since LinkedLists are comprised of data packets called nodes which link each other we can declare the Node class within
                the LinkedList class. Each node is comprised of a stored value and a pointer that directs to another Node in the list.
                Nodes are initialized with a value as otherwise they are of no use.
            */
            int val;
            Node next,prev;
            public Node(int value){
                this.val = value;
            }
            public String toString(){
                return "=> [" + val + "] <=";
            }
        }
        /*
            Lists are comprised of a beginning Node called a head, this is the start of the list which will after enough iterations pass
            every node stored within. Additionally we store a variable called size so that we may know how many elements are within the array
            without having to iterate through the entire list and count. The former is an O(1) operation while the latter is a O(N) operation.
        */
        /*
            Double Linked Lists are not much different from their Single Linked counterparts with the main differences appearing in how Nodes are added to a
            Double Linked List. In this situation handling the prev variable makes this more complex, however, may offer more features in operations.
        */
        private Node head;
        private int size;
        public DoubleLinkedList(){
            /* No need to initialize anything here, the value of head should be empty initially and size should be zero. Both default values. */
        }
        public int getSize(){
            /* Return the value of the size of the array. Will not be utilized here, however, may be used in larger projects. */
            return size;
        }
        public int get(int index){
            /* Return the value of the Node at the index provided, if the index does not exist then return -1 to show that it doesn't exist. */
            if(index < 0 || index >= size){
                return -1;
            }
            else{
                /* 
                    Begin at the first node element: the head. Follow the chain of nodes until you reach the desired node at the desired 
                    index then return that node's value.
                */
                Node current = head;
                for(int i = 0;i<index;i++){
                    current = current.next;
                }
                return current.val;
            }
        }
        public int getHead(){
            return get(0);
        }
        public int getTail(){
            return get(size-1);
        }
        public void addAtIndex(int index, int val){
            if (index < 0 || index > size){
                return;
            }
            Node newNode = new Node(val);
            size++;
            if (index == 0){
                Node prev = head;
                /* With the new head, make it point to the previous head */
                newNode.next = prev;
                /* Now, make the previous head point back to this new head. */
                if (prev != null){
                    prev.prev = newNode;
                }
                /* Define the head of the list as the newNode */
                head = newNode;
            }
            else{
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
                newNode.prev = current;
                current.next = newNode;
                if (newNode.next != null){
                    newNode.next.prev = newNode;
                }
            }
        }
        public void addAtHead(int val){
            addAtIndex(0, val);
        }
        public void addAtTail(int val){
            addAtIndex(size, val);
        }
        public void deleteAtIndex(int index){
            if (index < 0 || index >= size){
                return;
            }
            size--;
            if (index == 0){
                head = head.next;
                if(head != null){
                    head.prev = null;
                }
            }
            else{
                Node current = head;
                for (int i = 0;i<index-1;i++){
                    current = current.next;
                }
                current.next = current.next.next;
                if (current.next != null){
                    current.next.next.prev = current;
                }
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
            String response = "LinkedList: null <=";
            while(current != null){
                response += (current.toString());
                current = current.next;
            }
            response += "=> null";
            return response;
        }
    }
    public static void main(String args[]){
        DoubleLinkedList ListObject = new DoubleLinkedList();
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
