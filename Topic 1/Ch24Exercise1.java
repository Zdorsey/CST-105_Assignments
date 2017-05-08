import java.io.Console;
import java.util.*;
public class Exercise1 
{
	public static void main(String[] args)
	{
	    //creates the two lists
		MyList<String> list1 = new MyArrayList<String>();
		MyList<String> list2 = new MyArrayList<String>();
		//adds items to list one
		list1.add("Tom");
		list1.add("George");
		list1.add("Peter");
		list1.add("Jean");
		list1.add("Jane");
		//adds items to list two
		list2.add("Tom");
		list2.add("George");
		list2.add("Michael");
		list2.add("Michelle");
		list2.add("Daniel");
		//creates 2 strings for retrieval of values
		String[] l1 = new String[5];
		String[] l2 = new String[5];
		//a for loop tasked with getting the values in the loops and assigning them to the strings
		for (int i =  0; i < list1.size(); i++) 
		{
			l1[i] = list1.get(i);
			l2[i] = list2.get(i);
		}
		//prints original lists and then adds second list to the first and prints them
		System.out.println(list1);
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n");
	 	//removes everything in the second list from the first
		list1.clear();
		list2.clear();
		list1= new MyArrayList<String>(l1);
		list2 = new MyArrayList<String>(l2);
		list1.removeAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n");
		//keeps anything in the second list that is also in the first
		list1.clear();
		list2.clear();
		list1 = new MyArrayList<String>(l1);
		list2 = new MyArrayList<String>(l2);
		list1.retainAll(list2);
		System.out.println(list1 + "\n" + list2 + "\n");
		
	}

}
