package test0822;

import java.util.ArrayList;

public class mainTest {

	public static void main(String[] args) {

		Test0920 t = new Test0920();
		// 1. 객체 생성하기
		// 2. new 연산자로 메모리 공간을 할당하고
		// 3. 생성자를 호출하여 객체를 생성한 후
		// 4. 그 객체의 주소값을 객체 참조변수 t에 담는다.
		// + 객체 참조변수 t의 타입은 Test0920클래스 타입이다.
		t.run();
		// 객체 참조변수 t값을 찍어봤을 때 값이 나오면 ? 객체가 생성된것을 확인할 수 있음
		// 안나오고 null 이 나온다? > 객체생성이 안된것이라고 생각하면됨

		ArrayListTest a = new ArrayListTest();
		ArrayList<String> dd = a.test();
		System.out.println("dd값은 뭘까요?" + dd);

		String name = dd.get(1);
		System.out.println("두번째 이름은 ? " + name);

		ArrayList<BoardVo> alist = new ArrayList<BoardVo>();

		BoardVo bv = new BoardVo(); // BoardVo객체를 생성한다

		bv.setSubject("게시판 제목입니다.");
		bv.setContents("게시판 내용입니다.");
		bv.setBidx(1);

		BoardVo bv2 = new BoardVo(); // BoardVo 객체 두번째 생성
		bv2.setSubject("게시판 두번째 제목입니다.");
		bv2.setContents("게시판 두번째 내용입니다.");
		bv2.setBidx(2);

		alist.add(bv);
		alist.add(bv2);

		System.out.println("alist에 담긴것은 ? " + alist);
		System.out.println("alist에 담긴 두번째 객체가 가지고 있는 제목은 ? " + alist.get(1));

		String aa = "안녕";
		String bb = "하세요";
	}
}
