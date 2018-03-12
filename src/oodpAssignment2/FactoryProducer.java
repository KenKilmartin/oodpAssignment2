package oodpAssignment2;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){

		if(choice.equalsIgnoreCase("Book")){
			return new BookFactory();

		}else if(choice.equalsIgnoreCase("CD")){
			return new CdFactory();
		}

		return null;
	}
}