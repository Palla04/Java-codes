package StringPrograms;

public class Program28_StringToChars {

	public static void main(String[] args) {
		String str = new String("Classroom");
		
		/* Convert String to Xharacter Array */
		char arr[] = str.toCharArray();
		
		System.out.println(arr);
		
		/* Process 1 : Modification not possible through index */
		for(char element : arr)
		{
			System.out.println(element);
		}
		
		/* Process 2 : Modification possible through index */
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Index : "+i);
			System.out.println("Element : "+arr[i]);
		}
	}

}
