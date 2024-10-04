package 도서관리;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		BookDao selB = new BookDao();
		BookDao dao = null;
		int cnt = 0;
		boolean run = true;
		while(run) {
			System.out.println("1.도서등록 | 2.도서검색 | 3.도서전체 조회 | 4.도서삭제 | 5.도서 정보 변경 | 6. 종료");
			System.out.println("메뉴선택 > ");
			int btn = Integer.parseInt(sc.nextLine());
			switch(btn) {
			case 1 :
				System.out.print("책 제목 : ");
				String title = sc.nextLine();
				System.out.print("책 지은이 : ");
				String writer = sc.nextLine();
				System.out.print("책 가격 : ");
				int price = Integer.parseInt(sc.nextLine());
				System.out.print("책 번호 : ");
				String bnum = sc.nextLine();
//				selB.addBook();
				Book books = new Book(title,writer,price,bnum);
				dao = new BookDao();
				cnt = dao.insert(books);
				if(cnt == 1) {
					System.out.println("추가 성공");
				}else {
					System.out.println("추가 실패");
				}
				break;
			case 2 : 
				
			case 6 :
				System.out.println("프로그램 종료");
				run = false;
				
			}
		}

	}

}
