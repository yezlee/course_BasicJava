package e_oop.restaurant;

import java.util.Arrays;

public class Mom {

	public static void main(String[] args) {
		
		Errand err = new Errand();
		
		String[] list = err.list();
		
		System.out.println(Arrays.toString(list));
		
		System.out.println("네. 돈주세요.");
		String[] money = {"돈 여기있어"};
		
		err.errand(money);
		
		err.items(list);
		System.out.println("네. 다녀왔습니다. 여기 콩나물, 두부요");
		
	}
}
