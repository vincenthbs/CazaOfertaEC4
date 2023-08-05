package com.example.cazaofertaec4.ui.promos;

import androidx.lifecycle.ViewModel;

public class PromosViewModel extends ViewModel {

    private String productName;
    private String productPrice;
    private String productCategory;
    private String productLocation;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }

}
