package android.example.maduraitourguider;


import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Meenakshi Amman Temple", "Center of city", R.drawable.meenakshi));
        places.add(new Place("Thirumalai Nayakar Mahal", "Vilakuthoon", R.drawable.thirumalai));
        places.add(new Place("Vishal de Mall", "Chinna Chokkikulam", R.drawable.vishalde));
        places.add(new Place("Milan'em Mall", "K.K.Nagar", R.drawable.milan));
        places.add(new Place("Athisayam Theme Park", "Paravai", R.drawable.athisayam));
        places.add(new Place("Rajaji Park", "Alwarpuram", R.drawable.park));
        places.add(new Place("Gandhi Memorial Museum", "Opp. to Collector Office", R.drawable.museum));
        places.add(new Place("Alagar Kovil", "Alagar Kovil Main Road", R.drawable.azhagar));
        places.add(new Place("Vaigai Dam", "Melmangalam", R.drawable.vaigai));
        places.add(new Place("St.Mary's Cathedral", "East Veli Street", R.drawable.church));
        places.add(new Place("Kazimar Big Mosque", "Periyar", R.drawable.mosque));
        places.add(new Place("Thiruparankundram Murugan Temple", "Thiruparankundram", R.drawable.murugantemple));
        places.add(new Place("Meghamalai Hills", "Kadamalaikuntu", R.drawable.megamalai));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_attractions);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
