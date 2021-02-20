
public class TheLibrary {

	LibraryState haveLibraryCard;
	LibraryState forgotLibraryCard;
	LibraryState availableBook;
	LibraryState correctBarCode;
	
	LibraryState libraryState;
	
	int bookBarCode = 4554;
	boolean correctBarCodeScan = false;
	
	public TheLibrary() {
		haveLibraryCard = new HaveLibraryCard(this);
		forgotLibraryCard = new ForgotLibraryCard(this);
		availableBook = new AvailableBook(this);
		correctBarCode = new CorrectBarCode(this); 
		
		libraryState = haveLibraryCard;
		libraryState = forgotLibraryCard;
		libraryState = availableBook;
		

		}
	

	void setLibraryState(LibraryState newLibraryState) {
		libraryState = newLibraryState;
		
	}
	
	public void scanCard() {
		libraryState.scanCard();
	}
	public void noCard() {
		libraryState.noCard();
	}
	public void checkOutBook() {
		libraryState.checkOutBook(); 
	}
	public void barCode(int barCodeScan) {
		libraryState.barCode(barCodeScan);
	}

	public LibraryState getYesCardState() {return haveLibraryCard; }
	public LibraryState getNoCardState() { return forgotLibraryCard; }
	public LibraryState getHaveBook() { return availableBook; }
	public LibraryState getGoodBarScan() {return correctBarCode; }
	
	
	}



