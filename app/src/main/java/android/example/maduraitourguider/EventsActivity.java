package android.example.maduraitourguider;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Chithirai Thiruvizha", "Goripalayam", R.drawable.thiruvizha));
        places.add(new Place("Puttu Thiruvizha", "Arapalayam Cross Road", R.drawable.puttu));
        places.add(new Place("Jallikattu", "Alanganallur", R.drawable.jallikattu));
        places.add(new Place("Theppa Thiruvizha", "Theppakulam", R.drawable.theppam));
        places.add(new Place("Karthigai Dheepam", "Thiruparankundram", R.drawable.dheepam));
        places.add(new Place("Chithirai Exhibition", "Tamukkam", R.drawable.exhibition));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

}