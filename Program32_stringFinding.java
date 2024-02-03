package StringPrograms;

public class Program32_stringFinding {

	public static void main(String[] args) {
		String s1 = "Welcome to Classroomroom";
		String s2 = "room";
		
		int found = 0;
		int range = s1.length()-(s2.length()-1);
		for(int i=0;i<range;i++) {
			
			
			String temp = (String) s1.subSequence(i,i+s2.length());
			System.out.println(  temp  );
			if(temp.equals(s2)) {
				found++;
				//break;
			}
		}
		
		System.out.println(found);
		
		if(found>=1)
			System.out.println("found");
		else
			System.out.println("not found");

	}

}


/*subSequence(Start, End+1)
ab 0-1  subSequence(0, 2) : subSequence(0, 0+2)
bc 1-2  subSequence(1, 3) : subSequence(1, 1+2)
ca 2-3  subSequence(2, 4) : subSequence(2, 2+2)
ab 3-4  subSequence(3, 5) : subSequence(2, 3+2)
bd 4-5  subSequence(4, 6)
da 5-6  subSequence(5, 7)
ab 6-7  subSequence(6, 8) : subSequence(6, 6+2)*/
