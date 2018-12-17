package ch8;

public class NewExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			startInstall();
			copyFiles3();
		}catch(SpaceException e) {
			System.out.println("에러 메세지:"+e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보하세요");
		}catch(MemoryException me) {
			System.out.println("에러 메세지:"+me.getMessage());
			me.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		}finally {
			deleteTempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
	}
	
	static void copyFiles3() {}
	static void deleteTempFiles() {}
	
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class SpaceException extends Exception{
	SpaceException(String msg){
		super(msg);
	}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return true;
	}
}

class MemoryException extends Exception{
	MemoryException(String msg){
		super(msg);
	}
}