package ArrayListtests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>nameList=new ArrayList<String>(Arrays.asList("Sam","gaurav","myank","Sam"));
nameList.retainAll(Collections.singleton("Sam"));
System.out.println(nameList);
	}

}
