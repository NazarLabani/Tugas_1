package sttg.prak.tugas_1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_menu extends AppCompatActivity {
    Button list, serve, tentang, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);
        list = (Button) findViewById(R.id.list_pesan);
        serve = (Button) findViewById(R.id.pesan);
        tentang = (Button) findViewById(R.id.about);
        keluar = (Button) findViewById(R.id.exit);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, list_pesanan.class);
                startActivity(i);
            }
        });
        serve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, pesan.class);
                startActivity(i);

            }
        });
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, about.class);
                startActivity((i));
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(main_menu.this, MainActivity.class);
                startActivity(i);
            }

        });
    }

}



