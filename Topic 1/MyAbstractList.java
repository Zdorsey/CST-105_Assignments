
public abstract class MyAbstractList<E> implements MyList<E> {
	protected int size = 0;
	protected MyAbstractList() { }
	
	protected MyAbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	
	public boolean addAll(MyList<E> otherList) {
		for (int i =  0; i < otherList.size(); i++) {
			E value =	otherList.get(i);
			add(value);
		}
		return otherList.size() != 0;
	}
	
	public boolean removeAll(MyList<E> otherList) {
		int originalSize = size();
		for (int i =  0; i < otherList.size(); i++) {
			E value = otherList.get(i);
			remove(value);
		}
		return originalSize != size();
	}
	
	public boolean retainAll(MyList<E> otherList) {
		int originalSize = size();
		for (int i =  size()-1; i > -1; i--) {
			E value = get(i);
			if (!otherList.contains(value)) {
				remove(value);
			}	
		}
		return originalSize != size();
	}
	
	@Override
	public void add(E e) {
		add(size, e);
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override
	public int size() {
		return size;	
	}
	
	@Override
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		}
		else
			return false;
	}

}
