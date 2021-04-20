package sg.edu.rp.c346.id18016204.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ListView lvHoliday;
ArrayAdapter aaa;
ArrayList<typeHoliday> typesOfHoliday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHoliday=(ListView)this.findViewById(R.id.lvHoliday);
typesOfHoliday= new ArrayList<>();
        typesOfHoliday.add(new typeHoliday("Secular"));
        typesOfHoliday.add(new typeHoliday("Ethnic & Religion"));

        aaa=new holidayAdapter(this, R.layout.holiday,typesOfHoliday);
        lvHoliday.setAdapter(aaa);

        lvHoliday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {







                Intent intent = new Intent(MainActivity.this,MainActivity2.class);




                startActivity(intent);
            }
        });






    }
}