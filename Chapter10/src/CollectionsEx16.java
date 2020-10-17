
public class CollectionsEx16 {
	public static void main(String[] args){
		//TreeSet - 범위 탐색 정렬 
		//이진 탐색 트리(binary search tree)로 구현, 범위 탐색과 정렬에 유리 
		//이진 트리는 모든 노드가 최대 2개의 하위 노드를 가진다 
		//각 요소(node)가 나무 (tree)형태로 연결(LinkedList 의 변형) 
		
		//binary search tree 
		//부모보다 작은 값은 왼쪽 큰값은 오른쪽에 저장 
		//데이터가 많아질 수록 추가, 삭제에 시간이 더 걸린다 (비교 횟수가 증가) 
		
		//TreeSet - 데이터 저장과정 boolean add(Object o) 
		
		//TreeSet 					기본 생성자 
		//TreeSet(Collection c) 	주어진 컬렉션을 저장하는 TreeSet을 생성 
		//TreeSet(Comparator comp) 	주어진 정렬기준으로 정렬하는 TreeSet을 생성 
		
		//Object first 				정렬된 순서에서 첫번째 객체를 반환한다 
		//Object last 				정렬된 순서에서 마지막 객체를 반환한다 
		
		//Object ceiling(Object o) 	지정된 객체와 같은 객체를 반환하고, 없으면 큰 값을 가진 객체중 
		//							가장 가까운 값의 객체를 반환 없으면 null 
		//Object floor(Object o)	지정된 객체와 같은 객체를 반환하고, 없으면 작은 값을 가진 객체중 
		//							제일 가까운 값은 객체를 반환 없으면 null 
		
		//Object higher(Object o) 	지정된 객체보다 큰 값을 가진 객체 중에 제일 가까운 값의 객체를 반환 
		//							없으면 null
		//Object lower(Object o) 	지정된 객체보다 작은 값을 가진 객체 중에 제일 가까운 값의 객체를 반환 
		//							없으면 null			
	
		//SortedSet subSet(Object fromElement, Object toElement)  
		//범위 검색(fromElement와 toElement)이 결과를 반환한다 
						
		//SortedSet headSet(Object toElement)
		//지정된 객체보다 작은 값의 객체들을 반환한다 
	
		//SortedSet taolSet(Object fromElement)
		//지정된 객체보다 큰 값의 객체들을 반환한다 
	
	
	}
}
