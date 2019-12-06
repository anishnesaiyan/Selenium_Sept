package string_Programs;

public class Remove_words_using_regex_EMIS {

	public static void main(String[] args) {
		
		String str= "Hi<b>how are<em>you<span>";
		
		String d = str.replaceAll("<[^>]+>", "");
		
		//<[^>]+> -- meaning
		
		// < --- start from < brackets
		// [^>] -- except > take all other characters for more than one occurrence
		// > --- Include close braces
		System.out.println(str);
		System.out.println(d);

	}

}
