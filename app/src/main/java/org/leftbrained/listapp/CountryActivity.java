package org.leftbrained.listapp;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {
    ArrayList<Country> states = new ArrayList<>();
    ListView countriesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        setInitialData();
        countriesList = (ListView) findViewById(R.id.countriesList);
        CountryAdapter stateAdapter = new CountryAdapter(this, R.layout.country_view, states);
        countriesList.setAdapter(stateAdapter);
        AdapterView.OnItemClickListener _ = (parent, v, position, id) -> {
            Country selectedState = (Country) parent.getItemAtPosition(position);
            Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedState.getName(),
                    Toast.LENGTH_SHORT).show();
        };
    }

    private void setInitialData() {
        states.add(new Country("Россия", "Москва", R.drawable.ru));
        states.add(new Country("CA", "Вашингтон", R.drawable.us));
        states.add(new Country("Австралия", "Канберра", R.drawable.au));
        states.add(new Country("Япония", "Токио", R.drawable.jp));
        states.add(new Country("Вьетнам", "Ханой", R.drawable.vn));
    }
}