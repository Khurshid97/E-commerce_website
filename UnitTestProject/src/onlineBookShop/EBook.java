package onlineBookShop;
public class EBook extends Item {
    private int pageCount;

    public EBook(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}