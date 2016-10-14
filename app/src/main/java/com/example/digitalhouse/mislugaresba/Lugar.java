package com.example.digitalhouse.mislugaresba;

import android.view.View;
import android.widget.EditText;

import java.net.URL;

/**
 * Created by digitalhouse on 21/09/16.
 */
public class Lugar {
    private String nombre;
    private String direccion;
    private String link;

    public Lugar(String nombre, String direccion, String link) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLink() {
        return link;
    }

    @Override
    public boolean equals(Object obj){
        Lugar otroLugar = (Lugar)obj;

        if(this.nombre.equalsIgnoreCase(otroLugar.getNombre())&&
                this.direccion.equalsIgnoreCase(otroLugar.getDireccion())&&
                this.link.equalsIgnoreCase(otroLugar.getLink())
                ){
            return true;} else
        {return false;}
    }






    }



