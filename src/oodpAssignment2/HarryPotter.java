package oodpAssignment2;

import javax.swing.ImageIcon;

public class HarryPotter implements Book{

	private String name, author, desc;
	private ImageIcon image;

	public HarryPotter() {
		name = "Harry Potter";
		author = "J.K. Rowling";
		desc = "Harry Potter and the Philosopher's Stone is a fantasy novel written by British author J. K. Rowling. It is the first novel in the Harry Potter series and Rowling's debut novel, first published in 1997 by Bloomsbury. It was published in the United States as Harry Potter and the Sorcerer's Stone by Scholastic Corporation in 1998. The plot follows Harry Potter, a young wizard who discovers his magical heritage as he makes close friends and a few enemies in his first year at the Hogwarts School of Witchcraft and Wizardry. With the help of his friends, Harry faces an attempted comeback by the dark wizard Lord Voldemort, who killed Harry's parents, but failed to kill Harry when he was just 15 months old.";
		image = new ImageIcon("images/harry_potter.jpg");
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public ImageIcon getImage() {

		return image;
	}

	@Override
	public String getAuthor() {

		return author;
	}

	@Override
	public String getDesc() {

		return desc;
	}

}
