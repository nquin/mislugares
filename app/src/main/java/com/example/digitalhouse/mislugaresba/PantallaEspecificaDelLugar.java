package com.example.digitalhouse.mislugaresba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PantallaEspecificaDelLugar extends AppCompatActivity {

    public static final String NOMBRE_LUGAR = "unNombre";
    public static final String DIRECCION_LUGAR = "unaDire";
    public static final String LINK_LUGAR= "unLink";

    TextView nombreTextView;
    TextView direTextView;
    TextView linkTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_especifica_del_lugar);

        nombreTextView = (TextView)findViewById(R.id.textViewNombre);
        direTextView = (TextView)findViewById(R.id.textviewDire);
        linkTextView = (TextView)findViewById(R.id.textviewLink);

        Intent unIntent = getIntent();

        Bundle unBundle = unIntent.getExtras();

        String unNombre = unBundle.getString(NOMBRE_LUGAR);
        nombreTextView.setText(unNombre);

        String laDire = unBundle.getString(DIRECCION_LUGAR);
        direTextView.setText(laDire);

        String elLink = unBundle.getString(LINK_LUGAR);
        linkTextView.setText(elLink);



    }
}
