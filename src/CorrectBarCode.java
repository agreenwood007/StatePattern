
public class CorrectBarCode implements LibraryState {
	
	TheLibrary theLibrary;
	
	public CorrectBarCode(TheLibrary newTheLibrary) {
		theLibrary = newTheLibrary;
	}

	@Override
	public void scanCard() {
		// TODO Auto-generated method stub
		System.out.println("You displayed a library card");
	}

	@Override
	public void noCard() {
		// TODO Auto-generated method stub
		System.out.println("You card is missing");
		theLibrary.setLibraryState(theLibrary.getNoCardState());
	}

	@Override
	public void checkOutBook() {
		// TODO Auto-generated method stub
		System.out.println("Books are available");
	}

	@Override
	public void barCode(int barCodeScan) {
		// TODO Auto-generated method stub
		System.out.println("Scan complete");
	}
	
	

}
