package abcd.example.find.text;

public class FindTextInCurly {
    private String input;
    private String result;
    private boolean isValid;

    public FindTextInCurly(String input)
    {
        setInput(input);
    }

    public void setInput(String input)
    {
        this.input = input;
        this.result = this.input;
        this.isValid = true;
        parse();
    }

    public String getInput()
    {
        return input;
    }

    public String getResult()
    {
        return result;
    }

    public boolean isValid()
    {
        return isValid;
    }

    private void parse()
    {
        while(true) {
            int openIndex = result.indexOf('{');
            int closeIndex = result.lastIndexOf('}');

            if (openIndex == -1 && closeIndex != -1 || openIndex > closeIndex) {
                isValid = false;
                break;
            }

            if (closeIndex == -1)
                break;

            result = result.substring(openIndex + 1, closeIndex);
        }
    }
}
