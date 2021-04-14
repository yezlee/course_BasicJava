package j_collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다. - 여러개가 이미 저장되어있을때 그 사이에 지정하고 싶을떄. 그럼 이미 저장된건 뒤로 한칸씩 밀리겠지.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다. - 기존에 있던걸 다른것으로 바꾸는거야. 그 위치에 있던걸 다른 객체로 바꾸는거야, 기존에 있던걸 리턴하고 다른걸 저장.
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다. - 그동안 우린 length를 썼는데 이젠 사이즈를 쓸거야
		 * boolean remove(int index) : 지정된 위치의 객체를 제거한다. - 삭제가 잘 됐는지 안 됐는지 알려줘. (만약 안되면 -> ex .해당인덱스에 값이 없는 경우)
		 *
		 * 제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다. 
		 */

		//arraylist를 사용하게 위해 객체를 하나 생성
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);                    // 타입에 상관없이 아무거나 저장할수 있어. int도 string도 심지어 arraylist도 저장할 수 있어. arraylist를 해주면!
		sample.add(new ArrayList()); 
		//저장은 쉬운데 문제는 값을 꺼낼때. 값을 꺼낼때 얘가 무슨 타입인지 유추할수가 없어.
		//그래서 주로 타입을 지정해서 씀....
		
		//그걸 제네릭 이라함
		//제네릭을 지정하지 않으면 넣을때는 편하나 꺼낼때는 타입을 예측하기 힘들다.
		//따라서 제네릭의 사용이 권장된다.
		ArrayList<Integer> list = new ArrayList<>();
		        // 제네릭. integer라는 타입을 넣을수만 있게끔 제네릭을 사용
		//new ArrayList<>(); 여기엔 <> 이안에 인티저라고 넣어도 되고 안넣어도돼. 왜? 어차피 list라는 변수를 쓸때 integer값 밖에 쓸수가 없어. 그래서 쓰나마나야.
		
		list.add(10);
//		list.add("abc"); // 이제 이렇게 하면 컴파일에러가 뜨지. 
		list.add(20);
		System.out.println(list.add(30)); // true라고 뜨는데. 성공여부를 반환해 주는거야. 저장이 성공적으로 됐다고 알려주는거지.
		System.out.println(list); // 주소가 출력이 되는게 아니고 저장된 값이 떠.
		
		list.add(1, 40); // 1번 인덱스부터 뒤로 밀고 값을 저장한다.
		System.out.println(list);
		
		//arraylist는 순차적으로만 저장할수있어. 막 건너뛰고 10번째 배열에 저장. 이런거 안돼.
		
		//list.set(2, 50); // 이걸 쓰면 기존에 저장되어있던 값을 리턴해줘 
		Integer before = list.set(2, 50); //2번째 배열에 있던 값을 50으로 바꿔치기 하겠다.
		System.out.println("before : " + before);
		System.out.println("after : " + list.get(2));
		System.out.println(list + ".");
		
		
		//list.get(2); // list[2] 배열에선 이렇게 썼지. 대괄호를 써서 인덱스를 지정해줬어. 근데 arraylist는 get을 써서 지정해줌. 파라미터 안에다가
		Integer integer = list.get(2);
		System.out.println("integer(변수이름) : " + integer);
		
		
		//remove - 값을 다삭제하고싶어. 그럼 for문을 돌면서 삭제를 해야해
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			list.remove(i);			
//		}
//		System.out.println(list); // 하나도 안남아야 할거같은데 남아있어! 0번인덱스가 사라지면서 1번인덱스가 0번인덱스 자리로 들어가. 
		// 그래서  for문을 돌려서 값을 삭제하고 싶으면 앞에서부터 돌리는게 아니고 뒤에서부터 돌려야돼.
		
		//값을 제가 할때는 뒤에서 부터 제거해야한다.
		for(int i = list.size() - 1; 0 <= i; i--){
			System.out.println(i + " : " + list.get(i));
			list.remove(i);
		}
		System.out.println(list);
		
		
		
		//list에 1~100 사이의 랜덤값을 10개 저장해주세요.		
		
		for(int i = 0; i < 10; i++){
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
				
		System.out.println(sum + " / " + avg);
		
		
		
		//list에서 최소값과 최대값을 구해주세요
		//int min = list.size();  왜 이건 안되지? 값은 나오는데
		//int max = list.size();
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++){
			if(min > list.get(i)){
				min = list.get(i);				
			}else if(max < list.get(i)){
				max = list.get(i);				
			}			
		}
		System.out.println("최소값 : " + min + " 최대값 : " + max);	
		
		
		
		
		//list를 오름차순으로  정렬해주세요.		
						
		for(int i = 0; i < list.size() -1; i++){
			min = i;
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) > list.get(min)){
					min = j;
				}
			}
			int temp = list.get(i);  
			list.set(i, list.get(min));
			list.set(min, temp);
			/*int temp = list.get(i);
			i = min;
			min = temp;*/		
		}
		System.out.println(list);
		
		
		
		//2차원 어레이 리스트....
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		
		//위 list 안에 arraylist를 넣을수 있잖아 그럼 arraylist 부터 만들어야겠지
//		ArrayList<Integer> list = new ArrayList<>();    위에 쓴게 있어서 주석처리
		list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list); //arraylist 하나가 저장이 된거
		
		list = new ArrayList<>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		
		System.out.println(list2);
		
		for(int i = 0; i < list2.size(); i++){         //list2에있는걸 for문을 돌려서 꺼내고
			ArrayList<Integer> li = list2.get(i);
			for(int j = 0; j < li.size(); j++){        //그 안에 있는걸 for문을 돌려서 나머지를 꺼내는거지  
				System.out.println(li.get(j) + "\t");
			}
			System.out.println();
		}
		
		
//		list2.get(0).get(1); //list2.get(0) 이게 arraylist니까 그러고 나서 또 arraylist안에 있는 arraylist1번을 꺼내 그걸 인티저로 선언해주는거지
		Integer integer2 = list2.get(1).get(1); // 1번 배열 arraylist에 있는 1번 배열 인덱스를 꺼낸거야 	
		System.out.println(integer2); // 그래서 출력값이 50이야.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
