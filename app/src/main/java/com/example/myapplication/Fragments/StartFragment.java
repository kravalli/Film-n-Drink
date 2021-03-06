package com.example.myapplication.Fragments;

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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle(R.string.StartFragmentHeader);

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