package chap06;

import java.util.Scanner;

public class BoosMain {

	public static void main(String[] args) {
		
		Books myBooks = new Books(null, null, 0);
		boolean run = true;
		int bNum = 0;
		while(run) {
		System.out.println("1.도서 수 입력 2.도서 입력 3.도서목록 조회 4.도서분석 5.종료");
		String menu;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		menu = sc.nextLine();
		switch(menu) {
		case "1" :
			bNum = Integer.parseInt(sc.nextLine());
					Books[] blist = new Books[bNum];					
			break;
		case "2" :
			for(int i=0;i<=bNum-1;i++) {
			String getBookTitle = sc.nextLine();
			String getBookNumber = sc.nextLine();
			int getBookPrice = Integer.parseInt(sc.nextLine());
			System.out.printf("%s%s%d",getBookTitle,getBookNumber,getBookPrice);
			}
			break;
		case "3" :{
			}
			break;
		case "4" :
			break;
		case "5" :
			System.out.println("프로그램 종료");
			break;
		}
		
		}
		
	}

}
