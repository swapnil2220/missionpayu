package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylistforloopiteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> ars=new ArrayList<String>();
ars.add("sam");
ars.add("tom");
ars.add("mon");
ars.add("john");
//System.out.println(ars.get(5)); indexoutofbound excepton
for(int i =0;i<ars.size();i++) {
	System.out.println(ars.get(i));
	
}
System.out.println("method 2 -For each loop");
for(String s:ars) {
	System.out.println(s);
}
System.out.println("using streams with lambda,Java 8 ");
ars.stream().forEach(ele ->System.out.println(ele));
System.out.println("using iterator now ");
Iterator <String> it=ars.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
ArrayList<String> ar2=new ArrayList<String>(Arrays.asList("swap","srish"));
System.out.println(ar2.size());

	}

}
