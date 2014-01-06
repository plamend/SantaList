package net.wtfitio.santalist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by plamend on 1/5/14.
 */
public class PersonAdapter extends ArrayAdapter<Person>{
    public PersonAdapter(Context context, int resource, List<Person> objects) {
        super(context,resource,objects);
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            // get the adapter context
            Context context = getContext();
            // create an layout inflater
            LayoutInflater inflater = LayoutInflater.from(context);
            // use the inflater to create the view hierarchy
            convertView = inflater.inflate(R.layout.person_list_layout, parent,
                    false);
            // init the holder
            PersonViewHolder holder = initializeHolder(convertView);
            convertView.setTag(holder);
        }

        Person person = getItem(position);
        PersonViewHolder holder = (PersonViewHolder) convertView.getTag();
        String Name = person.getName();
        String stat = person.getStatus();

        holder.personeName.setText(Name);
        holder.personStatus.setText(stat);

        return  convertView;
    }

    private PersonViewHolder initializeHolder(View convertView) {
        PersonViewHolder holder = new PersonViewHolder();
            holder.personeName = (TextView) convertView.findViewById(R.id.person_Name);
            holder.personStatus = (TextView)convertView.findViewById(R.id.person_status);
        return holder;
    }


    private class PersonViewHolder {
        private TextView personeName;
        private  TextView personStatus;
    }
}
