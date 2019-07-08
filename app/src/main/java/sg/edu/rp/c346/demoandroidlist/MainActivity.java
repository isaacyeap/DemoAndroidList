package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView AndroidList;
    ArrayList<String> AndroidSimpleList;
    ArrayAdapter<String> aaAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidList = findViewById(R.id.listSimpleAndroid);

        AndroidSimpleList = new ArrayList<>();
        AndroidSimpleList.add("Pie - 9.0");
        AndroidSimpleList.add("Oreo - 8.0-8.1");
        AndroidSimpleList.add("Nougat - 7.0-7.1.2");
        AndroidSimpleList.add("Marshmallow - 6.0-6.0.1");
        AndroidSimpleList.add("Lollipop - 5.0-5.1.1");
        AndroidSimpleList.add("KitKat - 4.4-4.4.4");
        AndroidSimpleList.add("Jelly Bean - 4.1-4.3.1");

        aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AndroidSimpleList);
        AndroidList.setAdapter(aaAndroid);
    }
}