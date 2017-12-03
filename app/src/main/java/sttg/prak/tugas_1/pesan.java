package sttg.prak.tugas_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pesan extends AppCompatActivity {
    Button pesan;
    EditText makan, minum;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesan_makanan);
        minum = (EditText) findViewById(R.id.e_minuman);
        makan = (EditText) findViewById(R.id.e_makanan);
        pesan = (Button) findViewById(R.id.simpan);

        pesan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Anda pesan makanan dan minuman", Toast.LENGTH_LONG).show();
            }
        });
    }
}

