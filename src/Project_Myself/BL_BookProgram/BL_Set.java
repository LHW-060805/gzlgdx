package Project_Myself.BL_BookProgram;

public class BL_Set {
    private String name;
    private String book;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBook() {
        return book;
    }
    public void setBook(String book) {
        this.book = book;
    }
    public BL_Set(){

    }
    public BL_Set(String name,String book){
        this.name=name;
        this.book=book;
    }
    @Override
    public String toString() {
        return "BL_Set{" +
                "name='" + name + '\'' +
                ", book='" + book + '\'' +
                '}';
    }
}
