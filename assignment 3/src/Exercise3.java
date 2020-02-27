

public class Exercise3 {
    private String pattern;
    private String htmlSyntax;
    private int index;
    private int start;
    private int end;

    public Exercise3(String htmlSyntax) {
        this.htmlSyntax = htmlSyntax;
    }

    public void check() {
        char ch = ' ';
        for(int i = 0; i < htmlSyntax.length(); i++) {
            ch = htmlSyntax.charAt(i);
            if(ch == '<') {
                index = i + 1;
                break;
            }
        }

        for(int i = index; i < htmlSyntax.length(); i++) {
            if((htmlSyntax.charAt(i) >= 97) && (htmlSyntax.charAt(i) <= 122)) {
                start = i;
                break;
            }
        }

        for(int i = start; i < htmlSyntax.length(); i++) {
            if((htmlSyntax.charAt(i) ==  ' ') || (htmlSyntax.charAt(i)) == '>') {
                end = i;
                break;
            }
        }

        String str = htmlSyntax.substring(start, end);
        pattern = "\\s*<\\s*[a-z]+\\s*>(.*)<\\s*\\/" + str + "\\s*>";
        if(htmlSyntax.matches(pattern)) {
            System.out.println("The html tag is correct.");
        } else {
            System.out.println("The html tag is incoorect.");
        }
    }
}
