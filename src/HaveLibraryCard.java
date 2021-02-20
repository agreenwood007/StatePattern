
public class HaveLibraryCard implements LibraryState {
	
	TheLibrary theLibrary;
	
	public HaveLibraryCard(TheLibrary newTheLibrary) {
		theLibrary = newTheLibrary;
		
	}
	
	public void scanCard() {
		System.out.println("You only have one Library Card");
	}
	
	public void noCard() {
		System.out.println("No card available");
		theLibrary.setLibraryState(theLibrary.getNoCardState());
	}
	
	public void checkOutBook() {
		System.out.println("Books are available");
	}
	public void barCode(int barCodeScan) {
		if (barCodeScan == 4554) {
			System.out.println("Correct number scanned");
			theLibrary.correctBarCodeScan = true;
			theLibrary.setLibraryState(theLibrary.getGoodBarScan());
			
		} else {
			System.out.println("You scanned the wrong bar code");
			theLibrary.correctBarCodeScan = false;
			System.out.println("Try scanning again");
			theLibrary.setLibraryState(theLibrary.getNoCardState());
		}
	}

}
