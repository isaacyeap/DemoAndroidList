package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView AndroidList;
    ArrayList<AndroidVersion> AndroidSimpleList;
    ArrayAdapter<AndroidVersion> aaAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidList = findViewById(R.id.listSimpleAndroid);
        AndroidSimpleList = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie","9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo","8.0-8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat","7.0-7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow","6.0-6.0.1");
        AndroidVersion item5 = new AndroidVersion("Lollipop","5.0-5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat","4.4-4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean","4.1-4.3.1");

        AndroidSimpleList.add(item1);
        AndroidSimpleList.add(item2);
        AndroidSimpleList.add(item3);
        AndroidSimpleList.add(item4);
        AndroidSimpleList.add(item5);
        AndroidSimpleList.add(item6);
        AndroidSimpleList.add(item7);

        aaAndroid = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, AndroidSimpleList);
        AndroidList.setAdapter(aaAndroid);
    }
}