import java.util.*;

public class createFile {

	private Formatter lol;
	
	public void openFile(String a){
		try{
			lol = new Formatter(a);
		}
		catch(Exception e){
			System.out.println("You have an error bitch");
		}
	}
	
	public void addRecords(String m, Float o, Boolean n, Float k){
		lol.format("%s %s %s %s \n", m, o, n, k);
	}
	
	public void closeFile(){
		lol.close();
	}
	
}