package com.example.atm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                enviarEmail();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal, R.id.nav_servico, R.id.nav_clientes,
                R.id.nav_contato, R.id.nav_sobre

        )
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void enviarEmail(){
        String celular = "tel: 11996352894";
        String imagem = "https://upload.wikimedia.org/wikipedia/commons/8/82/Praia_de_Jau%C3%A1.jpg";
        String endereco = "https://www.google.com/maps/place/Saint+John+Public+Gardens/@45.2853553,-66.0579109,18z/data=!4m8!1m2!2m1!1spark!3m4!1s0x0:0xd5517766d892aead!8m2!3d45.2854792!4d-66.0574312";
        //Intent intent = new Intent( Intent.ACTION_DIAL, Uri.parse( celular ) );
        //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( imagem ) );
        //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse( endereco ) );

        Intent intent = new Intent( Intent.ACTION_SEND);
        intent.putExtra( Intent.EXTRA_EMAIL, new String[]{"jefersonscarpi@gmail.com"} );
        intent.putExtra( Intent.EXTRA_SUBJECT, "Contato pelo App");
        intent.putExtra( Intent.EXTRA_TEXT, "Mensagem automática");

        //mime TYPE https://www.sitepoint.com/mime-types-complete-list/
        intent.setType( "message/rfc822" );
        //intent.setType( "text/plain" );
        //intent.setType( "image/*" );
        //intent.setType( "application/pdf" );

        startActivity( intent.createChooser( intent, "Compartilhar" ) );
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}