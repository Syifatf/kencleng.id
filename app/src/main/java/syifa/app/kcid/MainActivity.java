package syifa.app.kcid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import syifa.app.kcid.util.Consts;

import static syifa.app.kcid.R.id.lst_kenclengan;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //casting recyclerviewnya dari id lst_mahasiswa yang ada di activity_main
        RecyclerView lstKenclengan = (RecyclerView) findViewById(lst_kenclengan);

        //set layout manager untuk lstkenclengan
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        lstKenclengan.setLayoutManager(linearLayoutManager);

        //requestisi celengan();

        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addIntent = new Intent(MainActivity.this, DetailKenclenganActivity.class);
                addIntent.putExtra(Consts.KEY_ACTION_DETAIL, Consts.INTENT_ADD);
                startActivity(addIntent);
            }
        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", Intent(getActionBar())).show();
//            }
//        });
    }
}