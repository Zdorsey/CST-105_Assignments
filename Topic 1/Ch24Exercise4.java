	import java.util.*;
public class Exercise4<E> {
		private java.util.ArrayList<E> list = new java.util.ArrayList<>();
		
		public int getSize() {
			return list.size();
		}
		
		public E peek() {
			return list.get(getSize()-1);
		}
		
		public void push(E o) {
			list.add(o);
		}
		
		public E pop() {
			E o = list.get(getSize()-1);
			list.remove(getSize()-1);
			return o;
		}
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		@Override
		public String toString() {
			return "stack: " + list.toString();
		}
		
		public static void main(String[] args) {
			java.util.ArrayList<Integer> primeList = new java.util.ArrayList<>();
			Exercise4<Integer> myStack = new Exercise4<Integer>();
			
			int num = 3;
			int count = 0;
			
			while (num < 50) {
				boolean isPrime = true;
				for (int divisor = 1; divisor < num; divisor++) {
					while (divisor!=1 && num%divisor==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					myStack.push(num);
					count++;
				}
				
				num++;
			}
			while (myStack.getSize() > 0) {
				System.out.println(myStack.pop());
			}
			
		}


	}
