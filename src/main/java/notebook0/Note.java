package notebook0;

import java.util.Date;

public class Note {
    private String text;
    private Date date;
    private String author;


    public Note(String text, Date date, String author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getdate() {
        return date;
    }

    public void setdate(Date date) {
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void print() {
        System.out.println("Text: " + this.getText() + "\n" + "Datum: " + this.getdate() + "\n" + this.getAuthor());
    }
}
