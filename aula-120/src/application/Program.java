package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thats awesome!");
		
		Post p1 = new Post(sdf.parse("18/10/2021 19:15:33"), "Traveling to Bauru/SP", "I'm go to visit this wonderful city.", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		Comment c3 = new Comment("You're Wonderful!");
		Comment c4 = new Comment("Can you Help-me?");
		
		Post p2 = new Post(sdf.parse("19/10/2021 19:33:15"), "New Dev Java - Alex", "I'm learning Java!", 999);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
	}
}
