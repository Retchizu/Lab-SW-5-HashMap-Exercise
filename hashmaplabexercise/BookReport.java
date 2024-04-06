package hashmaplabexercise;

import java.util.HashMap;

public class BookReport {
    public static void main(String[] args) {
        BookDA bookDA = new BookDA();

        for(HashMap.Entry<String, Book> entryMap: bookDA.getBookMap().entrySet()){
            System.out.println(entryMap.getValue().getIsbn() + " " + entryMap.getValue().getTitle());
            System.out.println("\t" + entryMap.getValue().getAuthor().getName() + " - " + entryMap.getValue().getAuthor().getBio());

        }
    }

}
