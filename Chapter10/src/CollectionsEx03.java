
public class CollectionsEx03 {
	public static void main(String[]args){
		//LinkedList 배열의 장단점 
		//배열은 구조가 간단하고 데이터를 읽는데 걸리는 시간이 짧다 
		//단점1 : 크기를 변경할 수 없다 
		//	      크기를 변경해야하는 경우 새로운 배열을 생성후 데이터를 복사해야한다 
		//     크기의 변경을 피하기 위해 충분히 큰 배열을 생성하면 메모리가 낭비된다. 
		
		//단점2 : 비순차적인 데이터의 추가 삭제에 시간이 많이 걸린다 
		//	      데이터를 추가하거나 삭제하기 위해 다른 데이터를 옮겨야 한다 
		//     그러나 순차적인 데이터 추가 (끝에 추가)와 삭제(끝부터 삭제)는 빠르다.
		
		//LindedList는 배열의 단점을 보완한다 
		//배열과는 달리 LinkedList는 불연속적으로 존재하는 데이터를 연결(link) 
		//데이터의 삭제 : 단 한 번의 참조 변경만으로도 가능하다 
		//데이터의 추가 : 한번의 Node객체 생성과 두 번의 참조 변경만으로 가능 
		
		//LinkedList는 불연속적이기 때문에 데이터의 접근성이 좋지 않다 
		//LinkedList의 단점을 보완하기 위해 doubly LinkedList를 이용 
		//doubly LinkedList의 단점을 보완하기 위해 doubly circular linked list이용 
		
		//순차적으로 데이터를 추가/삭제 ArrayList가 빠르다 
		//비순차적으로 데이터를 추가/삭제 LinkedList가 빠르다 
		//접근시간(access time)- ArrayList가 빠르다 
		
		//Stack & Queue 
		//Stack : LIFO(Last In First Out) 구조 마지막에 저장된 것을 제일 먼저 꺼내게 된다 
		//저장(push) 0-1-2  추출(pop) 2-1-0  
		//Stack 구현 : 배열이 적합
		//Stack는 클래스 
		
		//Queue : FIFO(First In First Out) 구조 제일 먼저 저장된 것을 제일 먼저 꺼내게 된다 
		//저장(offer) 0-1-2 추출(poll) 0-1-2
		//Queue 구현 : LinkedList가 적합 
		//Queue는 interface 
		//Queue를 구현한 클래스를 사용한다 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
