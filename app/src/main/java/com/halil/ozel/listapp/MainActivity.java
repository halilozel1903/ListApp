package com.halil.ozel.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView liste; // liste tanımı

    String[] aylar = {"January", // array tanımı - veri kaynağımız
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
    };

    // adapter nesnesi dizi veya veritabanı gibi bir kaynaktan verileri alır ve düzene yerleştirir.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste= findViewById(R.id.listView); // list view'e erişim sağlandı.

        // arrayAdapter nesnesi veri kaynağı ile bir düzen arasında ilişkilendirme yapar.
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,aylar);

        // listView üzerinden bu adapter nesnesini çağırmak için kullanılır.
        liste.setAdapter(adapter);
        liste.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        // listedeki herhangi bir satıra tıklanıldığında o satırın başlık bilgisini veriyor.
        Toast.makeText(this, aylar[position],Toast.LENGTH_LONG ).show();

    }
}
