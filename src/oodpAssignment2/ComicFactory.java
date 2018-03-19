package oodpAssignment2;

 

public class ComicFactory extends AbstractFactory{

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

