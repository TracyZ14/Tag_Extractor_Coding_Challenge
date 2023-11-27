public class Tag {
    private String input;

    public Tag(String input) {
        this.input = input;
    }

    public String returnContent() {
        String content = "";
        int beginningTagBegin = input.indexOf("<");
        int beginningTagEnd = input.indexOf(">");
        String beginningTag = "<" + input.substring(beginningTagBegin + 1, beginningTagEnd) + ">";
        String endTag = "</" + input.substring(beginningTagBegin + 1, beginningTagEnd) + ">";
        int beginningTagIndex = input.indexOf(beginningTag);
        int beginningTagLength = beginningTag.length();
        content = input.substring(beginningTagIndex + beginningTagLength);
        int endTagIndex = input.indexOf(endTag);
        int endTagLength = endTag.length();
        content = content.substring(0, endTagIndex - endTagLength + 1);
        return content;
    }

    /*
    public String returnEmbeddedTagContent() {

    }

    public String checkMismatchedTags()
    {

    }

     */
}