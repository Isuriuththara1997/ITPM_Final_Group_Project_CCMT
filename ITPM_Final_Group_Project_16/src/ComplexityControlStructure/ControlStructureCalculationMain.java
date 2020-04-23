package ComplexityControlStructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ControlStructureCalculationMain {
public static void main(String[] args) throws IOException {
		

		String documentName = "C:\\Users\\isuri\\Desktop\\abc.txt";
		FileReader document = new FileReader(documentName);
		BufferedReader bufferedreader = new BufferedReader(document);
		
		int i;
		String rows;
		ArrayList<String> row = new ArrayList<>();
		
		while((rows = bufferedreader.readLine())!= null) {
			row.add(rows);
		}
		
		ControlStructureCalculation complexity = new ControlStructureCalculation(row);
		
		ArrayList<Integer> Count = complexity.ctcsrow();
		

		
		for(i = 0; i < row.size(); i++) {
			System.out.println("Row Number " + (i+1) + " Count is = " +Count.get(i));
		}
		
		System.out.println("Total Complexity of the control structur = " +complexity.totalcomplexityCalculate());
		
	}


}
