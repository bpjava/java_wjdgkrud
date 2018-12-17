package ch11;

import java.util.*;

public class MyVector implements List {
	Object[] data = null; //��ü�� ��� ���� ��ü �迭�� �����Ѵ�.
	int capacity = 0;	  //�뷮
	int size = 0;         //ũ��
	
	//1) ������1
	public MyVector(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. :"+ capacity);
		
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	//2) ������2
	public MyVector() {
		this(10);	//ũ�⸦ �������� ������ ũ�⸦ 10���� �Ѵ�.
	}
	
	//3) �ּ����� �������(capacity)�� Ȯ���ϴ� �޼���
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0)
			setCapacity(minCapacity);
	}
	
	// 4) ���ο� ��ü�� �����ϴ� add �޼���
	public boolean add(Object obj) {
		// ���ο� ��ü�� �����ϱ� ���� ������ ������ Ȯ���Ѵ�.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	// 5) ���ϴ� �����͸� ��� get �޼���
	public Object get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		return data[index];
	}
	
	// 6) �ش� �ε����� �����͸� �����ϴ� remove �޼���
	public Object remove(int index) {
		Object oldObj = null;
		
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		oldObj = data[index];
		
		// �����ϰ��� �ϴ� ��ü�� ������ ��ü�� �ƴ϶��, �迭 ���縦 ���� ���ڸ��� ä������Ѵ�.
		if(index != size -1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		//������ �����͸� null�� �Ѵ�. �迭�� 0���� �����ϹǷ� ������ ��Ҵ� index�� size-1�̴�.
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
		// 7) �ش� Object�� �����ϴµ� �����ߴ��� �˷��ִ� �޼���
		public boolean remove(Object obj){
			for(int i=0; i<size; i++){
				 if(obj.equals(data[i])) {
					 remove(i);
					 return true;
				 }
			}
			return false;
		}
		
		// 8) ���� ������ �����Ѵ� �޼���
		public void trimToSize() {
			setCapacity(size);
		}
		
		// 9) �ش� ������� ������ �����ϴ� �޼���
		private void setCapacity(int capacity) {
			if(this.capacity==capacity) return;//ũ�Ⱑ ������ �������� �ʴ´�.
			
			Object[] tmp = new Object[capacity];
			System.arraycopy(data, 0, tmp, 0, size);
			data = tmp;
			this.capacity = capacity;
		}
		
		public void clear() {
			for (int i = 0; i < size; i++)
				data[i] = null;
			size = 0;
		}
		
		public Object[] toArray() {
			Object[] result = new Object[size];
			System.arraycopy(data, 0, result, 0, size);
			
			return result;
		}
		
		public boolean isEmpty() { return size==0; }
		public int capacity() { return capacity; }
		public int size() { return size; }
	
	

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		data[index]=element;
	}

	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object obj) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		//�̰�
		return 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		//�̰�
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object set(int arg0, Object arg1) {
		// TODO Auto-generated method stub
		//�̰�
		return null;
	}

	@Override
	public List subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		//�̰�
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}
 }