
// 여기는 HelloKorea 클래스가 시작되는 곳
// 여기는 주석문이라고 한다.
// 주석문은 javac가 컴파일 할때 무시하는 라인
// 필요에따라 주석문은 다양하게 작성하여 활용한다.
// 클래스는 java의 소스코드가 시작되는 표시이다.
// 클래스 {   } 이 부분은 실제 소스코드가 작성되는 영역
public class HelloKorea_02 {

	// main() method 라고 부른다.
	// 명령문의 실제 실행되는 코드를 작성하는 영역
	// main() method가 아닌 곳에 작성된 코드는
	// run 으로 실행할수 없다.
	public static void main(String[] args) {
		
		System.out.println("대한민국만세");
		System.out.println(30+40); // 덧셈 계산
		System.out.println(30*30); // 곱셈 계산
		System.out.println(30/10); // 나눗셈 계산
		System.out.println(30-10); // 뺄셈 계산

		System.out.println("30+40");
		System.out.println("30*40");
		System.out.println("30/10");
		System.out.println("30-10");
		
		System.out.println("30" + "40");
		System.out.println("30+40="+30+40);
		System.out.println("30+40=" + (30+40) );
		System.out.println("=============================");
		System.out.println("숫자의 4칙연산");
		System.out.println("=============================");
		System.out.println("30+40=" +(30+40));
		System.out.println("30*40=" +(30*40));
		System.out.println("30/40=" +(30/40));
		System.out.println("30-40=" +(30-40));
		System.out.println("=============================");
		
		
	}

}
