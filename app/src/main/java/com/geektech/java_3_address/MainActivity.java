package com.geektech.java_3_address;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AddressAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recycler);
        ArrayList<String > address = new ArrayList<>();
        address.add("чуй 122");
        address.add("киевская 51");
        address.add("тотогулова 24 ");
        address.add("московская 11");
        address.add("калык акиева 211");
        address.add("ТРЦ Весна");
        address.add("советская/шопокова");
        address.add("турусбекова 101");
        address.add("умуталиева 10");
        address.add("ибраимова 55");
        address.add("Ауезова/Горький");
        address.add("ахунбаева/малдыбаева ");

        adapter = new AddressAdapter(address);
        recyclerView.setAdapter(adapter);

    }
}