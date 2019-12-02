package dqbigd.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String name, detail, photo;
        name = getIntent().getStringExtra("EXTRA_NAME");
        detail = getIntent().getStringExtra("EXTRA_DETAIL");
        photo = getIntent().getStringExtra("EXTRA_PHOTO");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Detail "+name);

        TextView tvName, tvDetail;
        ImageView imgDetail = (ImageView) findViewById(R.id.imgDetail);

        tvName = findViewById(R.id.tvNameDetail);
        tvDetail = findViewById(R.id.tvDetailDetail);

        tvName.setText(name);
        tvDetail.setText(detail);
        Glide.with(this).load(photo).into(imgDetail);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
