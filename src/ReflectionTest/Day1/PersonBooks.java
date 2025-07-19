package ReflectionTest.Day1;

public class PersonBooks {
    private String book;
    private String top;
    private String bottom;
    public String relationship;
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public PersonBooks(){

    }
    private PersonBooks(String book,String top,String bottom,String relationship){
        this.book=book;
        this.bottom=bottom;
        this.top=top;
        this.relationship=relationship;
    }
    public void show(){
        System.out.println("public");
    }
    private String showBook(String book,String top,String bottom){
        return book+":"+top+"-"+bottom;
    }

    @Override
    public String toString() {
        return "PersonBooks{" +
                "book='" + book + '\'' +
                ", top='" + top + '\'' +
                ", bottom='" + bottom + '\'' +
                ", relationship='" + relationship + '\'' +
                '}';
    }
}
