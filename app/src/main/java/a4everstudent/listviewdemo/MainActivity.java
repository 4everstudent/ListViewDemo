package a4everstudent.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView todoView = (ListView) findViewById(R.id.toDoListView);

        final ArrayList<String> toDo= new ArrayList<String>();
        toDo.add("feed pets");
        toDo.add("complete lecture 64");
        toDo.add("finnish section 5");

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toDo);

        todoView.setAdapter(arrayAdapter);

        todoView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("item tapped", toDo.get(position) );
            }
        });

    }
}
