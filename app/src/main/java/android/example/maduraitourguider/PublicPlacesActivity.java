package android.example.maduraitourguider;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PublicPlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Madurai Airport", "Avaniyapuram", R.drawable.airport));
        places.add(new Place("Madurai Junction Railway Station", "Southern Railway Colony", R.drawable.railway));
        places.add(new Place("SIPCOT Madurai", "Kappalur", R.drawable.sipcot));
        places.add(new Place("Aavin Milk Industry", "Sathamangalam", R.drawable.aavin));
        places.add(new Place("Indian Technical Institute Madurai", "K.Pudur", R.drawable.iti));
        places.add(new Place("Madurai Collector Office", "Alwarpuram", R.drawable.office));
        places.add(new Place("Madurai Medical College", "Alwarpuram", R.drawable.mmc));
        places.add(new Place("Government Rajaji Hospital", "Alwarpuram", R.drawable.hospital));
        places.add(new Place("Flower Market", "Mattuthavani", R.drawable.market));
        places.add(new Place("Yanaimalai", "Narasingam", R.drawable.yanai));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_publicPlaces);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
