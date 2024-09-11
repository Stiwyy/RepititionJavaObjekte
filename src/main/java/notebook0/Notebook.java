package notebook0;

import java.util.ArrayList;

public class Notebook {

    private ArrayList<Note> notes;

    public Notebook() {
        notes = new ArrayList<>();
    }

    public void storeNote(Note note) {
        notes.add(note);
    }

    public void showNotes() {

        for (int i = 0; i < notes.size(); i++) {
            Note note = notes.get(i);
            System.out.println("Notiz " + (i + 1) + ":");
            System.out.println(printNotes(note));
            System.out.println("---------------------------");
        }

        for (Note note : notes) {
            note.print();
        }

        // Funktionale Programmierung
        notes.forEach(note -> note.print());

        notes.forEach(Note::print);


    }
    public int numberOfNotes(){
        return(notes.size());
    }

    public void removeNote(int noteNumber) {
        if(noteNumber >= 0 && noteNumber < numberOfNotes()) {
            notes.remove(noteNumber);
        }
    }
    public String printNotes(Note note) {
        return("Text: " + note.getText() + "\n" + "Datum: " + note.getdate() + "\n" + note.getAuthor());
    }

}
