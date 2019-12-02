package dqbigd.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCrypto;
    private String title;
    private ArrayList<Crypto> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCrypto = findViewById(R.id.rvCrypto);
        rvCrypto.setHasFixedSize(true);

        list.addAll(CryptoData.getListData());
        showList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode (int SelectedMode){
        switch (SelectedMode){
            case R.id.action_account:
                showAccount();
                break;
        }
    }

    private void showAccount(){
        Intent intent = new Intent(MainActivity.this,AccountActivity.class);
        startActivity(intent);
    }

    private void showList(){
        rvCrypto.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        cardAdapter cardadapter = new cardAdapter(list);
        rvCrypto.setAdapter(cardadapter);
    }



}
