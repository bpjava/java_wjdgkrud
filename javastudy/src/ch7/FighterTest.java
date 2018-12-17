package ch7;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자손");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable클래스의 자손");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Moveable클래스의 자손");
		}
		if(f instanceof Attackable) {
			System.out.println("f는 Attackable클래스의 자손");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자손");
		}

	}

}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attact(Unit u) {}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable,Attackable{}
interface Movable{ void move(int x, int y); }
interface Attackable{ void attact(Unit u);}
