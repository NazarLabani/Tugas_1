package sttg.prak.tugas_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class list_pesanan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_pesan);
        String [] list = {"Nasi Uduk", "Mie Goreng", "Ayam Goreng",
                "Coca Cola", "Jus", "Air Mineral"};
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_list_view, list);
        ListView listView = (ListView) findViewById(R.id.daftar);
        listView.setAdapter(adapter);
    }
}
