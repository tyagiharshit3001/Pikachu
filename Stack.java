

class Stack{
	int[] stack;
	int toS;
	int size=-1;
	
	Stack(int size){
		this.size = size;
		this.stack = new int[this.size];
		this.toS = -1;
	}
	
	public void push(int ele) {
		if(!this.isFull()) {
			this.toS++;
			this.stack[this.toS] = ele;
			
		}else
			System.out.println("Stack OverFlow!!!");
	}
	
	public void pop() {
		if(!this.isEmpty()) {
			System.out.println(this.stack[this.toS]);
			this.toS--;
		}else
			System.out.println("Stack OverFlow!!!");
	}
	
	public boolean isEmpty() {
		if (this.toS ==-1)
			return true;
		else 
			return false;
	}
	
	public boolean isFull() {
		if (stack.length == this.toS)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		Stack s1 = new Stack(10);
		System.out.println(s1.isEmpty());
		System.out.println(s1.isFull());
		s1.push(0);
		s1.push(9);
		s1.push(6);
		s1.push(11);
		System.out.println(s1.toS);
	}
}