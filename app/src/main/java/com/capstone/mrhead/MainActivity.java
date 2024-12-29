package com.capstone.mrhead;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewMata, imageViewJanggut, imageViewMuka, imageViewAlis, imageViewRambut, imageViewKumis;
    private CheckBox checkBoxJanggut, checkBoxKumis, checkBoxRambut, checkBoxAlis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inisialisasi ImageView dari layout XML
        imageViewMata = findViewById(R.id.imageViewMata);
        imageViewJanggut = findViewById(R.id.imageViewJanggut);
        imageViewAlis = findViewById(R.id.imageViewAlis);
        imageViewRambut = findViewById(R.id.imageViewRambut);
        imageViewKumis = findViewById(R.id.imageViewKumis);

        // Inisialisasi CheckBox dari layout XML
        checkBoxJanggut = findViewById(R.id.checkBoxJanggut);
        checkBoxKumis = findViewById(R.id.checkBoxKumis);
        checkBoxRambut = findViewById(R.id.checkBoxRambut);
        checkBoxAlis = findViewById(R.id.checkBoxAlis);

        // Listener untuk CheckBox Janggut (menampilkan/menyembunyikan gambar janggut)
        checkBoxJanggut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewJanggut.setVisibility(ImageView.VISIBLE);
                } else {
                    imageViewJanggut.setVisibility(ImageView.GONE);
                }
            }
        });

        // Listener untuk CheckBox Kumis (menampilkan/menyembunyikan gambar kumis)
        checkBoxKumis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewKumis.setVisibility(ImageView.VISIBLE);
                } else {
                    imageViewKumis.setVisibility(ImageView.GONE);
                }
            }
        });

        // Listener untuk CheckBox Rambut (menampilkan/menyembunyikan gambar rambut)
        checkBoxRambut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewRambut.setVisibility(ImageView.VISIBLE);
                } else {
                    imageViewRambut.setVisibility(ImageView.GONE);
                }
            }
        });

        // Listener untuk CheckBox Alis (menampilkan/menyembunyikan gambar alis)
        checkBoxAlis.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewAlis.setVisibility(ImageView.VISIBLE);
                } else {
                    imageViewAlis.setVisibility(ImageView.GONE);
                }
            }
        });

    }
}