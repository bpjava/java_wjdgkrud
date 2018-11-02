package test;

class MyMath{
	long add(long a, long b){
		long result = a+b;
		return result;
	}
}

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MyMath nm = new MyMath();
	
	long value = nm.add(1L, 4L);

	}

}


