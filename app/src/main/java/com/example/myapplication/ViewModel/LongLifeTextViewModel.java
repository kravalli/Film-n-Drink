package com.example.myapplication.ViewModel;

import androidx.lifecycle.ViewModel;

public class LongLifeTextViewModel extends ViewModel {
    private String llText;
    private String llHeader;

    public String getLlText(){
        return llText;
    }
    public String getLlHeader(){return llHeader;}

    public void setLlText(String llText) {
        this.llText = llText;
    }

    public void setLlHeader(String llHeader) {
        this.llHeader = llHeader;
    }
}
