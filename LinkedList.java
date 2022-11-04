
public class LinkedList {
	
	private int size;
	private IntNode head;
	
	
	public LinkedList() {
		this.size = 0;
		head = null;
	}

	
	public int getSize() {
		return size;
	}

	
	public boolean isEmpty() {
		return size==0?true:false;
	}
	
	public LinkedList addTwo(LinkedList l1, LinkedList l2) {
		
		LinkedList l3 = new LinkedList();
		IntNode walk1 = l1.getHead();
		IntNode walk2 = l2.getHead();
		int firstInt = 0;
		int secondInt = 0;
		int sum;
		int carry = 0;
		int flag = 1;
		
		
		while(flag == 1) {
			
			if(l1.getSize() == 0) {
				firstInt = 0;
			}
			while(walk1 != null) {
				if(walk1.next == null) {
					firstInt = walk1.data;
					l1.removeLast();
					walk1 = l1.getHead();
					break;
				}
				walk1 = walk1.next;
			}
				
			if(l2.getSize() == 0) {
				secondInt = 0;
			}
			
			while(walk2 != null) {
				if(walk2.next == null) {
					secondInt = walk2.data;
					l2.removeLast();
					walk2 = l2.getHead();
					break;
				}
				walk2 = walk2.next;
			}
				
			sum = firstInt + secondInt + carry;
			if(carry == 1) {
				carry = 0;
			}
			if(sum >= 10) {
				sum = sum % 10;
				carry = 1;
			}
			
			l3.insertFront(sum);
				
			if(l1.isEmpty() && l2.isEmpty()) {
				flag = 0;
			}
				
		}	
		
		return l3;
	}
	
	private boolean insertFront(int newEntry) {
		
		IntNode nw = new IntNode(newEntry);
		if(head == null) {
			head = nw;
			return true;
		}

		nw.next = head;
		head = nw;
		return true;
		
		
	}


	public boolean add(int newEntry) {
		
		if(newEntry >= 10 && newEntry < 0) {
			return false;
		}
		
		IntNode newNode = new IntNode(newEntry);
		if(size == 0) {
			head = newNode;
			size++;
			return true;
		}
		
		IntNode walk = head;
		while(walk != null) {
			if(walk.next == null) {
				walk.next = newNode;
				size++;
				return true;
			}
			walk = walk.next;
		}
		
		return false;
	}

	
	public boolean removeLast() {
		
		IntNode walk = head;
		IntNode prev = null;
		
		if(this.size == 0) {
			return false;
		}
		
		if(head.next == null) {
			head = null;
			size--;
			return true;
		}
		
		while(walk != null) {
			if(walk.next == null) {
				prev.next = null;
				size--;
				return true;
			}
			prev = walk;
			walk = walk.next;
		}
		
		return false;
	}

	
	public String toString() {
		
		String str = "{";
		
		IntNode walk = head;
		while(walk != null) {
			str += walk.data;
			if(walk.next != null) {
				str += "->";
			}
			walk = walk.next;
		}
		
		str += "}";
		
		return str;
	}
	
	public IntNode getHead() {
		return head;
	}


	
}
