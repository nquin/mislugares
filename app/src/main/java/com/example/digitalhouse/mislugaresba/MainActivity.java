package com.example.digitalhouse.mislugaresba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Lugar> listaDeLugaresBA;
    AdapterDeLugares unAdapterDeLugares;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeLugaresBA = new ArrayList<>();
        listaDeLugaresBA.add(new Lugar("Cine Gaumont", "Rivadavia 1840", "linkGaumont"));
        listaDeLugaresBA.add(new Lugar("CC Konex", "Sarmiento 3131", "linkKonex"));
        listaDeLugaresBA.add(new Lugar("Le Troquet de Henry", "Guardia Vieja 3640", "15 5555 000"));

        ListView unListView = (ListView) findViewById(R.id.elListViewDeLaApp);
        unAdapterDeLugares = new AdapterDeLugares(this, listaDeLugaresBA);
        unListView.setAdapter(unAdapterDeLugares);

        ListenerDeLugaresDelListview unListenerDeLugaresDelListview = new ListenerDeLugaresDelListview();
        unListView.setOnItemClickListener(unListenerDeLugaresDelListview);

    }


    public void agregarLugar(View view) {
        EditText editTextNombre = (EditText)findViewById (R.id.editTextDeNombre);
        EditText editTextDire = (EditText)findViewById(R.id.editTextDeDireccion);
        EditText editTextLink = (EditText)findViewById(R.id.editTextDeLink);

        String nombreLugar = editTextNombre.getText().toString();
        String direLugar = editTextDire.getText().toString();
        String linkLugar = editTextLink.getText().toString();

        if(nombreLugar.length() == 0 && direLugar.length() == 0 && linkLugar.length() == 0){
            Toast.makeText(this,"Completar todo porfavor", Toast.LENGTH_LONG).show();
            return;
        }

        Lugar nuevoLugar = new Lugar(nombreLugar, direLugar, linkLugar);

        if(!listaDeLugaresBA.contains(nuevoLugar)){
            listaDeLugaresBA.add(nuevoLugar);
            unAdapterDeLugares.notifyDataSetChanged();
            Toast.makeText(this, "Se agrego tu nuevo lugar", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Ya esta registrado el lugar", Toast.LENGTH_SHORT).show();
        }

    }
}
