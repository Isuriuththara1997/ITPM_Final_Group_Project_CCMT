package ComplexityControlStructure;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlStructureCalculation {



	String conditionalC = "(if\\s*)";
	String iterativeC = "(for\\s*)|(while\\s*)|(do\\s*)";
	String switchC = "(switch\\s*)";
	String caseC = "(case\\s*)";
	
	ArrayList<String> row;
	ArrayList<Integer> Count;

	public ControlStructureCalculation(ArrayList<String> rows) {
		this.row = rows;
		Count = new ArrayList<Integer>(rows.size());
	}


	public int conditionalCcount(String row) {
		Pattern pattern = Pattern.compile(conditionalC);
		Matcher matcher = pattern.matcher(row);

		int conditionalCCount = 0;

		if (matcher.find()) {

			conditionalCCount = conditionalCCount + 2;
		}
		return conditionalCCount;
	}

	public int iterativeCcount(String row) {
		Pattern pattern = Pattern.compile(iterativeC);
		Matcher matcher = pattern.matcher(row);

		int iterativeCCount = 0;

		if (matcher.find()) {

			iterativeCCount = iterativeCCount + 3;
		}
		return iterativeCCount;
	}

	public int switchCcount(String row) {
		Pattern pattern = Pattern.compile(switchC);
		Matcher matcher = pattern.matcher(row);

		int switchCCount = 0;

		if (matcher.find()) {

			switchCCount = switchCCount + 1;
		}
		return switchCCount;
	}

	public int caseCcount(String row) {
		Pattern pattern = Pattern.compile(caseC);
		Matcher matcher = pattern.matcher(row);

		int caseCCount = 0;

		if (matcher.find()) {

			caseCCount = caseCCount + 1;
		}
		return caseCCount;
	}

	public void calculateLineByLine() {
		for (int i = 0; i < row.size(); i++) {
			int conditionalccount = conditionalCcount(row.get(i));
			int iterativeccount = iterativeCcount(row.get(i));
			int switchccount = switchCcount(row.get(i));
			int caseccount = caseCcount(row.get(i));

			Count.add(conditionalccount + iterativeccount + switchccount + caseccount);
		}
	}


	public ArrayList<Integer> ctcsrow() {
		calculateLineByLine();
		return Count;
	}

	public int totalcomplexityCalculate() {
		int totalcomplexity = 0;
		int i;
		for (i = 0; i < Count.size(); i++) {
			totalcomplexity = totalcomplexity + Count.get(i);
		}

		return totalcomplexity;
	}

}
