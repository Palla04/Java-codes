package InnerClassExample;

public class OuterExample3 {
	private static int outerVar = 10;
	public static class StaticNestedClass {
		private int innerVar;
		public StaticNestedClass(int value) {
			this.innerVar = value;
		}
		
		public void display() {
			System.out.println("InnerVar : "+innerVar);
			System.out.println("outerVar : "+outerVar);
		}
	}

	public static void main(String[] args) {
		OuterExample3.StaticNestedClass nestedObj = new OuterExample3.StaticNestedClass(12);
		nestedObj.display();
		
		StaticNestedClass obj = new StaticNestedClass(123);
		obj.display();

	}

}
