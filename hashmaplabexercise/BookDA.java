package hashmaplabexercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookDA {

    private HashMap<String, Book> bookMap;

    public HashMap<String, Book> getBookMap() {
        return bookMap;
    }
    public BookDA(){
        try{
            Scanner inputFile = new Scanner(new FileReader("E:\\JavaForSchool\\ooplab\\src\\hashmaplabexercise\\Book.csv"));
            inputFile.nextLine();
            bookMap = new HashMap<>();
            while(inputFile.hasNext()){
                String lineData;
                lineData = inputFile.nextLine();
                String[] splitData;
                splitData = lineData.split(",");

                Book book = new Book();

                book.setIsbn(splitData[0].trim());
                book.setTitle(splitData[1].trim());

                AuthorDA authorDA = new AuthorDA();
                book.setAuthor(authorDA.getAuthorHashMap().get(splitData[2].trim()));
                bookMap.put(book.getIsbn(), book);
            }
            inputFile.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
