import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readAFIle {

	public static void main(String[] args) throws Exception {
		String str="";
		File file = new File("file.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			str+= scan.nextLine();
			
		}
		System.out.println(str);
		scan.close();
		
		int count = 0;
		String pattern="[a-zA-Z0-9]*";
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(str);
		while(m.find()) {
			System.out.println(str.substring(m.start(),m.end())+"-");
		count++;
		}
	System.out.println("Total word count is " + count);
		
	}
}
