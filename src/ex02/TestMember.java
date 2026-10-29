package ex02;

class Member{
	//Fields
	private String name;
	private String email;
	
	// Constructor 생성자
	// 기본 생성자 : 인자가 없는 noArgsConstructor
	public Member()
	{
		
	}
	// 모든 인자가 있는 생성자 : @AllArgsConstructor
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
	}
	//Getter 
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//method 기능
	public void info() {
		System.out.println("이름: " + name + ", 이메일: " + email);
	}


	
	
}


public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member("박찬호","park@email.com");
		m1.info();
		m1.setName("박찬호1");
		m1.setEmail("park1@emil.com");
		m1.info();
		
		Member m2 = new Member("류현진",null);
		m2.info();
		m2.setEmail("ryu@emil.com");
		m2.info();
		String m2Name = m2.getName(); 
		System.out.println(m2Name);
		
		Member m3 = new Member();
		m3.setName("최동원");
		m3.info();
	}

}
