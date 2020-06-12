package week1.day2;

public class OddIndexToUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] strToCharArray = test.toCharArray();
		for(int i=0;i<strToCharArray.length;i++) {
		
			  if (i % 2 == 0) {
			        System.out.print(Character.toUpperCase(strToCharArray[i]));
			    } else {
			        System.out.print(Character.toLowerCase(strToCharArray[i]));
			    }
		}
	}

}

