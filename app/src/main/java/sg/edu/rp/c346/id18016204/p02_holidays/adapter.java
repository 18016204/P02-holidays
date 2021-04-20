package sg.edu.rp.c346.id18016204.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<holiday> {

    private ArrayList<holiday> holiday;
    private Context context;
    private TextView tvYear;
    private TextView tvDate;
    private ImageView iv;

public adapter(Context context,int resource,ArrayList<holiday> objects){
    super(context, resource,objects);
holiday= objects;
        this.context = context;
}

public View getView(int position, View convertView, ViewGroup parent){
    // The usual way to get the LayoutInflater object to
    //  "inflate" the XML file into a View object
    LayoutInflater inflater = (LayoutInflater) context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    // "Inflate" the row.xml as the layout for the View object
    View rowView = inflater.inflate(R.layout.year, parent, false);
tvYear=(TextView)rowView.findViewById(R.id.tvYear);
    tvDate=(TextView)rowView.findViewById(R.id.tvDate);
iv= (ImageView)rowView.findViewById(R.id.iv);

holiday currentHoliday = holiday.get(position);
tvYear.setText(currentHoliday.getNewYear());
tvDate.setText(currentHoliday.date());

if(currentHoliday.getNewYear().equals("New Year's Day")){
    iv.setImageResource(R.drawable.newyear);
}else if(currentHoliday.getNewYear()=="Labour Day") {
    iv.setImageResource(R.drawable.labourday);
}
return rowView;
}
}
