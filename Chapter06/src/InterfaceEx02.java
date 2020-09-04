abstract class Unit02{
	
	int x, y; 
	abstract void move(int x, int y);
	void stop(){System.out.println("stop");}
}

interface Fightable02{
	
	void move(int x, int y ); 
	void attack(Fightable02 f);
}

class Fighter02 extends Unit02 implements Fightable02{
	
	public void move(int x, int y){
		System.out.println("[" +x+ "," +y+"]");
	}
	public void attack(Fightable02 f){
		System.out.println(f+"attack");
	}
	
	Fightable02 getFightable(){
		Fighter02 f = new Fighter02();
		return f;
	}

}
public class InterfaceEx02 {
	public static void main(String[]args){
		
		Fighter02 f = new Fighter02();
		f.move(100, 200);
		f.attack(new Fighter02());
		f.stop();
		
		Unit02 u = new Fighter02();
		u.move(100, 300);
		u.stop();
	}
}


