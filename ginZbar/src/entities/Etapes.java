package entities;

public class Etapes {

	public void melanger(String...args){
		String print="";
		for (String s :args){
			print=""+s;
			
		}
		
		System.out.println("melangez" + print);
		
	}
	
	public void verser(String...args){
		String print="";
		for (String s :args){
			print=""+s;
			
		}
		
		System.out.println("versez"+ print+" dans un verre");
		
	}
}
