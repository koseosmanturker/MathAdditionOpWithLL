
public class Main {
	public static void main(String[] args) {
		
		LinkedList set1 = new LinkedList();
		LinkedList set2 = new LinkedList();
		
		set1.add(1);
		set1.add(5);
		set1.add(3);
		set1.add(3);
		set1.add(9);
		set2.add(13);
		
		// 13456
		set2.add(3);
		set2.add(5);
		set2.add(1);
		set2.add(8);
		// 3483
		System.out.println(set1);
		System.out.println(set2);
		LinkedList set3 = new LinkedList();
		set3 = set3.addTwo(set1, set2);
		System.out.println(set3);
		
		
	}

}
