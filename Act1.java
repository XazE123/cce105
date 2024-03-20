import java.util.ArrayList;

public class Act1 {

	public static void main(String[] args) {
		
        ArrayList <Integer>list = new ArrayList<Integer>(10);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
	 	System.out.println(list + "; sample display");
		 list.add(3, 2 );
	     list.add(5, 2);
	     list.add(7, 2);
         System.out.println(list+ "; sample display");
          list.get(0); 
          list.get(1); 
          list.get(2); 
          list.add(3,3);
          list.add(5,4);
          list.add(9,5);
          System.out.println(list+ "; sample display");
           list.set(0, 6 );
           list.set(5, 5 );
           list.set(6, 5 );
           list.set(8, 4 );
           list.set(9, 4 );
           list.remove(10);
           list.remove(10);
           
           list.remove(0);
           list.remove(2);
           list.remove(2);
           list.remove(2);
           list.remove(3);
           list.remove(3);
           System.out.println(list+ "; sample display");
           System.out.println("[" + list.size() +"]"+ "; sample display");
           list.clear(); 
           System.out.println("[]"+"; sample display");
 
	}
	
}