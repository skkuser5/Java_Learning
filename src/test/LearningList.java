package test;

import java.util.ArrayList;
import java.util.List;

public class LearningList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		List<String> nameList= new ArrayList<String>();
		nameList.add("Alex");
		nameList.add("Pam");
		nameList.add("Adam");
		//nameList.remove(1);
		//Array
		
//		  String[] nameArr= new String[3]; nameArr[0]="Alex"; nameArr[1]="Pam";
//		  nameArr[2]="Adam";
//		  
//		  
//		  for(int i=0;i<nameArr.length;i++) { System.out.println(nameArr[i]); }
		
		
		 
		for(int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		
		
	}

}
