package homeworkOOPday5_Book;

public class BookStore {
	public static void main(String[] args) {

		// Define Book

		Book bookDacNhanTam = new Book();
		bookDacNhanTam.setId(1);
		bookDacNhanTam.setName("Dac Nhan Tam");
		bookDacNhanTam.setISBN("ISBN 0-111-22222-1");
		bookDacNhanTam.setAuthor("Dale Carnegie");
		bookDacNhanTam.setTotalStock(2000);

		Book bookMuonKiepNhanSinh = new Book();
		bookMuonKiepNhanSinh.setId(2);
		bookMuonKiepNhanSinh.setName("Muon Kiep Nhan Sinh");
		bookMuonKiepNhanSinh.setISBN("ISBN 0-111-22222-2");
		bookMuonKiepNhanSinh.setAuthor("Nguyen Phong");
		bookMuonKiepNhanSinh.setTotalStock(3000);

		Book booNhaGiaKim = new Book();
		booNhaGiaKim.setId(3);
		booNhaGiaKim.setName("Nha Gia Kim");
		booNhaGiaKim.setISBN("ISBN 0-111-22222-3");
		booNhaGiaKim.setAuthor("Paulo Coelho");
		booNhaGiaKim.setTotalStock(4000);

		Book[] books = { bookDacNhanTam, bookMuonKiepNhanSinh, booNhaGiaKim };

		// Define Type

		Genre genreSelfHelf = new Genre();
		genreSelfHelf.setId(1);
		genreSelfHelf.setNameOfGenre("Self-help");

		Genre genreNonFiction = new Genre();
		genreNonFiction.setId(2);
		genreNonFiction.setNameOfGenre("NonFiction");

		Genre genreNovel = new Genre();
		genreNovel.setId(3);
		genreNovel.setNameOfGenre("Novel");

		Genre[] genres = { genreSelfHelf, genreNonFiction, genreNovel };

		// Define Genre Of Book

		GenreOfBook genreOfDacNhanTam = new GenreOfBook();
		genreOfDacNhanTam.setId(1);
		genreOfDacNhanTam.setBook(bookDacNhanTam);
		genreOfDacNhanTam.setGenre(genreSelfHelf);

		GenreOfBook genre1OfMuonKiepNhanSinh = new GenreOfBook();
		genre1OfMuonKiepNhanSinh.setId(2);
		genre1OfMuonKiepNhanSinh.setBook(bookMuonKiepNhanSinh);
		genre1OfMuonKiepNhanSinh.setGenre(genreNonFiction);

		GenreOfBook genre2OfMuonKiepNhanSinh = new GenreOfBook();
		genre2OfMuonKiepNhanSinh.setId(3);
		genre2OfMuonKiepNhanSinh.setBook(bookMuonKiepNhanSinh);
		genre2OfMuonKiepNhanSinh.setGenre(genreSelfHelf);

		GenreOfBook genreOfNhaGiaKim = new GenreOfBook();
		genreOfNhaGiaKim.setId(4);
		genreOfNhaGiaKim.setBook(booNhaGiaKim);
		genreOfNhaGiaKim.setGenre(genreNovel);

		GenreOfBook[] genreOfBooks = { genreOfDacNhanTam, genre1OfMuonKiepNhanSinh, genre2OfMuonKiepNhanSinh,
				genreOfNhaGiaKim };

		// Define Location

		Location locationHaNoi = new Location();
		locationHaNoi.setId(1);
		locationHaNoi.setNameOfWareHouse("Nha Sach Ha Noi");
		locationHaNoi.setAddress("Quan Hai Ba Trung - TP Ha Noi");

		Location locationHCM = new Location();
		locationHCM.setId(2);
		locationHCM.setNameOfWareHouse("Nha Sach Ho Chi Minh");
		locationHCM.setAddress("Quan 1- TP Ho Chi Minh");

		Location[] locations = { locationHaNoi, locationHCM };

		// Define StockDetail

		StockDetail stock1OfDacNhanTam = new StockDetail();
		stock1OfDacNhanTam.setId(1);
		stock1OfDacNhanTam.setBook(bookDacNhanTam);
		stock1OfDacNhanTam.setLocation(locationHaNoi);
		stock1OfDacNhanTam.setQuantity(1500);

		StockDetail stock2OfDacNhanTam = new StockDetail();
		stock2OfDacNhanTam.setId(2);
		stock2OfDacNhanTam.setBook(bookDacNhanTam);
		stock2OfDacNhanTam.setLocation(locationHCM);
		stock2OfDacNhanTam.setQuantity(500);

		StockDetail stock1OfMuonKiepNhanSinh = new StockDetail();
		stock1OfMuonKiepNhanSinh.setId(3);
		stock1OfMuonKiepNhanSinh.setBook(bookMuonKiepNhanSinh);
		stock1OfMuonKiepNhanSinh.setLocation(locationHaNoi);
		stock1OfMuonKiepNhanSinh.setQuantity(2000);

		StockDetail stock2OfMuonKiepNhanSinh = new StockDetail();
		stock2OfMuonKiepNhanSinh.setId(4);
		stock2OfMuonKiepNhanSinh.setBook(bookMuonKiepNhanSinh);
		stock2OfMuonKiepNhanSinh.setLocation(locationHCM);
		stock2OfMuonKiepNhanSinh.setQuantity(1000);

		StockDetail stock1OfNhaGiaKim = new StockDetail();
		stock1OfNhaGiaKim.setId(5);
		stock1OfNhaGiaKim.setBook(booNhaGiaKim);
		stock1OfNhaGiaKim.setLocation(locationHaNoi);
		stock1OfNhaGiaKim.setQuantity(3500);

		StockDetail stock2OfNhaGiaKim = new StockDetail();
		stock2OfNhaGiaKim.setId(6);
		stock2OfNhaGiaKim.setBook(booNhaGiaKim);
		stock2OfNhaGiaKim.setLocation(locationHCM);
		stock2OfNhaGiaKim.setQuantity(500);

		StockDetail[] stockDetails = { stock1OfDacNhanTam, stock2OfDacNhanTam, stock1OfMuonKiepNhanSinh,
				stock2OfMuonKiepNhanSinh, stock1OfNhaGiaKim, stock2OfNhaGiaKim };

		// Define Customer

		Customer customerHoang = new Customer();
		customerHoang.setId(1);
		customerHoang.setName("Hoang Doan");
		customerHoang.setDateOfBirth("ddmmyyyy");
		customerHoang.setPhoneNumber("09111222333");
		customerHoang.setMail("hoangdoan321@gmail.com");

		Customer customerDung = new Customer();
		customerDung.setId(2);
		customerDung.setName("Dung Nguyen");
		customerDung.setDateOfBirth("ddmmyyyy");
		customerDung.setPhoneNumber("0968686868");
		customerDung.setMail("dungnguyen123@gmail.com");

		Customer[] customers = { customerHoang, customerDung };

		// Define Status Of Book

		StatusOfBook statusDacNhanTamHoang = new StatusOfBook();
		statusDacNhanTamHoang.setId(1);
		statusDacNhanTamHoang.setBook(bookDacNhanTam);
		statusDacNhanTamHoang.setCustomer(customerHoang);
		statusDacNhanTamHoang.setBorrowDate("20/04/2023");
		statusDacNhanTamHoang.setReturned(true);
		statusDacNhanTamHoang.setReturnDate("22/04/2023");

		StatusOfBook statusDacNhanTamDung = new StatusOfBook();
		statusDacNhanTamDung.setId(2);
		statusDacNhanTamDung.setBook(bookDacNhanTam);
		statusDacNhanTamDung.setCustomer(customerDung);
		statusDacNhanTamDung.setBorrowDate("21/04/2023");
		statusDacNhanTamDung.setReturned(false);
		// statusDacNhanTamDung.returnDate = "24/04/2023";

		StatusOfBook statusMuonKiepNhanSinhHoang = new StatusOfBook();
		statusMuonKiepNhanSinhHoang.setId(3);
		statusMuonKiepNhanSinhHoang.setBook(bookMuonKiepNhanSinh);
		statusMuonKiepNhanSinhHoang.setCustomer(customerHoang);
		statusMuonKiepNhanSinhHoang.setBorrowDate("20/04/2023");
		statusMuonKiepNhanSinhHoang.setReturned(true);
		statusMuonKiepNhanSinhHoang.setReturnDate("23/04/2023");

		StatusOfBook statusMuonKiepNhanSinhDung = new StatusOfBook();
		statusMuonKiepNhanSinhDung.setId(4);
		statusMuonKiepNhanSinhDung.setBook(bookMuonKiepNhanSinh);
		statusMuonKiepNhanSinhDung.setCustomer(customerDung);
		statusMuonKiepNhanSinhDung.setBorrowDate("21/04/2023");
		statusMuonKiepNhanSinhDung.setReturned(true);
		statusMuonKiepNhanSinhDung.setReturnDate("24/04/2023");

		StatusOfBook statusNhaGiaKim = new StatusOfBook();
		statusNhaGiaKim.setId(5);
		statusNhaGiaKim.setBook(booNhaGiaKim);
		statusNhaGiaKim.setCustomer(customerHoang);
		statusNhaGiaKim.setBorrowDate("20/04/2023");
		statusNhaGiaKim.setReturned(false);

		StatusOfBook[] statusOfBooks = { statusDacNhanTamHoang, statusDacNhanTamDung, statusMuonKiepNhanSinhHoang,
				statusMuonKiepNhanSinhDung, statusNhaGiaKim };
		showBorrowList(statusOfBooks);
		showStatusOfBorrowReturnt(books, statusOfBooks);

	}

