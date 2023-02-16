public class Coffre {
	boolean state = false;
	boolean presence_objet = false ;
	final int POSITION_X;
	final int POSITION_Y;
	//Objets content;
	
	public boolean is_open() {
		return state;
	}
	public void open() {
		this.state = true;
	}
	public void close() {
		this.state = false;
	}
	public boolean is_empty(){
		return presence_objet;
	}
	public void take() {
		this.presence_objet = false;
	}
	public void file() {
		this.presence_objet = true;
	}
	
	/*public void what_content() {
		System.out.println("Ce coffre contient : ");
	}*/
}
