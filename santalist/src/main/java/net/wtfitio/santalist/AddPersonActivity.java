package net.wtfitio.santalist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by plamend on 1/5/14.
 */
public class AddPersonActivity extends Activity {

    EditText PersonName;
    EditText PresentName;
    EditText PresentPrice;
    EditText PresentDes;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_pr_layout);
        Button submit = (Button)findViewById(R.id.submit);
        this.PersonName = (EditText)findViewById(R.id.personName);
        this.PresentName = (EditText)findViewById(R.id.presentName);
        this.PresentPrice = (EditText)findViewById(R.id.presentPrice);
        this.PresentDes = (EditText)findViewById(R.id.presentDes);
        this.context = this;





        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strPersonName = PersonName.getText().toString();
                String strPresentName = PresentName.getText().toString();
                String strPresentPrice = PresentPrice.getText().toString();
                String strPresentDes = PresentDes.getText().toString();

                if(!strPersonName.equals("")&&!strPresentName.equals("")&&
                        !strPresentPrice.equals("")&&!strPresentDes.equals("")){
                    Person person = new Person();
                    Present present = new Present();

                    person.setName(strPersonName);
                    person.setStatus("not/bye");
                    present.setName(strPresentName);
                    present.setPrice(Integer.valueOf(strPresentPrice));
                    present.setDescript(strPresentDes);

                   Intent moveback = createMoveBack(person,present);

                    startActivity(moveback);

                }
                else{
                    Toast.makeText(context,"Fill all info",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private Intent createMoveBack(Person person, Present present) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("person",person);
        intent.putExtra("present",present);
        return intent;
    }
}
