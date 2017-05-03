package model;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List<Agent> roster;
	public Database (){
		roster = new ArrayList<Agent>();
	}
	public Agent[] getRoster(String substring, int maxAge){ // set large initial max age to include all agents
		List<Agent> a = new ArrayList<Agent>();
		for(Agent x : roster){
			if(x.getName().indexOf(substring) >= 0 && x.getAge() <= maxAge){ // empty substring will be added
				a.add(x);
			}
		}
		return a.toArray(new Agent[a.size()]);
	}
	public void add(Agent agent) {
		roster.add(agent);
	}
}
