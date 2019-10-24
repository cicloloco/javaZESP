package pruebas;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

	private static final String REGEX = ".*ZESP.*";
	private static final String INPUT = "jalfkjZESPoooooooooooooo";
	private static Pattern pattern;
	private static Matcher matcher;

	public TestRegEx() {
		// TODO Auto-generated constructor stub
	}

	   public static void main( String args[] ) {
		      pattern = Pattern.compile(REGEX);
		      matcher = pattern.matcher(INPUT);

		      System.out.println("Current REGEX is: "+REGEX);
		      System.out.println("Current INPUT is: "+INPUT);

		      System.out.println("lookingAt(): "+matcher.lookingAt());
		      System.out.println("matches(): "+matcher.matches());
		   }
}
