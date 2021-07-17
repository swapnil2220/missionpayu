package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Collections.synchronizedList(new ArrayList<String>());
names.add("sam");
names.add("shawn");
names.add("peter2");
//while fetching we need explicit synchronization

synchronized (names) {
	Iterator<String> it=names.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
		
	}

}
