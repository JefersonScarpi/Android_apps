package com.example.atm.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atm.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;


public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "A ATM Consultoria tem como missao apoiar " +
                "organizações que desejam alcançar o sucesso atraves da " +
                "excelência em gestão e da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle( "Versão 1.0" );

        return new AboutPage( getContext() )
                .setImage( R.drawable.logo )
                .setDescription( descricao )

                .addGroup("Entre em contato")
                .addEmail( "jefersonscarpi@gmail.com", "Envie um e-mail" )
                .addWebsite("https://www.google.com/","Acesse nosso site")

                .addGroup("Redes Sociais")
                .addFacebook("jefersonscarpi","Facebook")
                .addInstagram("jefersonscarpi","Instagram")
                .addTwitter("jefersonscarpi","Twitter")
                .addYoutube("jefersonscarpi","YouTube")
                .addGitHub("jefersonscarpi","GitHub")
                .addPlayStore("com.facebook.lite","PlayStore")

                .addItem( versao )
                .create();



        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}