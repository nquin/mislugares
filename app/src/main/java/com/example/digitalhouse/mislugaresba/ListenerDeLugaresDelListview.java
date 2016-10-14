package com.example.digitalhouse.mislugaresba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by Nicoq on 23/9/2016.
 */
public class ListenerDeLugaresDelListview implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Lugar elLugarClickeado = (Lugar) parent.getItemAtPosition(position);

        String elNombre = elLugarClickeado.getNombre();
        String laDire = elLugarClickeado.getDireccion();
        String elLink = elLugarClickeado.getLink();

        Intent unIntent = new Intent(parent.getContext(), PantallaEspecificaDelLugar.class);
        Bundle unBundle = new Bundle();


        unBundle.putString(PantallaEspecificaDelLugar.NOMBRE_LUGAR, elNombre);
        unBundle.putString(PantallaEspecificaDelLugar.DIRECCION_LUGAR, laDire);
        unBundle.putString(PantallaEspecificaDelLugar.LINK_LUGAR, elLink);

        unIntent.putExtras(unBundle);

        parent.getContext().startActivity(unIntent);


    }
}
