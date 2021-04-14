
public class Index {
	private int[] unsortedArr = new int[]{1, 2, 4, 20, 25, 30, 30, 35, 45, 50, 55, 56};
	private int[] sortedArr = new int[]{1, 2, 4, 20, 25, 30, 30, 35, 45, 50, 55, 56};
	public static void main(String[] args){
		Index index = new Index();
		
		index.unsortedArray(30);
		index.sortedArray(30);
		
	}

	private void sortedArray(int value) {
		// sortedArr 에서 value 값이 있는지 찾고, 몇번 등장하는지 결과로 출력
		int count = 0;
		for (int i = 0; i < sortedArr.length; i++) {
			if (sortedArr[i] == value) {
				count++;
			}else if(unsortedArr[i] > value){
				break;
			}
		}
		System.out.println(count);
	}

	private void unsortedArray(int value) {
		// unsortedArr 에서 value 값이 있는지 찾고, 몇번 등장하는지 결과로 출력
		int count = 0;
		for (int i = 0; i < unsortedArr.length; i++) {
			if (unsortedArr[i] == value) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}