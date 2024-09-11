package notebook0;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<String, String>();
        phoneBook.put("Peter", "(044) 347 8080");
        phoneBook.put("Andrea", "(044) 345 6666");
        phoneBook.put("Willi", "(044) 222 6666");


        for (Map.Entry<String, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Person person1 = new Person("Held", "Lorenz", "079 999 99 99");
        Person person2 = new Person("Ott", "Fabian", "078 888 88 88");
        Person person3 = new Person("Salinger", "Raphael", "077 777 77 77");

        System.out.println("-----------------------");

        System.out.println(person1.getNumber());
        System.out.println(person2.getNumber());
        System.out.println(person3.getNumber());

        System.out.println("-----------------------");

        System.out.println(person1.getVname() + " " + person1.getNname() + ": " + person1.getNumber());
        System.out.println();
        System.out.println(person2.getVname() + " " + person2.getNname() + ": " + person2.getNumber());
        System.out.println();
        System.out.println(person3.getVname() + " " + person3.getNname() + ": " + person3.getNumber());
        /*
        Notebook notebook = new Notebook();
        Note note = new Note("oma besuchen", Date.valueOf("2025-09-12"), "Andrin");
        Note note1 = new Note("Go poste", Date.valueOf("2024-08-22"), "Andrin");
        notebook.storeNote(note);
        notebook.storeNote(note1);
        notebook.showNotes();
        */


    }

}