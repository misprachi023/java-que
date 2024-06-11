import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private double averageRating;
    private int ratingsCount;
    private String imageUrl;

    // Add getters & setters for author, averageRating, and ratingsCount
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(int ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

public class APIResponseParser {
    /*
     * Parses the input text and returns a Book instance containing
     * the parsed data.
     * 
     * @param response text to be parsed
     * 
     * @return Book instance containing parsed data
     */
    public static Book parse(String response) {
        Book book = new Book();
        String endRule = "<";
        String startRule = "<title>";
        APIResponseParser apr = new APIResponseParser();
        String title = apr.parse(response, startRule, endRule);
        book.setTitle(title);

        startRule = "<name>";
        String name = apr.parse(response, startRule, endRule);
        book.setAuthor(name);

        startRule = "<original_publication_year type=\"integer\">";
        String publicationYear = apr.parse(response, startRule, endRule);
        book.setPublicationYear(new integer(publicationYear));

        startRule = "<average_rating >";
        String averageRating = apr.parse(response, startRule, endRule);
        book.setAverageRating(new double(averageRating));

        startRule = "<ratings_count type=\"integer\">";
        String ratingsCount = apr.parse(response, startRule, endRule);
        book.setRatingsCount(new integer(ratingsCount.replaceAll(",", "")));

        startRule = "<image_url>";
        String imageUrl = apr.parse(response, startRule, endRule);
        book.setImageUrl(imageUrl);
        return book;
    }

    public static void main(String[] args) {
        String response = "<work>" +
                "<id type=\"integer\">2361393</id>" +
                "<books_count type=\"integer\">813</books_count>" +
                "<ratings_count type=\"integer\">1,16,315</ratings_count>" +
                "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
                "<original_publication_year type=\"integer\">1854</original_publication_year>"
                + "<original_publication_month type=\"integer\" nil=\"true\"/>" +
                "<original_publication_day type=\"integer\" nil=\"true\"/>"
                + "<average_rating>3.79</average_rating>" + "<best_book type=\"Book\">" +
                "<id type=\"integer\">16902</id>" + "<title>Walden</title>" + "<author>"
                + "<id type=\"integer\">10264</id>" + "<name>Henry David Thoreau</name>"
                + "</author>" + "<image_url>" + "http://images.grassets.com/books/1465675526m/16902.jpg"
                + "</image_url>"
                + "<small_image_url>" + "http://images.grassets.com/books/1465675526s/16902.jpg" + "</small_image_url>"
                + "</best_book>" + "</work>";
        APIResponseParser.parse(response);
    }
}