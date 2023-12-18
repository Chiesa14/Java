package studing;

public class Book implements Comparable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

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

    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return book.title.equals(this.title) && book.author.equals(this.author);
    }

    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }


    @Override
    public int compareTo(Object o) {
        Book book = (Book) o;
        int byTitle = book.title.compareTo(this.title);
        if (byTitle != 0) return byTitle;
        return book.author.compareTo(this.author);
    }
}
