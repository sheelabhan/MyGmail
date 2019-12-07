package com.sheela.mygmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailsActivity extends AppCompatActivity {
    ImageView imgProfile1;
    TextView tvDate, tvName, tvTitle, tvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgProfile1 = findViewById(R.id.imgProfile1);
        tvDate = findViewById(R.id.tvDate);
        tvName = findViewById(R.id.tvName);
        tvTitle = findViewById(R.id.tvTitle);
        tvContent = findViewById(R.id.tvContent);
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            imgProfile1.setImageResource(bundle.getInt("image"));
            tvDate.setText(bundle.getString("date"));
            tvName.setText(bundle.getString("name"));
            tvTitle.setText(bundle.getString("title"));
            tvContent.setText(bundle.getString("content"));
        }

    }
}
