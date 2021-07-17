package ArrayListtests;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonWriteArraylist {
//no explicit synchronized keyword needed here as already thread safe class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CopyOnWriteArrayList<String>nameList=new CopyOnWriteArrayList<String>(Arrays.asList("ram"));
	nameList.add("peter");
	nameList.add("swapnil");
	Iterator<String>it=nameList.iterator();{
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	}

}
