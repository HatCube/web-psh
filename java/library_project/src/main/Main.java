package main;

import java.util.Scanner;

import dao.BookDAO;
import dao.CustomerDAO;
import dao.RentalDAO;
import dto.BookDTO;
import dto.CustomerDTO;

public class Main {
	public static void main(String[] args) {
		
		CustomerDAO customerDAO = new CustomerDAO();
		BookDAO bookDAO = new BookDAO();
		RentalDAO rentalDAO = new RentalDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("도서 대여 관리 프로그램");
			System.out.println("1.고객 등록");
			System.out.println("2.도서 등록");
			System.out.println("3.도서 전체 조회");
			System.out.println("4.도서 대여");
			System.out.println("5.전체 대여 목록 조회");
			System.out.println("6.고객별 대여 목록 조회");
			System.out.println("7.재고 부족 도서 조회");
			System.out.println("0.종료");
			
			System.out.println("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				//고객 정보를 입력받아서 customer 테이블에 등록
				System.out.println("고객명 : ");
				String name = sc.nextLine();
				
				System.out.println("전화번호 : ");
				String phone = sc.nextLine();
				
				customerDAO.insertCustomer(new CustomerDTO(name,phone));
				break;
			case 2:
				//도서 정보(제목,저자,개수)를 입력받아서 book테이블에 저장
				System.out.println("도서명 : ");
				String title = sc.nextLine();
				
				System.out.println("저자 : ");
				String author = sc.nextLine();
				
				System.out.println("재고 : ");
				int stock = sc.nextInt();
				
				bookDAO.insertBook(new BookDTO(title,author,stock));
				break;
			case 3:
				//도서 전체 조회
				bookDAO.findAllBooks();
				break;
				
			case 4:
				//고객 번호와 도서번호를 입력받아 도서 대여하기
				System.out.println("고객 번호 : ");
				int customerId = sc.nextInt();
				
				System.out.println("도서 번호 : ");
				int bookId = sc.nextInt();
				
				rentalDAO.rentalBook(customerId,bookId);
				break;
				
			case 5:
				//전체 대여 목록
				rentalDAO.findRentalList();
				break;
				
			case 6:
				//고객별 대여 목록 조회
				//고객 id를 입력 받아서 고객명,제목,빌린 날짜 순으로 출력하기
				
				System.out.println("고객 번호 : ");
				int searchCustomerId = sc.nextInt();
				
				rentalDAO.findRentalByCustomer(searchCustomerId);
				break;
				
			case 7:
				//재고 부족 도서 조회
				//재고가 2권 이하인 도서를 조회
				//findLowStockBooks()
//				bookDAO.findLowStockBooks();
//				break;
				
				
			case 0:
				//프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			return;
			
			}
		}
		
		
//		//박민수 010-3333-3333 회원 추가하기
//		
//		CustomerDAO customerDAO = new CustomerDAO();
//		
//		//customerDAO.insertCustomer(new CustomerDTO("박민수","010-3333-3333"));
//		
//		BookDAO bookDAO = new BookDAO();
//		
//		//bookDAO.insertBook(new BookDTO("제목테스트","저자테스트",3));
//		
//		RentalDAO rentalDAO = new RentalDAO();
//		
//		rentalDAO.rentalBook(1,1);
//		
//		rentalDAO.findRentalList();
		
		
	}
}
