package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        requireActivity().setTitle(R.string.second_fragment_label);
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
        view.findViewById(R.id.film1).setOnClickListener(view1 -> {
            vM.setSelectedFilm(1);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film2).setOnClickListener(view12 -> {
            vM.setSelectedFilm(2);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film3).setOnClickListener(view13 -> {
            vM.setSelectedFilm(3);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film4).setOnClickListener(view14 -> {
            vM.setSelectedFilm(4);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film5).setOnClickListener(view15 -> {
            vM.setSelectedFilm(5);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film6).setOnClickListener(view16 -> {
            vM.setSelectedFilm(6);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film7).setOnClickListener(view17 -> {
            vM.setSelectedFilm(7);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film8).setOnClickListener(view18 -> {
            vM.setSelectedFilm(8);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film9).setOnClickListener(view19 -> {
            vM.setSelectedFilm(9);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film10).setOnClickListener(view110 -> {
            vM.setSelectedFilm(10);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film11).setOnClickListener(view111 -> {
            vM.setSelectedFilm(11);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film12).setOnClickListener(view112 -> {
            vM.setSelectedFilm(12);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film13).setOnClickListener(view113 -> {
            vM.setSelectedFilm(13);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film14).setOnClickListener(view114 -> {
            vM.setSelectedFilm(14);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film15).setOnClickListener(view115 -> {
            vM.setSelectedFilm(15);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film16).setOnClickListener(view116 -> {
            vM.setSelectedFilm(16);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film17).setOnClickListener(view117 -> {
            vM.setSelectedFilm(17);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });
        view.findViewById(R.id.film18).setOnClickListener(view118 -> {
            vM.setSelectedFilm(18);
            Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
        });

    }
}