package hashMaptests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmapbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String>capitalMap=new HashMap<String,String>();
capitalMap.put("india", "Newdelhi");
capitalMap.put("Us", "DC");
capitalMap.put("France", null);
capitalMap.put("Russia", "Berlin");
capitalMap.put(null, "Zurich");

System.out.println(capitalMap.get("india"));
System.out.println(capitalMap.getOrDefault(null, "columbo"));


System.out.println("Using Key Set ----------");
Iterator<String>it1=capitalMap.keySet().iterator();

while(it1.hasNext()) {
	String key =it1.next();
	String value=capitalMap.get(key);
	
	System.out.println("key is "+key+" value is "+value);
}
System.out.println("using EntrySet --------------");
Iterator <Entry<String,String>>it2=capitalMap.entrySet().iterator();
while(it2.hasNext()) {
	Entry<String,String>entry=it2.next();
	System.out.println("Value if key is "+entry.getKey()+"value equals"+entry.getValue());
	
	
}
System.out.println("using lambda expressions");
capitalMap.forEach((k,v) -> System.out.println("key is "+k+"value is "+v)); 
	}

}
