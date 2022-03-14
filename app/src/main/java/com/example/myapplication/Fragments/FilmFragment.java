package com.example.myapplication.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.ViewModel.LongLifeTextViewModel;


public class FilmFragment extends Fragment {
    private LongLifeTextViewModel ll;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle("");
        return inflater.inflate(R.layout.fragment_film, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ll = new ViewModelProvider(requireActivity()).get(LongLifeTextViewModel.class);
        requireActivity().setTitle(ll.getLlHeader());
        TextView tV = view.findViewById(R.id.textView2);
        tV.setText(ll.getLlText());

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}