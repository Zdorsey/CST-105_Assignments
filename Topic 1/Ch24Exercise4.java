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
			//creating integers for my while loop
			int number = 3;
			int times = 0;
			// a while loop to check for prime numbers and then stores them in the stack
			while (number < 50) {
				boolean isPrime = true;
				for (int divisor = 1; divisor < number; divisor++) {
					while (divisor!=1 && number%divisor==0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					myStack.push(number);
					times++;
				}
				number++;
			}
			// another while loop that prints the last item added to the stack
			while (myStack.getSize() > 0) {
				System.out.println(myStack.pop());
			}
			
		}


	}
