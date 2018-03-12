package oodpAssignment2;

public class BookFactory extends AbstractFactory {

	@Override
	Book getBook(String bookName) {
		if(bookName == null){
			return null;
		}
		if(bookName.equalsIgnoreCase("Harry Potter")){
			return new HarryPotter();
		}else if(bookName.equalsIgnoreCase("Hunger Games")){
			return new HungerGames();
		}
		return null;
	}
	

	@Override
	Cd getCd(String cdName) {
		return null;
	}

}
