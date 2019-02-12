package id.yudistiro.cekjodoh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewkecocok;
    private EditText editTextNamaPasangan;
    private Button buttonCek;
    private ArrayList<String> randomText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewkecocok = findViewById(R.id.tv_hasil);
        editTextNamaPasangan = findViewById(R.id.ed_nama_pasangan);
        buttonCek = findViewById(R.id.button_cek);

        randomText.add("100% Kalian Cocok, Segera menikah Saja");
        randomText.add("50% Dia mungkin mencintai mu jika Kamu berusah lebih!");
        randomText.add("75% Berusahalah sedikit lagi, agar dia yakin!");
        randomText.add("25% Lebih baik kamu mencari cewek lain lagi" );
        randomText.add("0% Kamu Jelek!" );


        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cekKecocokan();
            }
        });

    }

    private void cekKecocokan() {
        final int min = 0;
        final int max = 4;
        final int random = new Random().nextInt((max - min) + 1) + min;

        if(editTextNamaPasangan.getText().toString().equals("putri tanjung")){

            textViewkecocok.setVisibility(View.VISIBLE);
            textViewkecocok.setText(randomText.get(0));
        }else {

            textViewkecocok.setVisibility(View.VISIBLE);
            textViewkecocok.setText(randomText.get(random));
        }
    }
}
