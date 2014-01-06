package net.wtfitio.santalist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by plamend on 1/5/14.
 */
public class MainActivity extends Activity {
    Button add;
    ListView personsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        this.add = (Button)findViewById(R.id.add_button);
        this.personsList = (ListView)findViewById(R.id.Person_list);
        List <Person> people;
        List <Present> presents;
        people = new ArrayList<Person>();
        presents = new ArrayList<Present>();
        Person person = new Person();
        Present present = new Present();

        person = (Person)getIntent().getSerializableExtra("person");
        present = (Present)getIntent().getSerializableExtra("present");

        people.add(person);
        presents.add(present);


        if (!people.isEmpty()&&!presents.isEmpty()){
        //PersonAdapter person_adapter = new PersonAdapter(this,R.layout.person_list_layout,people);
        //this.personsList.setAdapter(person_adapter);
        }
        Log.v("test","testttttt");

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = goTopersonCreate();
                startActivity(intent);
            }
        });
    }

    private Intent goTopersonCreate() {
        Intent intent = new Intent(this,AddPersonActivity.class);
        return intent;
    }
}
