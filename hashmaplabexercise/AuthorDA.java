package hashmaplabexercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class AuthorDA {
   private HashMap<String, Author> authorHashMap;

    public HashMap<String, Author> getAuthorHashMap() {
        return authorHashMap;
    }

    public void setAuthorHashMap(HashMap<String, Author> authorHashMap) {
        this.authorHashMap = authorHashMap;
    }

    public AuthorDA(){
        try{
            Scanner inputFile = new Scanner(new FileReader("E:\\JavaForSchool\\ooplab\\src\\hashmaplabexercise\\Author.csv"));
            authorHashMap = new HashMap<>();
            while(inputFile.hasNext()){
                String lineData;
                lineData = inputFile.nextLine();
                String[] splitData;
                splitData = lineData.split(",");


                Author author = new Author();
                author.setName(splitData[0].trim());
                author.setBio(splitData[1].trim());
                authorHashMap.put(author.getName(), author);
            }
            inputFile.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
