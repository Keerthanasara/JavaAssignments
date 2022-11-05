
public class StringMethods {
public static void main(String[] args) {
	String str="Hello World";
	System.out.println("length is:"+str.length());


//using stringbuffer
StringBuffer buffer=new StringBuffer("hello");
buffer.append(" How are u?");
System.out.println("buffer is:"+buffer);
 
StringBuilder builder=new StringBuilder("hello");
builder.append(" How are u?");
System.out.println("builder is:"+builder);


String str1="Java string pool refers to Collection of Strings which are stored in heap memory";
System.out.println("lowercase:"+str1.toLowerCase());
System.out.println("uppercase:"+str1.toUpperCase());
String s1=str1.replace('a','$');
System.out.println("replacing:"+s1);

if(str.contains("Collection")) {
	System.out.println("collection is in the string");
	String str3=new String("Java string pool refers to Collection of Strings which are stored in heap memory");
	String str4=new String("Java string pool refers to Collection of Strings which are stored in heap memory");
	if(str3==str4) {
		System.out.println("str3=str4");
	}
	else {
		System.out.println("str3!=stt4");
	}
}
}
}
