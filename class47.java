package project12;

public class class47 implements class47_inter{
	public static void main(String[] args) {
		class47_outer class47 = new class47_outer(4);
		
		class47_outer.Inner inner = class47.inner;
		inner.printclass47();
	}
	@Override
	public void inter() {
		System.out.println("ss");
	}

}
class class47_outer{
	private Inner inner;
	private int a;
	
	public class47_outer(int a) {
		this.a = a;
		inner = new Inner();
	}
}
class Inner{
	public void printclass47(int a) {
		System.out.println("class: "+ a);
	}
}

		
class class47_Outer3{
	private int a;
	public void outerMethod() {
		Innerinterface inner = new Innerinterface() {
			@Override
			public void innerMethod() {
				System.out.println("내부 메소드");
			}
		};
	}
	private interface Innerinterface{
		void innerMethod();
	}
}




//추상클래스
//extends -> 추상메소드를 무조건 하나 이상 가져야 한다. 메소드, 변수

//인터페이스
//구현된 메소드나 변수가 없으며, 오로지 추상 메소드와 상수만 가지고 있다.
//implements
//부모는 하나만, 인터페이스는 여러 개도 가능(다중 상속)
//프랜차이즈 계약서 -> 필수 요소(식당명, 메뉴, 레시피) 

//이너 클래스(Inner class) -> 클래스 내부에 선언된 클래스
//1.맴버 이너 클래스(Member Inner class)
//	외부 클래스의 모든 맴버를 참조할 수 있으며, 외부 클래스를 인스턴스화 한 뒤에 이너 클래스를 인스턴스화 해야 사용가능하다.

//static Inner class

//이너 클래스는 보통 클래스 내부에서만 사용이 된다.
//캡슐화(정보은닉)

//이너 인터페이스( Inner Interface) -> 클래스 내부에 선언된 인터페이스
//클래스 내부에서만 사용될 것으로 예상되는 인터페이스를 정의한다.

//클래스 내부에서만 사용되니 public, private 이런 접근 지정자를 명시하지 않는 것이 일반적.



