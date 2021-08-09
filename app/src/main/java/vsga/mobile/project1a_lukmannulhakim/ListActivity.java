package vsga.mobile.project1a_lukmannulhakim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    ListView list_makanan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list_makanan = (ListView) findViewById(R.id.list_makanan);

        String[] makanan = new String[]{
                "Lotek", "Seblak", "Gehu", "Kupat Tahu", "Cimol", "Cilung", "Cireng", "Bala-Bala"
        };

        ArrayAdapter<String> adapterList = new ArrayAdapter<String>(ListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, makanan);

        list_makanan.setAdapter(adapterList);
    }
}