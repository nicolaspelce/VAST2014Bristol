package core;



import java.util.ArrayList;



public abstract class Reader{
	private ArrayList<String[]> myFile;
	private String myFilePath;
	
	public Reader(){
		
	}
	public Reader(ArrayList<String[]> myFile, String myFilePath){
		myFile=this.myFile;
		myFilePath=this.myFilePath;
	}
	
	public abstract void readCsv(ArrayList<String[]> myFile, String myFilePath) throws Exception;
		
		
		
	
	public ArrayList<String[]> getMyFile() {
		return myFile;
	}
	public void setMyFile(ArrayList<String[]> myFile) {
		this.myFile = myFile;
	}
	public String getMyFilePath() {
		return myFilePath;
	}
	public void setMyFilePath(String myFilePath) {
		this.myFilePath = myFilePath;
	}
}
