//using stringbuffer
public class Stringbuffer {
public static void main(String[] args) {
	StringBuffer sd=new StringBuffer("stringbuffers");
	sd.append(" is a peer class of string");
	sd.append(" that provides much of");
	sd.append(" the functionality of strings");
	System.out.println("sentence is:"+sd);
	StringBuffer sd1=new StringBuffer("it is used to at the specified index position ");
			sd1.insert(14, "insert index");
			System.out.println("complete sentence:"+sd1);
			StringBuffer sd2=new StringBuffer("This method returns the reversed object on which it was called");
			System.out.println("reversing:"+sd2.reverse());
			
  //using stringbuilder
			StringBuilder sd111=new StringBuilder("stringbuffers");
			sd111.append(" is a peer class of string");
			sd111.append(" that provides much of");
			sd111.append(" the functionality of strings");
			System.out.println("sentence is:"+sd1);
			StringBuilder sd11=new StringBuilder("it is used to at the specified index position ");
					sd11.insert(14, "insert index");
					System.out.println("complete sentence:"+sd11);
					StringBuilder sd21=new StringBuilder("This method returns the reversed object on which it was called");
					System.out.println("reversing:"+sd21.reverse());
}
}
