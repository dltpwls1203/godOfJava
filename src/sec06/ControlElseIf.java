package sec06;

public class ControlElseIf {

	public static void main(String[] args) {
		ControlElseIf sample = new ControlElseIf();
		sample.elseIf(79);

	}
	
	public void elseIf(int point) {
	String result = point > 90 ? "A" : point > 80 ? "B" : point > 70 ? "C" : "F";
	System.out.println(result);
	} 

}
