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
	abstract void play(int pos);//�߻� �޼��� {}�� ���� �޼��� 
	abstract void stop();		//�߻� �޼���
}

public class AbstractEx01 {
	public static void main(String[]args){
		//Abstract class 
		//�̿ϼ� ���赵, �̿ϼ� �޼��带 ���� �ִ� Ŭ���� 
		//�ٸ� Ŭ���� �ۼ��� ������ �ֱ� ���� ������ instance ������ �Ұ��� �ϴ� 
		//Player p = new Player(); Error
		//���� Ŭ������ ���������� ���� �� �ִ� �߻�Ŭ������ �ٷ� �ۼ��ϰų� ���� Ŭ������ ���� �κ��� �̾Ƽ� �߻�Ŭ������ �����
		
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
