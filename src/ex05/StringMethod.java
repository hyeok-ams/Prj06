package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {
	public static void main(String[] args) {
		System.out.println("문자열 갯수: " + "Hello".length());		//5
		System.out.println("문자열 갯수: " + "안녕하세요".length());//5
		//			  012345 6 7 8 9
		String str = "Java 프로그래밍";
		System.out.println("1위치의 글자: "+ str.charAt(1));	//a
		System.out.println("5위치의 글자: "+ str.charAt(5));	//a
		//             012345678910
		String str2 = "Hello World";
		System.out.println("" + str2.substring(0,5));	//0~4 .substring(시작지점,-1지점까지 잘라오는곳)
		System.out.println("" + str2.substring(6));		//6~끝까지
		
		//             012345
		String str3 = "Banana";
		System.out.println("문자(a)의 위치: " + str3.indexOf('a')); //1
		System.out.println("문자(a)의 위치: " + str3.indexOf('a', 2)); //3
		System.out.println("문자(a)의 위치: " + str3.indexOf('a', str3.indexOf('a')+1)); //3
		//↑ 가져온 위치값으로하면 해당 위치값을 가져오므로 +1하여 다음부터 찾도록 하는 부분
		System.out.println("문자(a)의 위치: " + str3.lastIndexOf('a')); //5
		
		// ~를 포함하는 : 시작,중간,끝
		String str4 = "choco pie, apple pie";
		System.out.println("pie 문자열을 포함하고 있는가: " + str4.contains("pie")); // 출력: true
		// ~로 시작하는
		String str5 = "filename.java";
		System.out.println("file로 시작하는가?" + str5.startsWith("file"));
		System.out.println("file의 위치" + str5.indexOf("file"));
		
		// ~로 끝나는
		System.out.println(".java로 끝나는가?" + str5.endsWith(".java"));
		
		// 문자열 비교
		String str6 = "Java";
		String str7 = "java";
		System.out.println(str6.equals(str7)); // false 완전히 똑같은가 대소문자까지 전부
		System.out.println(str6.equalsIgnoreCase(str7)); // true 글자만 똑같은가 대소문자 무시
		
		//대소문자변환
		System.out.println(str6.toUpperCase()); // JAVA 글자전부 대문자로 변환
		System.out.println(str6.toLowerCase()); // java 글자전부 소문자로 변환

		//Trim 앞뒤 공백 제거
		String str8 = " He llo ";
		System.out.println(str8.length()); // 출력: 전체 문자열 갯수
		System.out.println(str8.trim()); // 출력: He llo
		System.out.println(str8.trim().length()); // 출력: 전체 문자열 갯수중 앞 뒤 공백을 지운 문자열 갯수
		
		//문자열 교체
		String str9 = "I like Java";
		System.out.println(str9);
		System.out.println(str9.replace("Java", "Python")); // 출력: I like Python Java를 Python으로 변경
		System.out.println(str9);
		str9 = str9.replace("Java", "Python");
		System.out.println(str9);
	
		// 문자열 분리 -> 문자열 배열
		String str10 = "red,green,blue";
		String[] colorArr = str10.split(",");//문자열을 배열로 만들기 위해 구분할 ,을 설정한 후 배열에 입력
		
		System.out.println(Arrays.toString(colorArr)); //[red, green, blue]
		System.out.println(colorArr[0]); // 출력: red
		System.out.println(colorArr[1]); // 출력: green
		System.out.println(colorArr[2]); // 출력: blue
		
		String empty = "";
		String blank = "";
		System.out.println(empty.isEmpty()); // true 비어있는 값인지 확인 후 boolean으로 출력 :							length() : 0
		System.out.println(blank.isBlank()); // true (Java 11 이상) 공백이 있는지 확인 후 boolean으로 출력 empty도 포함	length() : 1
		
		// String.format(...)
		String name = "Alice";
		int age = 20;
		String msg=String.format("이름: %s, 나이: %d", name, age); //문자열을 만들어줄 수 있음 format 형식을 만들어서 넣음
		
		System.out.println(String.format("이름: %s, 나이: %d", name, age)); // 출력: 이름: Alice, 나이: 20
		System.out.println(msg);											// 출력: 이름: Alice, 나이: 20
		
		String msg2 = MessageFormat.format("이름: {0}, 나이: {1}, 이름나이:{0}{1}", name,age); //출력 이름: Alice, 나이: 20, 이름나이:Alice20
		System.out.println(msg2);
		
		//String.join
		String result = String.join("-", colorArr); //출력 red-green-blue
		System.out.println(result);

		String result2 = String.join("-", "2026", "10", "29"); //출력 2026-10-29
		System.out.println(result2);
		
		//repeat(숫자) 반복시키기 Java 11이후 가능
		String star = "*";
		System.out.println(star.repeat(5)); //출력 *****
		
	}
}
