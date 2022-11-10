package classpart;

public class Function {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2); //add함수 호출
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다");

	}

	public static int add(int n1, int n2) {//함수호출 변수이름과 함수구현 매개변수이름은 같지않아도 된다.
		int result = n1 + n2;
		return result;
	}

}
