package sec06;

public class ControlLabel {

	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		control.printTimeTable();
		

	}
	public void printTimeTable() {
		int i = 0;
		int j = 0;
		int to = 0;
		
		for(i=2; i<10; i++ ) {
			for(j=1; j<10; j++) {
				to = i*j; 
				System.out.printf("%d*%d=%d,  ", i,j,to);
				
			}
			System.out.println();
			
		}
	}

}
