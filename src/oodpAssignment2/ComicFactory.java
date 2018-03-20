package oodpAssignment2;

 

public class ComicFactory extends AbstractFactory{
	
	
	
	 //create an object of SingleObject
	   private static ComicFactory instance = new ComicFactory();
	        
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private ComicFactory(){}

	   //Get the only object available
	   public static ComicFactory getInstance(){
	      return instance;
	   }
	

	@Override
	Book getBook(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Cd getCd(String cdName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	ComicBook getComic(String comicName) {
		
		if(comicName == null) {
			return null;	
		}
		if(comicName.equalsIgnoreCase("Squee")){
			return (ComicBook) new SqueeAdapter();
		}
		return null;
	}

}

