package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set <Integer> first =new HashSet<Integer>();
first.addAll(Arrays.asList(1,3,4,5,6,6,7));


Set <Integer> second =new HashSet<Integer>();
second.addAll(Arrays.asList(1,3,7,9,2,6,7));

Set <Integer>union=new HashSet<Integer>(first);
union.addAll(second);
System.out.println(union);

Set<Integer>intersection =new HashSet<Integer>(first);
intersection.retainAll(second);
System.out.println(intersection);

Set<Integer>diff =new HashSet<Integer>(first);
diff.removeAll(second);
System.out.println(diff);

	}

}
