package chapter_9;
import java.nio.file.FileSystemNotFoundException;
import java.util.Arrays;

public class Scrabble {
	
	public static String sortString(String s) {
		char a[] = s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	
	public static boolean canSpell(String tiles, String test) {
		tiles = sortString(tiles);
		test = sortString(test);
//		System.out.println(test.length());
		
		int count = 0;
		for (int i = 0; i < test.length(); i++) {
			for (int j = 0; j < test.length(); j++) {
				if (Character.compare(test.charAt(i), tiles.charAt(j)) == 0) {
					tiles = tiles.replace(test.charAt(i), ' ');
					tiles = tiles.replaceAll("\\s+", "");
					count = count + 1;
				}
			}
		}
		if (count == test.length()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canSpell("quijibo", "jib"));
	}

}
