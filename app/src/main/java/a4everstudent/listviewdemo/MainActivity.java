package a4everstudent.listviewdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView toDoView = (ListView) findViewById(R.id.toDOListView);

        final ArrayList<String>toDoList = new ArrayList<String>();
        toDoList.add("feed pets");
        toDoList.add("exercise");
        toDoList.add("finnish book");
        toDoList.add("call family");
        toDoList.add("dinner @20h");

        ArrayAdapter<String> todoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, toDoList);
        toDoView.setAdapter(todoAdapter);

        toDoView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context context = getApplicationContext();
                CharSequence text = toDoList.get(position);
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }
}
