package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListSublistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>sl=new ArrayList<Integer>(Arrays.asList(1,3,4,5,6,7,8));

ArrayList<Integer>sublist=new  ArrayList<Integer>(sl.subList(2, 6));
System.out.println(sublist);
	}

}
