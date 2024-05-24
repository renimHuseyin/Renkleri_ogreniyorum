package com.renim.renkler;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button uygula;
    RadioButton sari, mavi, kirmizi, yesil, turuncu, mor, siyah, beyaz, gri, pembe;
    RadioGroup grup;
    LinearLayout layout;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uygula = findViewById(R.id.uygula);
        sari = findViewById(R.id.sari);
        mavi = findViewById(R.id.mavi);
        kirmizi = findViewById(R.id.kirmizi);
        yesil = findViewById(R.id.yesil);
        turuncu = findViewById(R.id.turuncu);
        mor = findViewById(R.id.mor);
        siyah = findViewById(R.id.siyah);
        beyaz = findViewById(R.id.beyaz);
        gri = findViewById(R.id.gri);
        pembe = findViewById(R.id.pembe);
        layout = findViewById(R.id.linear);
        text = findViewById(R.id.text);

        uygula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sari.isChecked())
                {
                    layout.setBackgroundColor(Color.YELLOW);
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(mavi.isChecked())
                {
                    layout.setBackgroundColor(Color.BLUE);
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(kirmizi.isChecked())
                {
                    layout.setBackgroundColor(Color.RED);
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(yesil.isChecked())
                {
                    layout.setBackgroundColor(Color.GREEN);
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(turuncu.isChecked())
                {
                    layout.setBackgroundColor(Color.rgb(255,127,0));
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(mor.isChecked())
                {
                    layout.setBackgroundColor(Color.rgb(95,0,191));
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(siyah.isChecked())
                {
                    layout.setBackgroundColor(Color.BLACK);
                    text.setTextColor(Color.WHITE);
                    sari.setTextColor(Color.WHITE);
                    kirmizi.setTextColor(Color.WHITE);
                    mavi.setTextColor(Color.WHITE);
                    yesil.setTextColor(Color.WHITE);
                    mor.setTextColor(Color.WHITE);
                    turuncu.setTextColor(Color.WHITE);
                    siyah.setTextColor(Color.WHITE);
                    beyaz.setTextColor(Color.WHITE);
                    pembe.setTextColor(Color.WHITE);
                    gri.setTextColor(Color.WHITE);
                }
                else if(beyaz.isChecked())
                {
                    layout.setBackgroundColor(Color.WHITE);
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(gri.isChecked())
                {
                    layout.setBackgroundColor(Color.rgb(127,127,127));
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }
                else if(pembe.isChecked())
                {
                    layout.setBackgroundColor(Color.rgb(255,0,255));
                    text.setTextColor(Color.BLACK);
                    sari.setTextColor(Color.BLACK);
                    kirmizi.setTextColor(Color.BLACK);
                    mavi.setTextColor(Color.BLACK);
                    yesil.setTextColor(Color.BLACK);
                    mor.setTextColor(Color.BLACK);
                    turuncu.setTextColor(Color.BLACK);
                    siyah.setTextColor(Color.BLACK);
                    beyaz.setTextColor(Color.BLACK);
                    pembe.setTextColor(Color.BLACK);
                    gri.setTextColor(Color.BLACK);
                }

            }
        });
    }
}