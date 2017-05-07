import java.io.Console;
import java.util.*;
public class Exercise1 
{
	public static void main(String[] args)
	{
	    
		MyList<String> list1 = new MyArrayList<String>();
		MyList<String> list2 = new MyArrayList<String>();
		
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		String[] l1 = new String[5];
		String[] l2 = new String[5];
		for (int i =  0; i < list1.size(); i++) 
		{
			l1[i] = list1.get(i);
			l2[i] = list2.get(i);
		}
		System.out.println(list1);
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n\n");
		
		list1.clear();
		list2.clear();
		list1= new MyArrayList<String>(l1);
		list2 = new MyArrayList<String>(l2);
		list1.removeAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n\n");
		
		list1.clear();
		list2.clear();
		list1 = new MyArrayList<String>(l1);
		list2 = new MyArrayList<String>(l2);
		list1.retainAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n\n");
		
	}

}
