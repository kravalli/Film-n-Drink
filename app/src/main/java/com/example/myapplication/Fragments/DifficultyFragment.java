package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.myapplication.R;
import com.example.myapplication.ViewModel.LongLifeTextViewModel;
import com.example.myapplication.ViewModel.SelectedFilmViewModel;

public class DifficultyFragment extends Fragment {
    private SelectedFilmViewModel vM;
    private LongLifeTextViewModel ll;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle(getString(R.string.DifficultyFragmentHeader));
        return inflater.inflate(R.layout.fragment_difficulty, container, false);

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vM = new ViewModelProvider(requireActivity()).get(SelectedFilmViewModel.class);
        ll = new ViewModelProvider(requireActivity()).get(LongLifeTextViewModel.class);
        vM.setDifficulty(0);

        view.findViewById(R.id.btn_easy).setOnClickListener(view1 -> {
            vM.setDifficulty(1);
            createFilm();
        });

        view.findViewById(R.id.btn_medium).setOnClickListener(view12 -> {
            vM.setDifficulty(2);
            createFilm();
        });

        view.findViewById(R.id.btn_hard).setOnClickListener(view13 -> {
            vM.setDifficulty(3);
            createFilm();
        });
    }

    public void createFilm(){
        switch (vM.getSelectedFilm()){

            case 1:
                ll.setLlHeader("Grand Tour Staffel 4/4");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text");
                        break;
                    case 3:
                        ll.setLlText("Jedes Mal, wenn ein Auto zu schaden kommt, musst du trinken!");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 2:
                ll.setLlHeader("Film2");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text2");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text2");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text2");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 3:
                ll.setLlHeader("Film3");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text3");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text3");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text3");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 4:
                ll.setLlHeader("Film4");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text4");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text4");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text4");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 5:
                ll.setLlHeader("Film5");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text5");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text5");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text5");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 6:
                ll.setLlHeader("Film6");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text6");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text6");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text6");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 7:
                ll.setLlHeader("Film7");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text7");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text7");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text7");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 8:
                ll.setLlHeader("Film8");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text8");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text8");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text8");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 9:
                ll.setLlHeader("Film9");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text9");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text9");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text9");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 10:
                ll.setLlHeader("Film10");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text10");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text10");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text10");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 11:
                ll.setLlHeader("Film11");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text11");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text11");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text11");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 12:
                ll.setLlHeader("Film12");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text12");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text12");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text12");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 13:
                ll.setLlHeader("Film13");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text13");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text13");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text13");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 14:
                ll.setLlHeader("Film14");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text14");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text14");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text14");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 15:
                ll.setLlHeader("Film15");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text15");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text15");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text15");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 16:
                ll.setLlHeader("Film16");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text16");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text16");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text16");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 17:
                ll.setLlHeader("Film17");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text17");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text17");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text17");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            case 18:
                ll.setLlHeader("Film18");
                switch (vM.getDifficulty()){
                    case 1:
                        ll.setLlText("Einfacher Text18");
                        break;
                    case 2:
                        ll.setLlText("Mittlerer Text18");
                        break;
                    case 3:
                        ll.setLlText("Schwerer Text18");
                        break;
                    default:
                        Toast.makeText(getContext(), "Bitte wähle eine Schwierigkeitsstufe", Toast. LENGTH_LONG).show();
                }
                break;
            default:
                Toast.makeText(getContext(), "Bitte wähle einen Film", Toast. LENGTH_LONG).show();
        }
        Navigation.findNavController(requireView()).navigate(R.id.action_difficultyFragment_to_filmFragment);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
