import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(10);
		set.add(20);
		set.add(60);
		set.add(40);
		set.add(50);
		System.out.println(set); /// tree set default sort in asecending order
		
		// System.out.println(set.first()); /// it return first element of set
		
		// System.out.println(set.last());  // it return the last element of set
		
		// System.out.println(set.pollFirst());  //  it return and remove the first element of set
		// System.out.println(set);
		
		// System.out.println(set.pollLast()); // it return and remove the last element of set
		// System.out.println(set);
		
		// System.out.println(set.lower(40)); // it return lower element from given perticular value
		// System.out.println(set.higher(40)); // it return the higher element from given perticular value
		
		
		// System.out.println(set.floor(16)); // it return the below close value of given element
		// System.out.println(set.ceiling(25)); // it return the above close value of given element
		
		// System.out.println(set.subSet(20, 50)); // return between value of given two element
		
		// System.out.println(set);
		
		// System.out.println(set.headSet(30));  // it return  all below value given perticular value 
		// System.out.println(set.tailSet(35));  // it return all above value of given perticular value
		
		
         
	}


}
