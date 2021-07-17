package hashMaptests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompareValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//method 1 where duplicate are alowed using Araylist
		
HashMap<Integer,String>map1=new HashMap<Integer,String>();
map1.put(null, null);
map1.put(2, "B");
map1.put(3, "C");
map1.put(4, "D");


HashMap<Integer,String>map2=new HashMap<Integer,String>();
map2.put(1, "A");
map2.put(2, "B");
map2.put(3, "C");
map2.put(4, "D");
map2.put(5, "C");

System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));

	}

}
