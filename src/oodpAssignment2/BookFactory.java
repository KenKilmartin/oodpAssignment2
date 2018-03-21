package oodpAssignment2;

public class BookFactory extends AbstractFactory {

	  //create an object of SingleObject
	   private static BookFactory instance = new BookFactory();
	        
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private BookFactory(){}

	   //Get the only object available
	   public static BookFactory getInstance(){
	      return instance;
	   }

	
	@Override
	Book getBook(String bookName) {
		if(bookName == null){
			return null;
		}
		if(bookName.equalsIgnoreCase("Harry Potter")){
			return new HarryPotter();
		}else if(bookName.equalsIgnoreCase("Hunger Games")){
			return new HungerGames();
		}else if(bookName.equalsIgnoreCase("1984")){
			return new NineteenEightyFour();
		}else if(bookName.equalsIgnoreCase("Ulysses")){
			return new Ulysses();
		}else if(bookName.equalsIgnoreCase("Metamorphosis")){
			return new Metamorphosis();
		}
		return null;
	}
	

	@Override
	Cd getCd(String cdName) {
		return null;
	}


	@Override
	ComicBook getComic(String comicName) {
		// TODO Auto-generated method stub
		return null;
	}

}
