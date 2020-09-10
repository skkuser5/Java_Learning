package test2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListvsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lists = new ArrayList<String>();
		
		lists.add("Helen");
		lists.add("Tom");
		lists.add("Albert");
		lists.add("Albert");
		lists.add(null);
		lists.add(null);
		
//		for(String list:lists)
//		{
//			System.out.println(list);
//		}
		
//		for(int i=0;i<lists.size();i++)
//		{
//			System.out.println(lists.get(i));
//			
//		}
//		
//		System.out.println(lists.get(2));
//		
		
		//-------------------------
		
		Set<String> set = new HashSet<String>();
		
		set.add("Helen");
		set.add("Tom");
		set.add("Albert");
		set.add("Albert");
		set.add(null);
		set.add(null);
		
		for(String setvar:set) {
			System.out.println(setvar);
		}
		
		
		

	}

}
