package test.constructorcall2;

public class ClsB extends ClsA {
	public ClsB() {
		System.out.println("ClsB() 기본 생성자 실행됨");
	}
	
	public ClsB(int n) {
		super(n);
		System.out.println("ClsB(int n) 생성자 실행됨 : " + n);
	}
}
