package sets;
/* Give an array, find if there exists a subarray with sum equals to zero. 
 * n<10^5
 * */
/* a=[3,4,-1,4,3,-6,-7,2]
 * find the sub array and the sum of the elements*/
import java.util.*;
public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,-4,2};
		int k =3;
		boolean found = false;
		
//		for(int i =0;i<a.length;i++) {
//			int sum =0;
//			for (int j=i; j<a.length;j++) {
//				sum += a[j];
//				if(sum == 0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		Set<Integer> set = new HashSet<>(); 
		int sum =0;
		for(int element:a) {
			set.add(sum);
			sum += element;
			if (set.contains(sum-k)) {
				found= true;
				break;
			}
		}
		System.out.println("Found " + found);
	}

}
