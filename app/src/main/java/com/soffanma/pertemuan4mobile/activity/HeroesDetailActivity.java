package com.soffanma.pertemuan4mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.soffanma.pertemuan4mobile.R;
import com.soffanma.pertemuan4mobile.model.Hero;

import de.hdodenhof.circleimageview.CircleImageView;

public class HeroesDetailActivity extends AppCompatActivity {

    private CircleImageView circleImageView;
    private TextView tvNama;
    private TextView tvFrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_detail);

        circleImageView = findViewById(R.id.img_item_photo);
        tvNama = findViewById(R.id.tvNama);
        tvFrom = findViewById(R.id.tvAsal);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String from = intent.getStringExtra("from");
        String photo = intent.getStringExtra("photo");
        Glide.with(getApplicationContext())
                .load(photo)
                .apply(new RequestOptions().override(350, 550))
                .into(circleImageView);
        tvNama.setText(name);
        tvFrom.setText(from);

    }
}