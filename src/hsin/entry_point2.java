package hsin;

public class entry_point2 {
	public static void main(String args[]) {
		System.out.println("hello");
		
		String myFile = "myfile.pdf";
		System.out.println(getExtention(myFile));
		
		explainFinal ef = new explainFinal(10);
		for(int i=0; i<=5; i++) {
			ef.add();
			System.out.printf("%s",ef);
		}
		
	}
	
	public static String getExtention(String filename) {
		String ext = "";
		for (int i=filename.length();i>=0;i--) {
			char c = filename.charAt(i-1);
			//System.out.println(c);
			ext = c + ext;
			if (c == '.') {
				break;
			}
		}
		return ext;
	}
	
	
	
}
