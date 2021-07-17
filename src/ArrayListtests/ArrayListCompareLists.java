package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompareLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>l1=new ArrayList<String>(Arrays.asList("A","B","F","I"));
ArrayList <String>l2=new ArrayList<String>(Arrays.asList("V","I","B"));
Collections.sort(l1);
Collections.sort(l2);
System.out.println(l1+""+l2);

System.out.println(l1.equals(l2));

ArrayList <String>list1=new ArrayList<String>(Arrays.asList("A","C","E","I"));
ArrayList <String>list2=new ArrayList<String>(Arrays.asList("A","C","E","B"));

/*
 * list1.removeAll(list2); //finding additional element in list1 from list2
 * System.out.println(list1);
 */

list1.retainAll(list2);
System.out.println(list1);


	}

}
