package ex04;

import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

class Member{
	//fields
	private String name;
	private String phone;
	private int bYear;
	
	//Constructor
	public Member() {
		
	}
	public Member(String name, String phone, int bYear) {
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}
	//Setter 중간 변수를 변경할게 아니라면 생성자에서 값입력이 가능
	//Getter
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getbYear() {
		return bYear;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", bYear=" + bYear + "]";
	}
	//mArr[0] (this) == m(other)
	//mArr[0].equals(m)
	@Override
	public boolean equals(Object obj) {
		Member other = (Member) obj;
		//return bYear == other.bYear 
		//	&& Objects.equals(name, other.name) 
		//	&& Objects.equals(phone, other.phone);
		return this.name.equals(other.name);
	}
	
	//method
	
	
	
}


public class TestMember {

	public static void main(String[] args) {
		
		//객체 배열
		Member [] mArr = new Member[3];
		//반드시 배열을 먼저 만들어야 한다.
		mArr[0] = new Member("강호동", "010-1111-1111", 1975);
		mArr[1] = new Member("서장훈", "010-2222-2222", 1978);
		mArr[2] = new Member("김연아", "010-1111-1111", 1990);
		
		System.out.println("전체 목록");
		for (int i = 0; i < mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		System.out.println("==================");
//		System.out.println(mArr[0]);
//		System.out.println(mArr[1]);
//		System.out.println(mArr[2]);
		//김연아를 찾아서 정보를 출력해줘
		String name = new String();
		System.out.println("찾을 이름을 입력해주세요");
		Scanner sc = new Scanner(System.in); 

        name = sc.nextLine(); 
		
		Member m = new Member("서장훈", null, 0); //찾을 data
		
		System.out.println("찾은 정보:");
		System.out.println("값을 입력해놓고 찾은 정보:");
		for (int i = 0; i < mArr.length; i++) {
			if(mArr[i].equals(m))
			
				System.out.println(mArr[i]);
		}
		System.out.println("값을 입력받고 찾은 정보:");
		for (int i = 0; i < mArr.length; i++) {
			
			if(mArr[i].getName().equals(name))
				System.out.println(mArr[i]);
		}
		
	}

}
