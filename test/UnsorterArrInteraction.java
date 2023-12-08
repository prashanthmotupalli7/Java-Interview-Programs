package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnsorterArrInteraction {
	
	public void intersactionOfArray(int arr1[],int arr2[],Set<Integer> instersect) {
		Set<Integer> tempSet=new HashSet<Integer>() ;
		int i=0;
		int j=0;
		
		while(i<arr1.length) {
			tempSet.add(arr1[i++]);
			
		}
		
		
		while(j<arr2.length) {
			if(tempSet.contains(arr2[j])) {
				instersect.add(arr2[j]);
			}
			j++;
		}
	}
	
	
public static void main(String[] args) {
	
	UnsorterArrInteraction uai= new UnsorterArrInteraction();
	int arr1[]= {1,2,3,4,5,6};
	int arr2[]= {4,5,6,9,7,11,5,6};
	Set<Integer> instersect=new HashSet<>();
	
      uai.intersactionOfArray(arr1, arr2, instersect);
      System.out.println(instersect);


		
	}

}
