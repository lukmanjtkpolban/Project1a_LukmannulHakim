package vsga.mobile.project1a_lukmannulhakim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtInput1, txtInput2;
    Button btnTampilkan;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instance
        txtInput1 =(EditText) findViewById(R.id.txtInput1);
        txtInput2 =(EditText) findViewById(R.id.txtInput2);
        btnTampilkan =(Button) findViewById(R.id.btnTampilkan);
        txtHasil =(TextView) findViewById(R.id.txtHasil);

        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama_depan = txtInput1.getText().toString();
                String nama_belakang = txtInput2.getText().toString();
                String hasil = nama_depan + " " + nama_belakang;

                txtHasil.setText(hasil);
            }
        });

        Toast.makeText(getApplication(), "ini fase onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplication(), "ini fase onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplication(), "ini fase onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplication(), "ini fase onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplication(), "ini fase onRestart", Toast.LENGTH_SHORT).show();
    }
}