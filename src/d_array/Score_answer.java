package d_array;

public class Score_answer {

	public static void main(String[] args) {

		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */

		// 내 설명 추가
		// 학생 지정 및 각 배열 지정 [25]
		String[] names = { "김건호", "김선중", "이수훈", "오제현", "박소영", "유동기", "김수연",
				"이수정", "유승종", "김도영", "전영헌", "김준혁", "이건영", "송하섭", "이예슬", "백수진",
				"이연승", "최동준", "김강영", "김우성", "황시연", "김경찬", "김보연", "김형석", "안용현" };
		// 과목 배열 지정 [7]
		String[] subjects = { "국어", "영어", "수학", "사회", "과학", "Oracle", "Java" };
		// 점수 배열 지정 [학생수][과목수]
		int[][] score = new int[names.length][subjects.length];
		// 학생별합계 배열 지정 [점수배열]
		int[] nameSum = new int[score.length];
		// 학생별 평균 배열 지정 [점수배열]
		float[] nameAvg = new float[score.length];
		// 과목별 합계 배열 지정 [과목배열]
		int[] subSum = new int[subjects.length];
		// 과목별 평균 배열 지정 [과목배열]
		float[] subAvg = new float[subjects.length];
		// 점수별 석차 배열 지정 [점수배열]
		int[] rank = new int[score.length];

		// 랜덤수 추출후 배열 대입 [학생수][과목수]
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}

		// 학생 이름별 합계
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				nameSum[i] += score[i][j];
			}
		}

		// 학생별 평균 (합계 / 과목수 *100 /100f <<< 소수점자리
		for (int i = 0; i < score.length; i++) {
			nameAvg[i] = Math.round((float) nameSum[i] / subjects.length * 100) / 100f;
		}

		// 과목별 합계 ( 과목길이만큼 반복 점수 합계 누적)
		for (int i = 0; i < subjects.length; i++) {
			for (int j = 0; j < score.length; j++) {
				subSum[i] += score[j][i];
			}
		}

		// 과목별 평균 (과목 길이만큼 반복 ; 과목합계 / 점수길이 *100/100f 자리수)
		for (int i = 0; i < subjects.length; i++) {
			subAvg[i] = Math.round((float) subSum[i] / score.length * 100) / 100f;
		}

		// 과목별 석차 (점수 길이만큼 반복 선택 정렬+하여 구함)
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if (nameSum[i] < nameSum[j]) {
					rank[i]++;
				}
			}
		}

		// 석차에 따른 순서 설정 //
		for (int i = 0; i < nameSum.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nameSum.length; j++) {
				if (nameSum[j] > nameSum[min]) {
					min = j;
				}
			}

			// 점수 변경
			int[] temp = score[i];
			score[i] = score[min];
			score[min] = temp;
			// 이름 합계 변경
			int temp2 = nameSum[i];
			nameSum[i] = nameSum[min];
			nameSum[min] = temp2;
			// 이름 평균 변경
			float temp3 = nameAvg[i];
			nameAvg[i] = nameAvg[min];
			nameAvg[min] = temp3;
			// 석차 변경
			int temp4 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp4;
			// 이름 변경
			String temp5 = names[i];
			names[i] = names[min];
			names[min] = temp5;
		}

		// 최종 출력
		for (int i = 0; i < subjects.length; i++) {
			System.out.print("\t" + subjects[i]); // 과목출력
		}
		System.out.println("\t합계\t평균\t석차"); // 해당과목열에 이어서 합계 평균 석차 입력
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t"); // 이름 입력후 이어서
			for (int j = 0; j < score[i].length; j++) { // 점수 추출 이어서
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]); // 합계
																					// 평균
																					// 석차
																					// 출력
																					// 후
																					// 다음줄
		}

		System.out.print("과목합계\t"); // 한줄 출력
		for (int i = 0; i < subSum.length; i++) { // 과목 합계 출력 이어서
			System.out.print(subSum[i] + "\t");
		}
		System.out.println(); // 과목합계 출력 완료후 다음줄

		System.out.print("과목평균\t"); // 과목평균 출력 이어서
		for (int i = 0; i < subAvg.length; i++) { // 평균 출력후 끝
			System.out.print(subAvg[i] + "\t");

		}
	}

}