	public static void showBorrowList(StatusOfBook[] statusOfBooks) {
		System.out.println("Borrow List : ");
		System.out.println("---------------------------------------");
		for (StatusOfBook statusOfBook : statusOfBooks) {
			if (statusOfBook.isReturned() == true) {
				System.out.println(statusOfBook.getBook().getName());
				System.out.println("Borrow Date: " + statusOfBook.getBorrowDate() + " ------ Return Date: "
						+ statusOfBook.getReturnDate());
				System.out.println("");
			} else if (statusOfBook.isReturned() == false) {
				System.out.println(statusOfBook.getBook().getName());
				System.out.println("Borrow Date: " + statusOfBook.getBorrowDate() + " ------ Return Date: "
						+ "Has not been return yet");
				System.out.println("");
			}
		}
	}

	public static void showStatusOfBorrowReturnt(Book[] books, StatusOfBook[] statusOfBooks) {
		System.out.println("");
		System.out.println("Borrow/return status:");
		for (Book book : books) {
			System.out.println("---------------------------------------");
			System.out.println("Book : " + book.getName());
			System.out.println("Author : " + book.getAuthor());

			for (StatusOfBook statusOfBook : statusOfBooks) {
				if (statusOfBook.getBook() == book && statusOfBook.isReturned() == true) {
					System.out.println("");
					System.out.println("Borrowed by : " + statusOfBook.getCustomer().getName() + " -- Tel : xxxx.xxx."
							+ statusOfBook.getCustomer().getPhoneNumber());
					System.out.println("Borrow Date: " + statusOfBook.getBorrowDate() + " ------ Return Date: "
							+ statusOfBook.getReturnDate());
				} else if (statusOfBook.getBook() == book && statusOfBook.isReturned() == false) {
					System.out.println("");
					System.out.println("Borrowed by : " + statusOfBook.getCustomer().getName() + " -- Tel : xxxx.xxx."
							+ statusOfBook.getCustomer().getPhoneNumber());
					System.out.println("Borrow Date: " + statusOfBook.getBorrowDate() + " ------ Return Date: "
							+ "Has not been return yet");
				}
			}
		}
	}
}
