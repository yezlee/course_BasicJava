package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		/*
		 * Object put(Object key, Object value) : 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값을 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다. 없는키를 넣어도 에러가 나지않음
		 * Set keySet() : 저장된 모든키를 set으로 반환한다. 중복되지 않는 값만 저장한다는 특징이 있음.
		 * 
		 * 제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다. 
		 */

		//표시하는 메소드가 저장하는거 파라미터로 저장을 하는데 키에다가 저장을 하고 가져올떄도 키로 가져옴
		
		
		HashMap<String, Object> map = new HashMap<>();
		//얘는 키와 값을 같이 저장해주기때문에. 앞에있는게 키고 (주로 스트링) 뒤에있는게 타입.
		
		map.put("a", 10);
		map.put("b", "홍길동");
		map.put("c", new Date());
		//값의 타입이 object이기 떄문에 아무 타입이나 저장 가능함
		//(arraylist에선 오브젝을 쓰면 나중에 꺼낼때 뭔지 몰라서 안쓴다고 했는데 해쉬맵은 키를 사용해서 괜찮아)
		
		System.out.println(map + ".");
		//순서가 b,c,a임. 
		//순서가 없다는 뜻
		
		map.put("b", "이순신"); //하나의 키로는 하나의 값만 저장되기 때문에 
		//제일 마지막으로 한 값이 저장이 되는것.
		
		System.out.println(map);
		
		map.remove("a");
		
		System.out.println(map);
		
		//map.get("b");
		//값의 타입은 제네릭에서 저장한 타입이 나와. 현재 오브젝으로 저장을 했으니 오브젝으로 해야지
		Object value = map.get("b");
		System.out.println(value + " value!!!!");
		
		//map.keySet(); //저장된 모든 키를 가져오는 메소드
		Set<String> keys = map.keySet(); 
		
		//여기에 어떤 키를 저장했는지 알수가 없어. 그럴때 키셋을 사용함
		
		for(String key : keys){ 
			//이렇게 생긴 포문도 있음/ 값을 꺼내서 포문을 실행함. 그 keys안에 있는 값을 다 꺼내서 실행을 할때까지
			//값을 하나 꺼내서 변수에 저장을 하는거야. 그리고 돌고. 또 꺼내고 돌고. 
			//스트링으로 변수가 지정된건 keys안에  들어있는게 스트링 타입이라 그래.
			//만약 int타입이면 스트링 아니고 int타입으로 저장해야함
			System.out.println(key + " : " + map.get(key));
		}
		//이건 해시맵 하나를 돌린다는거야
		
	
		
		HashMap<String, Object> lprod = new HashMap<>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "P101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		
		ArrayList<HashMap<String, Object>> table = new ArrayList<>(); 
		//이안에 hashmap을 저장을 해야해. <>안에 제네릭을 저장해주고
		//어레이 안에 들어있는 해시맵의 형태가 테이블의 ... 뭐였지ㅠㅠ
		//클래스를 사용하려면 vo value object라고 하는데 그걸 사용해서 하기도함.
		//클래스를 사용해서 하는거랑 해시맵을 사용해서 하는 방법 두가지가 있어 
		
		table.add(lprod);
		
		System.out.println(table);
		
		//변수의 이름을 바꿔줄때는, ctrl+1을 누르면 rename in file 선택
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "P102");
		lprod.put("LPROD_NM", "전자제품");
		
		table.add(lprod);
		
		System.out.println(table + "@");
		
		System.out.println();
		
		
		
		
		
		
		//어레이 리스트와 해쉬맵을 사용해서 dept테이블을 만들어보자.
		
		
		ArrayList<HashMap<String, Object>> deptTable = new ArrayList<>(); 
		
		HashMap<String, Object> dept = new HashMap<>();
				
		dept.put("deptno", 10);
		dept.put("dname", "ACCOUNTING");
		dept.put("loc", "NEW YORK");
					
		deptTable.add(dept);
		
		
		dept = new HashMap<>();	
		dept.put("deptno", 20);
		dept.put("dname", "RESEARCH");
		dept.put("loc", "DALLAS");
		
		deptTable.add(dept);	
		
		
		dept = new HashMap<>();
		dept.put("DEPTNO", 30);
		dept.put("DNAME", "SALES");
		dept.put("LOC","OPERATIONS");
		
		deptTable.add(dept);
	
		//여기까지 deptTable의 구조를 만든거
		//이제 포문을돌려야지
		
		for(int i = 0; i < deptTable.size(); i++){
			HashMap<String, Object> d = deptTable.get(i);
			Set<String> keySet = d.keySet();
			for(String key : keySet){
				
				//Set<String> keySet = d.keySet();
				//for(String key : keySet){
				//위두줄을 아래 한줄로 써도 됨
				//for(String key :d.keySet()){
				
				System.out.println(key + " : " + d.get(key) );
			}
			System.out.println("----------------------------------");
		}
		
		

	
		
	}
}
