
public class AvailableBook implements LibraryState {

TheLibrary theLibrary;
	
	public AvailableBook(TheLibrary newTheLibrary) {
		
		theLibrary = newTheLibrary;
		
	}
	
	public void scanCard() {
		System.out.println("Please scan your card");
		theLibrary.setLibraryState(theLibrary.getYesCardState());
	}
	
	public void noCard() {
		System.out.println("You don't have a card to scan");
	}
	
	public void checkOutBook() {
		System.out.println("Check out your books");
	
	}	
	public void barCode(int barCodeScan) {
		System.out.println("Books are available");
		
	}	
}
