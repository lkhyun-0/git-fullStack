package test0822;

import java.util.ArrayList;

public class ArrayListTest {
// 사람이름을 담는 컬렉션 ArrayList 만들기
	// - ArrayList의 특징 장단점 설명 등
	// ArrayList 자바가 제공하는 컬렉션 프레임워크 클래스 빈상자와 같다
	// 배열의 특성을 가지고 있어서 속도가 빠른것이 장점이고 번호표가 부여됨
	// 데이터 조회 열람시 사용을 많이 한다. 입출력이 수정 삽입 삭제가 빈번한 데이터는 효과가 별로 없음

	public ArrayList<String> test() {
		ArrayList<String> namelist = new ArrayList<String>();
		namelist.add("홍길동1세");
		namelist.add("홍길동2세");
		namelist.add("홍길동3세");
		namelist.add("홍길동4세");
		return namelist;
	}

}
