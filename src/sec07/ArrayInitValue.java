package sec07;

public class ArrayInitValue {

	public static void main(String[] args) {
		ArrayInitValue array = new ArrayInitValue();
		array.referenceTypes();
		

	}
	public void referenceTypes() {
		String [] strings = new String[2];
		ArrayInitValue[] array = new ArrayInitValue[2];
		System.out.println("strings[0]=" +strings[0]);
		System.out.println("array[0]=" +array[0]);
		
	}

}
