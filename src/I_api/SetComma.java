package I_api;

import java.util.Scanner;

import e_oop.ScanUtil;


public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,000,000
		
		//Scanner input = new Scanner(System.in);
	/*	
		int number = 0;
		
		String str = String.valueOf(number);
		str = "#######";
		str = str.replace("###", "###,");
		System.out.println(str);
		
		
		Scanner input = new Scanner(System.in);
		String number = input.nextLine();
		String k = "000";
		
		int thousand = Integer.parseInt(k);
		int num = Integer.parseInt(number);
						
		for(int i = 0; i < num; i++){
			if(k = )
		}
*/
		
		/*
		 
		DecimalFormat Commas = new DecimalFormat("#,###"); 
		String returnData2 = (String)Commas.format(returnData1); 
		return returnData2;

		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(substring) 숫자를 입력해 주세요.");
		String num = sc.nextLine();		
		
		for(int i = num.length() - 3; i > 0; i -= 3){
			String tmp1 = num.substring(0,i);
			String tmp2 = num.substring(i);
			num = tmp1 + "," + tmp2;
		//	System.out.println(i + ": " + num);
		}				
		System.out.println(num);
		
		
		
		System.out.println("(StringBuffer)숫자를 입력해 주세요.");
		String num2 = sc.nextLine();		
		
		StringBuffer sb = new StringBuffer(num2);
		for(int i = sb.length() - 3; i > 0; i-=3){
			sb.insert(i, ",");
		}
		System.out.println(sb);
		
		
		
		
		System.out.println("(선생님답)숫자를 입력해주세요>");
		String number = ScanUtil.nextLine();
		String comma = "";
		
		int count = 0;
		for(int i = number.length() - 1; i >= 0; i--){
			// comma += number.charAt(i); 이렇게 하면 뒤에다 붙여주잖아. 앞에다 붙여야돼.
			comma = number.charAt(i) + comma;
			
			count++;
			
			if(count % 3 == 0 && count != number.length()){
				comma = "," + comma;
			}
		}
		System.out.println(comma);
		
		
		
		
		
		
	}

}
