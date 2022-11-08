package chapter2;

//상수(항상 변하지 않는 값) 사용하기 : final 예약어 사용하기
public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM=100; //한 번 선언한 상수는 변하지 않기 때문에 선언과 동시에 초기화하는것이 좋다.
		final int MIN_NUM;
		
		MIN_NUM=0; //사용하기 전에 초기화. 초기화하지 않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM =1000; 오류 발생. 상수는 값을 변경할 수 없음
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		The final local variable MAX_NUM cannot be assigned. It must be blank and not using a compound assignment

		at chapter2.Constant.main(Constant.java:14)
		*/

	}
}
