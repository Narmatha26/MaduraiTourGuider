package android.example.maduraitourguider;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Ahaaram Multicuisine Restaurant", "Palanganatham", R.drawable.ahaaram));
        places.add(new Place("Fortune Pandian Hotel", "Race Course Colony", R.drawable.pandian));
        places.add(new Place("Hotel Royal Court", "West Veli Street", R.drawable.royal));
        places.add(new Place("Courtyard by Marriott", "Race Course Colony", R.drawable.marriott));
        places.add(new Place("Heritage Hotel", "Kochadai", R.drawable.heritage));
        places.add(new Place("Hotel Temple City", "Vadipatti Main Road", R.drawable.templecity));
        places.add(new Place("Barbeque Bistrro", "Milan'em Mall 3rd floor", R.drawable.bistrro));
        places.add(new Place("Barbeque Nation", "Milan'em Mall", R.drawable.nation));
        places.add(new Place("Murugan Idli Shop", "West Masi Road", R.drawable.muruganidli));
        places.add(new Place("Konar Mess", "Simmakkal", R.drawable.konar));
        places.add(new Place("Kumar Mess", "Town Hall Road", R.drawable.kumar));
        places.add(new Place("Thalapakatti", "Bypass road,Kalavasal", R.drawable.thalapakatti));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
