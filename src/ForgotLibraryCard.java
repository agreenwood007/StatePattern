
public class ForgotLibraryCard implements LibraryState {
	
	TheLibrary theLibrary;
	
	public ForgotLibraryCard(TheLibrary newTheLibrary) {
		
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
		System.out.println("You can't check out a book"); 
		
	}	
	
	public void barCode(int barCodeScan) {
		System.out.println("You don't have a card");
	}

}
