import models.Album;
import models.Author;
import models.Quote;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {

        Album album = new Album(1, "A7X", "Avenged", "1998-10-10", 209, "metal");
        System.out.println(album.getId() + album.getArtist());

        Author author = new Author(1, "Hector", "Perez");
        System.out.println(author.getId() + author.getFirstName());

        Quote quote1 = new Quote(1, "I'm too drunk to taste this chicken", "Colonel Sanders");
        System.out.println(quote1.getId() + quote1.getText());

        Quote quote2 = new Quote(2, "What are ya gonna do, stab me?", "Man stabbed");
        System.out.println(quote2.getId() + quote2.getText());

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        for (int i = 0; i < quotes.size(); i++) {
            System.out.println("ID = " + quotes.get(i).getId());
            System.out.println("Text = " + quotes.get(i).getText());
            System.out.println("Author = " + quotes.get(i).getAuthorName());
        }
    }
}

//  Create Arraylist of Devices
//  int serialNum = 0;
//  Loop through devices
//  Assign Key value as ("S" + serialNum)
//  serialNum++;