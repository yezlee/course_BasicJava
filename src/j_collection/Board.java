package j_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고, 조회, 등록, 수정, 삭제가 가능한 게시판을
		 * 만들어주세요.
		 * 
		 ------------------------------
		 * 번호	제목		작성자	작성일
		 * ------------------------------
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * 1	안녕하세요	홍길동	10-05
		 * ------------------------------
		 * 1.   조회	 2.등록	3.종료
		 */

		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();

		HashMap<String, Object> ex = new HashMap<>();

		ex.put("NO", 1);
		ex.put("TITLE", "안녕하세요.");
		ex.put("CONTENT", "~~");
		ex.put("USER", "홍길동");
		ex.put("REG_DATE", new Date());

		boardList.add(ex);

		System.out.println("------------------------------");
		System.out.println("번호\t제목\t작성자\t작성일");
		System.out.println("------------------------------");
		for (int i = 0; i < boardList.size(); i++) {
			HashMap<String, Object> board = boardList.get(i);
			System.out.println(board.get("NO") + "\t"
					+ board.get("TITLE") + "\t"
					+ board.get("USER") + "\t"
					+ new SimpleDateFormat("MM-dd").format(board.get("REG_DATE")));
		}
		System.out.println("------------------------------");
		System.out.println("1.조회\t2.등록\t3.종료");
		System.out.println("입력>");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1: // 조회
			read(boardList);
			break;

		case 2: // 등록
			insert(boardList);
			break;

		case 3: // 종료
			System.out.println("종료 되었습니다.");
			System.exit(0);
			break;
		}
	}

	private static void insert(ArrayList<HashMap<String, Object>> boardList) {
		int maxNo = 0;
		for (int i = 0; i < boardList.size(); i++) {
			HashMap<String, Object> temp = boardList.get(i);
			if (maxNo < (Integer) temp.get("NO")) {
				maxNo = (Integer) temp.get("NO");
			}
		}
		maxNo++;

		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		System.out.println("이름>");
		String user = ScanUtil.nextLine();

		HashMap<String, Object> board = new HashMap<>();
		board.put("NO", maxNo);
		board.put("TITLE", title);
		board.put("CONTENT", content);
		board.put("USER", user);
		board.put("REG_DATE", new Date());

		boardList.add(board);
		System.out.println("게시물 등록이 완료 되었습니다.");
	}

	private static void read(ArrayList<HashMap<String, Object>> boardList) {
		System.out.println("게시글 번호 입력>");
		int no = ScanUtil.nextInt();

		HashMap<String, Object> board = null;
		for (int i = 0; i < boardList.size(); i++) {
			HashMap<String, Object> temp = boardList.get(i);
			if ((Integer) temp.get("NO") == no) {
				board = temp;
				break;

			}
		}

		System.out.println("------------------------------");
		System.out.println("번호\t" + board.get("NO"));

		System.out.println("작성자\t: " + board.get("USER"));
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("--------------------------");
		System.out.println("1.수정\t2.삭제\t3.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1: // 수정
			update(board);
			break;

		case 2: // 삭제
			delete(board, boardList);
			break;

		case 3: // 목록

			break;
		}
	}

	private static void update(HashMap<String, Object> board) {
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();

		board.put("TITLE", title);
		board.put("CONTENT", content);

		System.out.println("수정이 완료되었습니다.");
	}

	private static void delete(HashMap<String, Object> board,
			ArrayList<HashMap<String, Object>> boardList) {
		for (int i = 0; i < boardList.size(); i++) {
			if (boardList.get(i).get("NO") == board.get("NO")) {
				boardList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}

		}

	}

}
