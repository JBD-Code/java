/*
class Marine {
	
	int x, y ;
	void move(int x, int y){	}
	void stop() {	}
	void stimPack(){	}
}
class Tank{
	
	int x, y ;
	void move(int x, int y){	}
	void stop() {	}
	void changeMode(){	 }
	
}

class Dropship{
	
	int x, y; 
	void move(int x, int y){	}
	void stop() {	}
	void load() {	}
	void upload() {   }
}
*/
abstract class Unit{
	int x, y; 
	abstract void move(int x, int y); 
	void stop(){	}
}

class Marine extends Unit {
	
	int x, y ;
	void move(int x, int y){	
		System.out.println("Marine[x=" + x+ ", y="+y+"]");
	}
	void stimPack(){	}
}
class Tank extends Unit{
	
	int x, y ;
	void move(int x, int y){	
		System.out.println("Tank[x=" + x+ ", y="+y+"]");
	}
	void changeMode(){	 }
	
}

class Dropship extends Unit{
	
	int x, y; 
	void move(int x, int y){	
		System.out.println("Dropship[x=" + x+ ", y="+y+"]");
	}
	void load() {	}
	void upload() {   }
}


abstract class Player{
	abstract void play(int pos);//추상 메서드 {}이 없는 메서드 
	abstract void stop();		//추상 메서드
}

public class AbstractEx01 {
	public static void main(String[]args){
		//Abstract class 
		//미완성 설계도, 미완성 메서드를 갖고 있는 클래스 
		//다른 클래스 작성에 도움을 주기 위한 것으로 instance 생성이 불가능 하다 
		//Player p = new Player(); Error
		//여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나 기존 클래스의 공통 부분을 뽑아서 추상클래스를 만든다
		
		//Unit[]group = { new Marine(), new Tank(), new Dropship() };
		
		Unit[]group = new Unit[3];
		group[0] = new Marine(); 
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for(int i=0; i< group.length; i++){
			group[i].move(100, 200);
		}
	
	
	
	}
}
