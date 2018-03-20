package oodpAssignment2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){

		if(choice.equalsIgnoreCase("Book")){
			BookFactory object = BookFactory.getInstance();
			return   object ;		
		}else if(choice.equalsIgnoreCase("CD")){
			CdFactory object = CdFactory.getInstance();
			return   object ;
		}else if(choice.equalsIgnoreCase("ComicBook")){
			ComicFactory object = ComicFactory.getInstance();
			return   object ;

		}

		return null;
	}
}