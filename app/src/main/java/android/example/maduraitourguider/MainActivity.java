package android.example.maduraitourguider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to find attractions category
        TextView attractions = (TextView) findViewById(R.id.attractions);

        //on clicking the attractions category it should open the list of attractions in the city
        attractions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        //to find restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        //on clicking the restaurants category it should open the list of restaurants in the city
        restaurants.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        //to find public places category
        TextView publicPlaces = (TextView) findViewById(R.id.publicPlaces);

        //on clicking the public places category it should open the list of public places in the city
        publicPlaces.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent publicPlacesIntent = new Intent(MainActivity.this, PublicPlacesActivity.class);
                startActivity(publicPlacesIntent);
            }
        });

        //to find events category
        TextView events = (TextView) findViewById(R.id.events);

        //on clicking the events category it should open the list of events happening in the city
        events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

    }
}
