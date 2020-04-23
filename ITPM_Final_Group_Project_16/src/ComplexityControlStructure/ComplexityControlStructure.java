package ComplexityControlStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ComplexityControlStructure {

	public static void main(String[] args) throws IOException {
		String documentName = "C:\\Users\\isuri\\Desktop\\abc.txt";
		FileReader document = new FileReader(documentName);
		BufferedReader bufferedreader = new BufferedReader(document);
		
		String conditionalC = "if";
		String iterativeCdo = "do";
		String iterativeCfor = "for";
		String iterativeCwhile = "while";
		String switchC = "switch";
		String caseC = "case";
		
		int conditionalCcount = 0;
		int iterativeCdocount = 0;
		int iterativeCforcount = 0;
		int iterativeCwhilecount = 0;
		int switchCcount = 0;
		int caseCcount = 0;

		
		String[] words = null;
		String s;

	
		int line = 0;
	
		while((s = bufferedreader.readLine()) != null){
			words = s.split(" ");
			for (String word : words) {
				if (word.equals(conditionalC)) {
					conditionalCcount++;
				}
				if (word.equals(iterativeCdo)) {
					iterativeCdocount++;
				}
				if (word.equals(iterativeCfor)) {
					iterativeCforcount++;
				}
				if (word.equals(iterativeCwhile)) {
					iterativeCwhilecount++;
				}
				if (word.equals(switchC)) {
					switchCcount++;
				}
				if (word.equals(caseC)) {
					caseCcount++;
				}
			}
			
		}
	

		
		if (conditionalCcount != 0) {
			System.out.println(" if " + conditionalCcount + " times " + " Complexity ControlS tructure is = " + conditionalCcount * 2);
		}
		 if (iterativeCdocount != 0) {
			System.out.println(" do " + iterativeCdocount + " times " + " Complexity ControlS tructure is = " + iterativeCdocount * 3);
		} 
		 if (iterativeCforcount != 0) {
			System.out.println(" for " + iterativeCforcount + " times " + " Complexity ControlS tructure is = " + iterativeCforcount * 3);
		}
		 if (iterativeCwhilecount != 0) {
			System.out.println(" while " + iterativeCwhilecount + " times " + " Complexity ControlS tructure is = " + iterativeCwhilecount * 3);
		}
		 if (switchCcount != 0) {
			System.out.println(" switch " + switchCcount + " times " + " Complexity ControlS tructure is = " + switchCcount * 1);
		}
		 if (caseCcount != 0) {
			System.out.println(" case " + caseCcount + " times " + " Complexity ControlS tructure is = " + caseCcount * 1);
		}
		
	}


}
