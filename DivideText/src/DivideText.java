/**
 * Created by A.Zotov on 25.04.2017.
 */
public class DivideText {
    public static void main(String[] args) {
        String text = "Java provides the java.util.regex package for pattern matching with regular expressions. Java regular expressions are very similar to the Perl programming language and very easy to learn.\n" +
                "A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. They can be used to search, edit, or manipulate text and data.\n" +
                "The java.util.regex package primarily consists of the following three classes − Pattern Class − A Pattern object is a compiled representation of a regular expression. The Pattern class provides no public constructors. To create \n" +
                "a pattern, you must first invoke one of its public static compile() methods, which will then return a Pattern object. These methods accept a regular expression as the first argument.\n" +
                "Matcher Class − A Matcher object is the engine that interprets the pattern and performs match operations against an input string. Like the Pattern class, Matcher defines no public constructors. You obtain a Matcher object by \n" +
                "invoking the matcher() method on a Pattern object.PatternSyntaxException − A PatternSyntaxException object is an unchecked exception that indicates a syntax error in a regular expression pattern.\n" +
                "Capturing Groups Capturing groups are a way to treat multiple characters as a single unit. They are created by placing the characters to be grouped inside a set of parentheses. For example, the regular expression (dog) creates a single group containing the letters \"d\", \"o\", and \"g\".\n" +
                "Capturing groups are numbered by counting their opening parentheses from the left to the right. In the expression ((A)(B(C))), for example, there are four such groups −\n" +
                "((A)(B(C)))(A)(B(C))(C)To find out how many groups are present in the expression, call the groupCount method on a matcher object. The groupCount method returns an int showing the number of capturing groups present in the matcher's pattern.\n" +
                "There is also a special group, group 0, which always represents the entire expression. This group is not included in the total reported by groupCount.";

            String[] divText = text.split("\\s");

            for(int i=0; i<=divText.length - 1; i++){
                System.out.println("Number of word " + i + " " + divText[i]);
            }

    }
}
