package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClonedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> ar1=new ArrayList<String>();
ar1.add("SA");
ar1.add("WI");
ar1.add("IND");
ar1.add("NZ");

@SuppressWarnings("unchecked")
ArrayList<String> ar2=(ArrayList<String>)ar1.clone();
System.out.println(ar2);

ArrayList<Integer> ar3=new ArrayList<Integer>(Arrays.asList(1,2,3,5,4,6,7,8,9));
ar3.removeIf(num -> num%2!=0);
System.out.println("the even number list is "+ar3);
	

	}

}
