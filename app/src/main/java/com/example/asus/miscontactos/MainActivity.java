package com.example.asus.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacto>contactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactos=new ArrayList<Contacto>();

        contactos.add(new Contacto("Ruber Octavio","645334", "ruberoctavio@gmail.com"));
        contactos.add(new Contacto("Raul","6345334","raul@gmail.com"));
        contactos.add(new Contacto("Valeria","6235334","valeria@gmail.com"));
        contactos.add(new Contacto("Daniel","3645334", "daniel@gmail.com"));

        ArrayList<String>nombresContacto= new ArrayList<>();
        for (Contacto contacto: contactos){
            nombresContacto.add(contacto.getNombre());



        }

        ListView lstContactos=(ListView)findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nombresContacto));
    }
}
