package chapter_11;

public class Tile {
	
	private char letter;
	private int value;
	
	public Tile() {
		this.letter = 'a';
		this.value = 1;
	}
	
	public String toString() {
		String s = this.letter + ":" + this.value;
		return s;
	}
	
	public boolean equals(Tile that) {
		return Character.compare(this.letter, that.letter) == 0 && this.value == that.value;
	}
	
	public int getLetter() {
	    return this.letter;
	}

	public int getValue() {
	    return this.value;
	}
	
	public void setLetter(char c) {
	    this.letter = c;
	}

	public void setValue(int value) {
	    this.value = value;
	}

	/**
	 * A method that takes a Tile object as a parameter and displays the instance variables in a reader-friendly format.
	 * 
	 * @param tile
	 */
	public static void printTile(Tile tile) {
		System.out.print("Letter: " + tile.letter + "\t");
		System.out.println("Value " + tile.value);
	}
	
	/**
	 * A method that creates a Tile object with the letter Z and the value 10, 
	 * and then uses printTile to display the state of the object.
	 */
	public static void testTile() {
		Tile tile = new Tile();
		tile.letter = 'z';
		tile.value = 10;
		printTile(tile);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTile();
	}

}
