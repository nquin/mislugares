package com.example.digitalhouse.mislugaresba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by digitalhouse on 21/09/16.
 */
public class AdapterDeLugares extends BaseAdapter{

    private Context unContexto;
    private List<Lugar> listaDeLugaresBA;

    public AdapterDeLugares(Context unContexto, List<Lugar> listaDeLugaresBA) {
        this.unContexto = unContexto;
        this.listaDeLugaresBA = listaDeLugaresBA;
    }

    @Override
    public int getCount() {
        return listaDeLugaresBA.size();
    }

    @Override
    public Lugar getItem(int i) {
        return listaDeLugaresBA.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Lugar unLugar = getItem(i);

        String elNombre = unLugar.getNombre();
        String laDire = unLugar.getDireccion();
        String suLink = unLugar.getLink();

        LayoutInflater inflater = (LayoutInflater) unContexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.forma_celda_de_los_lugares,viewGroup,false);

        TextView unTextViewNombre = (TextView) view.findViewById(R.id.textViewNombre);
        TextView unTextViewDireccion = (TextView) view.findViewById(R.id.textViewDireccion);
        TextView unTextViewLink = (TextView) view.findViewById(R.id.textViewLink);

        unTextViewDireccion.setText(laDire);
        unTextViewNombre.setText(elNombre);
        unTextViewLink.setText("("+suLink+")");


        return view;
    }
}


