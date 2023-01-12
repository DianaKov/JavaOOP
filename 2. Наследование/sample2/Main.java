package sample2;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a string and press Enter");
			String text = sc.nextLine();
			
			TextTransformer textTransformer1 = new TextTransformer();
			System.out.println(textTransformer1.transform(text));
			
			InverseTransfotmer textTransformer2 = new InverseTransfotmer();
			System.out.println(textTransformer2.transform(text));
			
			UpDownTrnsformer upDownTrnsformer = new UpDownTrnsformer();
			System.out.println(upDownTrnsformer.transform(text));
			
			File file = new File("inheritance.text");
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println(e);
			}
			
			TextSaver textSaver = new TextSaver(textTransformer1, file);
			textSaver.saveTextToFile(text);
		}  
	}

}
