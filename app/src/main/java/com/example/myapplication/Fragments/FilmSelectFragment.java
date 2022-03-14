package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        //Feedback Button
        view.findViewById(R.id.btn_feedback).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sending an email screen
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_emailSendFragment);

            }
        });

        /**
         *  alle 18 "Filme"
         */
        view.findViewById(R.id.film1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(1);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(2);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(3);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(4);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(5);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(6);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(7);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(8);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(9);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(10);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(11);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(12);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(13);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(14);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(15);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(16);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(17);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });
        view.findViewById(R.id.film18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vM.setSelectedFilm(18);
                Navigation.findNavController(requireView()).navigate(R.id.action_filmSelectFragment_to_difficultyFragment);
            }
        });

    }
}