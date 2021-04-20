package sg.edu.rp.c346.id18016204.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList<holiday>holidays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        lv=(ListView)this.findViewById(R.id.lvHoliday);
         holidays= new ArrayList<holiday>();

             holidays.add(new holiday("New Year's Day", "1 Jan 2017"));
             holidays.add(new holiday("Labour Day", "1 May 2017"));


         aa=new adapter(this,R.layout.year , holidays);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
holiday selectedHoliday = holidays.get(position);
                Toast.makeText(MainActivity2.this, selectedHoliday.getNewYear()+" Date: " +selectedHoliday.date(),Toast.LENGTH_LONG).show();

            }
        });
    }
}