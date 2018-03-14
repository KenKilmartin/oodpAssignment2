package oodpAssignment2;

public abstract class AbstractFactory {
	abstract Book getBook(String bookName);
	abstract Cd getCd(String cdName) ;
	abstract ComicBook getComic(String comicName) ;

}
