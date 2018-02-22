package com.example.yan1435.news9.model;

/**
 * Created by yan1435 on 20/02/18.
 */

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ebooks {

    @SerializedName("ebooks")
    @Expose
    private List<Ebook> ebooks = null;
    @SerializedName("total")
    @Expose
    private String total;

    public List<Ebook> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Ebook> ebooks) {
        this.ebooks = ebooks;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
