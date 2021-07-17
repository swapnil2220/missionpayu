package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicatesfromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>dupnums=new ArrayList<Integer>(Arrays.asList(1,2,1,3,4,2,3,5,1,6));
LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(dupnums);
ArrayList<Integer> uniquenums=new ArrayList<Integer>(lhs);
System.out.println(uniquenums);


//using java 8 streams ,duplicate removal.

ArrayList <Integer>marksList=new ArrayList<Integer>(Arrays.asList(33,33,54,55,66,76,67,76));
List<Integer> uniquemarks=marksList.stream().distinct().collect(Collectors.toList());
System.out.println(uniquemarks);
	}

}
