package google20;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int[] nums1 = {3, 7, 42, 10};
		int[] nums2 = {99, 1, 8, 87};
		
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		for(int x : nums1) list1.add(x);
		for(int x : nums2) list2.add(x);
		
		ArrayList<Integer> intersects = new ArrayList<Integer>();
		
		list1.stream()
		     .forEach(e -> list2.stream()
		    		 			.filter(f -> f == e)
		    		 			.forEach(x->intersects.add(x))
		    		 );
		
		if(intersects.size() > 0) {
			System.out.println("Lists intersect at node "+ intersects.get(0));
		}else {
			System.out.println("No Intersecting Nodes");
		}
	}

}
