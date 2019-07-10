public class Splitter2 {

	public static void main(String[] args) {
	   String text = "This is, some , text, that I want, to split, at, each, comma";

	   String [] splitText = text.split(",");

	   for ( int index =0; index <splitText.length; ++index) {

		System.out.println(splitText[index].trim());

	   }

	   System.out.println();
	   System.out.println("The string was split into " + splitText.length + " elements");
	}
}
