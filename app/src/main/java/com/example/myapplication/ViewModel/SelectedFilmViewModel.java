package com.example.myapplication.ViewModel;

import androidx.lifecycle.ViewModel;

public class SelectedFilmViewModel extends ViewModel {

    // 0=default, other according to the order of the films
    private int selectedFilm = 0;
    // 0=default, 1=easy, 2=medium, 3=hard
    private int difficulty = 0;

    public int getSelectedFilm(){
        return selectedFilm;
    }
    public int getDifficulty() {
        return difficulty;
    }

    public void setSelectedFilm(int newSelectedFilm) {
        selectedFilm = newSelectedFilm;
    }
    public void setDifficulty(int newDifficulty) {
        difficulty = newDifficulty;
    }
}
