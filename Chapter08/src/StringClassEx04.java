
public class StringClassEx04 {
	public static void main(String[]args){
		//String 클래스의 생성자와 메서드
		
		//String[]split(String regex) 
		//문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다 
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		//String []split(String regex, int  limit)
		//문자열 을 지정된 분리자로 나누어 문자열 배열에 담아 반환한다 
		//단 문자열을 지정된 수(limit)로 자른다 
		String []arr1 = animals.split(",", 2);
		
		for(int i=0; i<arr1.length; i++){
			System.out.println(arr1[i]);
		}
		
		//boolean startWith(String prefix)
		//주어진 문자열로 시작하는지 검사한다 
		String s = "java.lang.Object";
		boolean b1 = s.startsWith("java");
		boolean b2 = s.startsWith("lang");
		System.out.println(b1);
		System.out.println(b2);
		
		//String substring(int begin)
		//String substring(int begin, int end)
		//주어진 시작위치(begin)부터 끝위치 (end)범위에 포함된 문자열을 얻는다 
		//이때 시작위치 문자는 범위에 포함되지만 끝위치는 포함되지 않는다 
		
		String s1 =s.substring(10);
		System.out.println(s1);
		String s2 = s.substring(5,9);
		System.out.println(s2);
		
		
		//String toLowerCase()
		//String 인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환 
		String str = "HELLO";
		System.out.println(str.toLowerCase());
		
		//String toUpperCase()
		//String 인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환 
		String str1 = "hello";
		System.out.println(str1.toUpperCase());
		
		//String trim()
		//문자열의 왼쪽, 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다 
		//이때 문자열 중간에 있는 공백은 제거 되지 않는다 
		String str2 ="   Hello World   ";
		System.out.println(str2.trim());
		System.out.println(str2);
		
		//valueOf()
		//지정된 값을 문자열로 치환하여 반환한다 
		//참조변수의 경우 toString()을 호출한 결과를 반환한다 
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(100));
		System.out.println(String.valueOf(100L));
		System.out.println(String.valueOf(10f));
		java.util.Date dd = new java.util.Date();
		System.out.println(dd);
	}
}
