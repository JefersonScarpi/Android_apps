package com.example.aprendaingles.Fragments;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.aprendaingles.R;

public class BichosFragment extends Fragment implements View.OnClickListener{

    private ImageButton buttonCao, buttonGato, buttonMacaco,
                        buttonVaca, buttonLeao, buttonOvelha;

    private MediaPlayer mediaPlayer;



    public BichosFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_bichos, container, false);

        buttonCao = view.findViewById(R.id.buttonCao);
        buttonGato = view.findViewById(R.id.buttonGato);
        buttonMacaco = view.findViewById(R.id.buttonMacaco);
        buttonVaca = view.findViewById(R.id.buttonVaca);
        buttonLeao = view.findViewById(R.id.buttonLeao);
        buttonOvelha = view.findViewById(R.id.buttonOvelha);

        //Aplicar eventos de click
        buttonCao.setOnClickListener(this);
        buttonGato.setOnClickListener(this);
        buttonMacaco.setOnClickListener(this);
        buttonVaca.setOnClickListener(this);
        buttonLeao.setOnClickListener(this);
        buttonOvelha.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonCao :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.dog);
                tocarSom();
                break;
            case R.id.buttonGato :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cat);
                tocarSom();
                break;
            case R.id.buttonMacaco :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.buttonVaca :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.cow);
                tocarSom();
                break;
            case R.id.buttonLeao :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.lion);
                tocarSom();
                break;
            case R.id.buttonOvelha :
                mediaPlayer = MediaPlayer.create(getContext(), R.raw.sheep);
                tocarSom();
                break;

        }

    }

    public void tocarSom(){
        if ( mediaPlayer != null ) {
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });

        }
    }
}