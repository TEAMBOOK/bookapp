package model;

/**
 * Created by kyosh on 31/03/2018.
 */

public class Detail_library {
    private String id;
    private String idBook;
    private String idUSer;

    public Detail_library() {
    }

    public Detail_library(String id, String idBook, String idUSer) {
        this.id = id;
        this.idBook = idBook;
        this.idUSer = idUSer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdUSer() {
        return idUSer;
    }

    public void setIdUSer(String idUSer) {
        this.idUSer = idUSer;
    }
}
