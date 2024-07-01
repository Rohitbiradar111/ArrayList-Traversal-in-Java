//This program prints all the ArrayList elements in Java

import java.util.ArrayList;
public class ArrayListTraversal {
    public static void main(String args[])
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(15);
        al.add(20);
        al.add(55);
        al.add(29);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }

        System.out.println();

        //Another Method (for each loop) -
        for(int x : al)
        {
            System.out.print(x+" ");
        }

        System.out.println();

        //Another Method (for each method) - 
        al.forEach(x -> System.out.print(x+" "));
    }
}