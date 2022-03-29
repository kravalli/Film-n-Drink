package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.ViewModel.SelectedFilmViewModel;


public class FilmSelectFragment extends Fragment {
    private SelectedFilmViewModel vM;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle(R.string.FilmSelectFragmentHeader);
        return inflater.inflate(R.layout.fragment_filmselect,container,false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vM = new ViewModelProvider(requireActivity()).get(SelectedFilmViewModel.class);
        vM.setSelectedFilm(0);
        vM.setDifficulty(0);

        /*
        Initialize all movies here and add them to the array
        */
        TextView f1 = view.findViewById(R.id.film1);
        TextView f2 = view.findViewById(R.id.film2);
        TextView f3 = view.findViewById(R.id.film3);
        TextView f4 = view.findViewById(R.id.film4);
        TextView f5 = view.findViewById(R.id.film5);
        TextView f6 = view.findViewById(R.id.film6);
        TextView f7 = view.findViewById(R.id.film7);
        TextView f8 = view.findViewById(R.id.film8);
        TextView f9 = view.findViewById(R.id.film9);
        TextView f10 = view.findViewById(R.id.film10);
        TextView f11 = view.findViewById(R.id.film11);
        TextView f12 = view.findViewById(R.id.film12);
        TextView f13 = view.findViewById(R.id.film13);
        TextView f14 = view.findViewById(R.id.film14);
        TextView f15 = view.findViewById(R.id.film15);
        TextView f16 = view.findViewById(R.id.film16);
        TextView f17 = view.findViewById(R.id.film17);
        TextView f18 = view.findViewById(R.id.film18);
        TextView[] allMovies = new TextView[]{f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18};

        //Timer for missingMovie
        new CountDownTimer(2000, 10){
            public void onTick(long millisUntilFinished){ //milliesUntilFinished = current timestamp
                //while timer is running
            }

            public void onFinish() {
                ImageView imv = view.findViewById(R.id.imageView);
                TextView mM = view.findViewById(R.id.missingmovie);
                imv.animate().setDuration(1500);
                imv.animate().alpha(1);
                mM.animate().setDuration(1500);
                mM.animate().alpha(1);
            }
        }.start();

        //Feedback Button
        view.findViewById(R.id.btn_feedback).setOnClickListener(view119 -> {
            //Sending an email screen
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_emailSendFragment);

        });

        //all 18 movies
        for(int i = 0; i< allMovies.length; i++){
            int temp = i+1;

            allMovies[i].setOnClickListener(view1 -> {
                vM.setSelectedFilm(temp);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            });
        }


        //Get SearchView Text
        SearchView sv = view.findViewById(R.id.searchView);
        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //necessary in case of typo
                for (TextView textView : allMovies) {
                    textView.setVisibility(View.VISIBLE);
                }

                //Remove all movies that don't match input
                for (TextView textView : allMovies) {
                    if (!textView.getText().toString().toLowerCase().contains(newText.toLowerCase())) {
                        textView.setVisibility(View.GONE);
                    }
                }
                for (TextView textView : allMovies) {
                    if (newText.equals("")) {
                        textView.setVisibility(View.VISIBLE);
                    }
                }
                return false;
            }
        });

    }
}