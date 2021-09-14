import java.util.LinkedList;

public class LLIntro {
    public static void main(String args[]) {
    
        LinkedList<String> ll = new LinkedList<>();

		// Adding elements to the linked list
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
      System.out.println(ll);
		ll.addFirst("D");
		ll.add(2, "E");

        ll.set(1, "Z"); //updation 

		System.out.println(ll);

		ll.remove("B");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll); //[Z]
    System.out.println(ll.get(0));

    }
}
