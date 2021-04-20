package sg.edu.rp.c346.id18016204.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import sg.edu.rp.c346.id18016204.p02_holidays.typeHoliday;

public class holidayAdapter extends ArrayAdapter<typeHoliday> {
    private ArrayList<typeHoliday> type;
    private Context context;
    private TextView types;

    public holidayAdapter(Context context, int resource, ArrayList<typeHoliday> objects) {
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        type = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }
        @Override
        public View getView ( int position, View convertView, ViewGroup parent){
            // The usual way to get the LayoutInflater object to
            //  "inflate" the XML file into a View object
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // "Inflate" the row.xml as the layout for the View object
            View rowView = inflater.inflate(R.layout.holiday, parent, false);

            // Get the TextView object
            types = (TextView) rowView.findViewById(R.id.tvTypes);



            // The parameter "position" is the index of the
            //  row ListView is requesting.
            //  We get back the food at the same index.
            typeHoliday currentFood = type.get(position);
            // Set the TextView to show the food

            types.setText(currentFood.getTypesHoliday());
            // Set the image to star or nostar accordingly

            // Return the nicely done up View to the ListView
            return rowView;
        }

    }
