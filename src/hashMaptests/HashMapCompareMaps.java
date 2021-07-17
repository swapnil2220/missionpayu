package hashMaptests;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompareMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String>map1=new HashMap<Integer,String>();
map1.put(1, "A");
map1.put(2, "B");
map1.put(3, "D");

HashMap<Integer,String>map2=new HashMap<Integer,String>();
map2.put(1, "A");
map2.put(2, "B");
map2.put(3, "D");
map2.put(4, "E");

//on the basis of key value pair ,using equals method
System.out.println(map1.equals(map2));
//on the basis of keyset only
System.out.println(map1.keySet().equals(map2.keySet()));
//finding out extra keys in map

HashSet<Integer>combinekeys=new HashSet<Integer>(map1.keySet());
combinekeys.addAll(map2.keySet());
combinekeys.removeAll(map1.keySet());
System.out.println(combinekeys);
	}

}
