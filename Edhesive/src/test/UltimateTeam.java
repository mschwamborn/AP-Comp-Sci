package test;

import java.util.ArrayList;

public class UltimateTeam {
	ArrayList<UltimatePlayer> players;
	ArrayList<Coach> coaches;
	
	public UltimateTeam(ArrayList<UltimatePlayer> player, ArrayList<Coach> coach) {
		coaches = (ArrayList<Coach>) coach.clone();
		players = (ArrayList<UltimatePlayer>) player.clone();
		
	}
	public String getCutters() {
		String out = "";
		for(UltimatePlayer p : players) {
			if(p.getPosition().equals("cutter"))
			{
				out += p.toString()+"\n";
			}
				
		}
		
		return out;
		
	}
	public String getHandlers() {
		String out = "";
		for(UltimatePlayer p : players) {
			if(p.getPosition().equals("handler"))
			{
				out += p.toString()+"\n";
			}
			
		}
		
		return out;
		
	}
	
	public String toString() {
		String out ="";
		out += "COACHES\n";
		
		for(Coach c : coaches) {
			out+=c.toString()+"\n";
		}
		
		out+="\nPLAYERS\n";
		for(UltimatePlayer p : players)
		{
			out+=p.toString()+"\n";
			
		}
		
		out+= getCutters();
		out+= getHandlers();
		
			
		
		return out;
	}

}
