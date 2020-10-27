package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Congratulations, you deserve this opportunity!");
		Post p1 = new Post(sdf.parse("13/10/2020 13:13:44"), 
				"Traveling to Silicon Valley.",
				"I will work in this wonderful place!", 
				12);
		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("Sleep well, recover your energy, tomorrow there is more.");
		Post p2 = new Post(sdf.parse("15/10/2020 23:13:13"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);

	}
}
