import java.util.HashMap;
import java.util.Scanner;

public class CollectionsEx21 {
	public static void main(String[]args){
		//HashMap 와 Hashtabl - 순서 x 중복( 키X, 값 O) 
		//Map 인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장 
		//HashMap (동기화 X) Hashtable(동기호 O)의 신버전 
		
		//HashMap 
		//Map 인터페이스를 구현한 대표적인 컬렉션 클래스 
		//순서를 유지하려면 LinkedHashMap클래스를 사용하면 된다 
		
		//TreeMap 
		//범위 검색과 정렬에 유리한 컬렉셔 클래스 
		//HashMap보다 데이터 추가 삭제에 시간이 걸린다 
		
		//HashMap의 키(key)와 값(value)
		//해싱(hashing)기법으로 데이터를 저장, 데이터가 많아도 검색이 빠르다 
		//Map 인터페이스를 구현, 데이터를 키와 값의 쌍으로 저장 
		//key 	컬렉션 내의 key 중에서 유일해야 한다 
		//value key와 달리 데이터의 중복을 허용한다 
		
		//hashing 
		//해시 함수(hash function)로 해시테이블(hash table)에 데이터를 저장, 검색 
		//해시테이블은 배열과 링크드 리스트가 조합된 형태 
		//해싱 해시 테이블에 저장된 데이터를 가져오는 과정 
		//	1 key로 해시 함수를 호출해서 해시코드를 얻는다 
		//	2 해시코드(해시함수의 반환값)에 대응하는 링크드리스트 배열에서 찾는다 
		//	3 링크드리스트에서 키와 일치하는 데이터를 찾는다 
		
		
		HashMap map = new HashMap(); 
		map.put("myId", "1234");
		System.out.println(map);
		map.put("asdf", "1111"); 
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id :");
			String id = scan.nextLine().trim(); 
			
			System.out.print("password :");
			String password = scan.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)){
				System.out.println("입력하신 id는 존재하지 않습니다 . 다시 입력해주세요 ");
				continue;
			}
			
			if(!("1234").equals(password)){
				System.out.println("비밀번호가 일치 하지 않습니다. 다시 입력해주세요");
			}else {
				System.out.println("id와 비밀번호가 일치 합니다");
				break;
			}
		}
		
	}
}
