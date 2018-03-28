package librarycatalogue;

public class Book {

    // Properties, Fields, Global Variables
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    // Constructor
    public Book(String bookTitle, int bookPageCount, int bookISBN) {
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN = bookISBN;
        this.isCheckedOut = false;
    }

    // Getters ---> Instance Methods
    public String getTitle(){
        return this.title;
    }

    public int getPageCount(){
        return this.pageCount;
    }

    public int getISBN(){
        return this.ISBN;
    }

    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }

    public int getDayCheckedOut(){
        return this.dayCheckedOut;

    }

    // Setters
    public void setIsCheckedOut(boolean newIsCheckout, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckout;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
