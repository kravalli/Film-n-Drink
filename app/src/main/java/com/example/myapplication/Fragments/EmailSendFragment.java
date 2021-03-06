package com.example.myapplication.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;

import java.util.Objects;

public class EmailSendFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        requireActivity().setTitle(getString(R.string.EmailSendFragmentHeader));


        return inflater.inflate(R.layout.fragment_emailsend, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText subject = Objects.requireNonNull(getView()).findViewById(R.id.subject);
        EditText message = getView().findViewById(R.id.email);

        Button send = getView().findViewById(R.id.btn_emailSend);
        send.setOnClickListener(view1 -> {
            String toS = getString(R.string.myEmail);
            String subjectS = subject.getText().toString();
            String messageS = message.getText().toString();

            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{toS});
            email.putExtra(Intent.EXTRA_SUBJECT, subjectS);
            email.putExtra(Intent.EXTRA_TEXT, messageS);

            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, getString(R.string.ChooseEmailApp)));
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}