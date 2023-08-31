package task14Medium;

import java.text.MessageFormat;

import static task14Medium.Speak.stuttering;

public class MessageFormatUse {
    public static void main(String[] args) {
        System.out.println(stuttering("astonishing"));
    }
}

class Speak {
    public static String stuttering(String word) {
        String wordSubstring = word.substring(0,2);
        String ellipses  = "...";
        char exclamationMark = '!';

        Object[] testArgs = {wordSubstring,ellipses,exclamationMark};

        MessageFormat form = new MessageFormat(
                wordSubstring + ellipses + " " + wordSubstring + ellipses + " " + word + exclamationMark);

        return form.format(testArgs);
    }
}
