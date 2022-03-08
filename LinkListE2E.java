class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null; 
    }
}

class LinkedListed
{
    Node head;  
 
    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);
 
        /*If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        //new_node.next = null;
 
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
 
        cur.next = new_node;
        return;
    }
 
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public boolean search(Node head, int x)
    {
        Node current = head;    //Initialize current
        while (current != null)
        {
            if (current.data == x)
                return true;    //data found
            current = current.next;
        }
        return false;    //data not found
    }

    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
 
    public static void main(String[] args)
    {
        LinkedListed llist = new LinkedListed();
        llist.append(6);
        llist.push(7);
        llist.push(1);
        llist.append(4);
 
        System.out.println("Created Linked list is: ");
        llist.printList();
    }
}
