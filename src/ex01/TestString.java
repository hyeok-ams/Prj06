package ex01;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = new String("이순신"); //new Heap 메모리에 새로 생성
		String name4 = new String("이순신"); //new Heap 메모리에 새로 생성
		
		
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);

		//name1과 name2 가 같은 이름인가? -> 틀린 표현 : 문자열 비교는 == 사용 금지 name1.equals(name2)를 사용할 것
		if(name1 == name2) { //주소비교 : heap의 위치
			System.out.println("같은 이름");
		}
		else
			System.out.println("다른 이름");
		if(name3 == name4) { //
			System.out.println("같은 이름");
		}
		else
			System.out.println("다른 이름");
		
		//data 비교 -> 정상적인 문자열 비교
		if(name1.equals(name2)) {
			System.out.println("같은 이름");
		}
		else
			System.out.println("다른 이름");
		if(name3.equals(name4)) {
			System.out.println("같은 이름");
		}
		else
			System.out.println("다른 이름");
		
		String name5 = "이순신";
		String name6 = "이이";
		
		// 문자열의 >, < 이런 비교 : 문자열의 순서 - 정렬을 위해 
		// name5 > name6 : 자바에서 >, < 비교 불가능
		//if(name5 > name6) { // 에러:문자열 > 를 비교 불가능
		if(name5.compareTo(name6) > 0 ) { // name5 > name6 비교
			System.out.println(name5 + "가 먼저다.");
		}
		else
		{
			if(name5.compareTo(name6) == 0 )
			{
				System.out.printf("%s 와 %s 가 같다.",name5 , name6 );
				System.out.println();
			}
			else {
				if(name5.compareTo(name6) < 0 ) {
				System.out.println(name6 + "가 먼저다.");
				}
			}
		}
		
		if(name5.equals(name6)) {
			System.out.println("같은 이름");
		}
		else
			System.out.println("다른 이름");
		
		
	}

}
