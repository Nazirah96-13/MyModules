package sg.edu.rp.c346.id17032457.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC346;
    TextView tvC349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC346 = findViewById(R.id.textViewC346);
        tvC349 = findViewById(R.id.textViewC349);

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an Intent
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);

                //Pass data: name:"Module Code"; value is 346
                intent.putExtra("value", 'C');
                intent.putExtra("values", 346);
                intent.putExtra("Module Name", "Android Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", 'W');
                intent.putExtra("Venues", 66);
                intent.putExtra("Venues3", 'M');

                //Launch the AnswerActivity
                startActivity(intent);


            }
        });

        tvC349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create an Intent
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);

                //Pass data: name:"Module Code"; value is 346
                intent.putExtra("value", 'C');
                intent.putExtra("values", 349);
                intent.putExtra("Module Name", "iPad Programming");
                intent.putExtra("Year", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("Credit", 4);
                intent.putExtra("Venue", 'W');
                intent.putExtra("Venues", 66);
                intent.putExtra("Venues3", 'M');

                //Launch the AnswerActivity
                startActivity(intent);


            }
        });













    }
}
