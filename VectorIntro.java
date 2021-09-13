import java.util.Vector;

public class vector {
    public static void main(String[] args)
    {
        // Size of the Vector
        int n = 5;
  
        // Declaring the Vector with initial size n
        Vector<Integer> v = new Vector<>();//n
        System.out.println(v.capacity());
        //constructor - default and parameterised
        //contains -Returns true if this vector contains the specified element.
  
        // Appending new elements at the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);
  
        //updating elemement    
        v.set(0, 21);//(index, new element)
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the vector after deletion
        System.out.println(v);
  
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
    
}
