package m2.vv.tutorials;

public class Quote {

    String author;
    String text;

    public Quote(String author, String text) {
        setAuthor(author);
        setText(text);
    }

    public String getAuthor() { return author;  }

    private void setAuthor(String author) {
        if(author == null) throw new NullPointerException("Author's name can't be null");
        this.author = author;
    }

    public String getText() { return text;  }

    private void setText(String text) {
        if(text == null) throw new NullPointerException("Quoted text can not be null");
        if(text.equals("")) throw new java.lang.IllegalArgumentException("Quoted text can not be empy. (You must say something.)");
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", author, text);
    }

}
