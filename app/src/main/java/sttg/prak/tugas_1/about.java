package sttg.prak.tugas_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class about extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        WebView browser = (WebView) findViewById(R.id.webkit);
        browser.loadData("" +
                " <html>" +
                "<body>" +
                "<title>Tentang Aplikasi</title>" +
                "<p>tentang aplikasi" +
                "<br/>" +
                "Aplikasi digunakan untuk memesan makanan di cafe X" +
                "<br/>" +
                "Aplikasi ini dibuat oleh : <br/>" +
                "Dina S Maudy (1406036) <br/>" +
                "Raden Nazar Labani (1406096)<br/>" +
                "Toni Nugraha (1406127)<br/>" +
                "</p>" +
                "</body>" +
                "</html>", "text/html", "UTF-8");
    }
}

