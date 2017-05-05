package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List<Agent> roster;
	public Database (){
		roster = new ArrayList<Agent>();
	}
	public Agent[] getRoster(){ // array list to array
		return roster.toArray(new Agent[roster.size()]);
	}
	public void add(Agent agent) {
		roster.add(agent);
	}
}
