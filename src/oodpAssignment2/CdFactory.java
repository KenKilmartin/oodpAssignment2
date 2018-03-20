package oodpAssignment2;

public class CdFactory extends AbstractFactory{
	
	
	 //create an object of SingleObject
	   private static CdFactory instance = new CdFactory();
	        
	   //make the constructor private so that this class cannot be
	   //instantiated
	   private CdFactory(){}

	   //Get the only object available
	   public static CdFactory getInstance(){
	      return instance;
	   }
	
	
	

	@Override
	Book getBook(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Cd getCd(String cdName) {
		if(cdName == null){
			return null;
		}
		if(cdName.equalsIgnoreCase("American Idiot")){
			return new AmericanIdiotCD();
		}else if(cdName.equalsIgnoreCase("Californication")){
			return new Californication();
		}
		return null;
	}

	@Override
	ComicBook getComic(String comicName) {
		// TODO Auto-generated method stub
		return null;
	}

}
