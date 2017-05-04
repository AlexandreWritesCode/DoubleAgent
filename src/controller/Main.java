package controller;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import model.Agent;
import model.Database;
import view.Draw;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
	    PrintWriter writer = new PrintWriter("index.html", "UTF-8");
		Database roster = new Database();
		Parser.CSVreader(roster);
		Draw.htmlSetup(writer);
		Draw.agents(writer, roster);
		Draw.close(writer);
		System.out.println("Done.");
	}
}

/**for(Agent x : roster){
if(x.getName().indexOf(substring) >= 0 && x.getAge() <= maxAge){ // empty substring will be added
	a.add(x);
}
}
**/