package oodpAssignment2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){

		if(choice.equalsIgnoreCase("Book")){
			BookFactory object = BookFactory.getInstance();
			return   object ;
			
			

		}else if(choice.equalsIgnoreCase("CD")){
			return new CdFactory();
		}else if(choice.equalsIgnoreCase("ComicBook")){
			return new ComicFactory();
		}

		return null;
	}
}