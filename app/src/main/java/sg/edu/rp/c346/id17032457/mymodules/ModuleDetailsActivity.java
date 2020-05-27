package sg.edu.rp.c346.id17032457.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView tvMCode;
    TextView tvModname;
    TextView tvAcYr;
    TextView tvSem;
    TextView tvMCT;
    TextView tvVenue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvMCode = findViewById(R.id.textView3);
        tvModname = findViewById(R.id.textView4);
        tvAcYr = findViewById(R.id.textView5);
        tvSem = findViewById(R.id.textView6);
        tvMCT = findViewById(R.id.textView7);
        tvVenue = findViewById(R.id.textView8);

        Intent intentReceived = getIntent();
        char value = intentReceived.getCharExtra("value", 'X');
        int values = intentReceived.getIntExtra("values", 0);
        tvMCode.setText("Module Code: " + value +values);



        String moduleSelected=intentReceived.getStringExtra("Module Name");
        tvModname.setText("Module Name: "+moduleSelected);

        int year = intentReceived.getIntExtra("Year", 0);
        tvAcYr.setText("Year: " +year);

        int semester = intentReceived.getIntExtra("Semester", 0);
        tvSem.setText("Semester: " +semester);

        int credit = intentReceived.getIntExtra("Credit", 0);
        tvMCT.setText("Module Credit: " +credit);

        char venue = intentReceived.getCharExtra("Venue", 'X');
        int venues = intentReceived.getIntExtra("Venues", 0);
        char venues3 = intentReceived.getCharExtra("Venues3", 'X');
        tvVenue.setText("Venue: " + venue +venues+venues3);












    }
}
