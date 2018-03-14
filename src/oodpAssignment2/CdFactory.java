package oodpAssignment2;

public class CdFactory extends AbstractFactory{

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
