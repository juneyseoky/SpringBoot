package pack.mv;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		// 컨트롤러 역할 시작
		
		Map<String,String> objModel = new HashMap<>();
		String strRtn = root(objModel); // DI 실행용 호출
		printData(strRtn, objModel);

	}
	
	private static String root(Map<String, String> model) {
		// DI : Dependency Insertion(디펜던시 인서션)
		// 		Dependency Injection(디펜던시 인젝션)
		//		의존성 주입
		// 		객체를 생성한 Class에서 초기화를 하는것이 아니라
		//		객체를 생성하고 다른 class에서 초기화하는 것이 의존성 주입
		
		model.put("name1", "테스터1");
		model.put("name2", "테스터2");
		
		return "result";
	}


	private static void printData(String strRtn, Map<String, String> model) {
		String data = model.get("name1");
		System.out.println("name1 데이터 :" + data);
		data = model.get("name2");
		System.out.println("name2 데이터 : " + data);
		System.out.println("WEB-INF/views/"+strRtn +".jsp");		
	}


}
