package com.example.myapplication.Fragments;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.R;

public class StartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle(R.string.first_fragment_label);

        //System Ui Dark Mode
        switch (getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK) {
            case Configuration.UI_MODE_NIGHT_YES:
                System.out.println("DARK");
                break;
            case Configuration.UI_MODE_NIGHT_NO:
                System.out.println("LIGHT");
                break;
        }
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_start).setOnClickListener(view1 ->
                NavHostFragment.findNavController(StartFragment.this).navigate(R.id.action_startFragment_to_filmSelectFragment)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}