package syifa.app.kcid;

import android.net.Network;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import syifa.app.kcid.entity.Kencleng;
import syifa.app.kcid.util.Consts;

public class DetailKenclenganActivity extends AppCompatActivity {

    private EditText edtNominal, edtCatatan;
    private Button btnAdd;
    private ImageView btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kenclengan);

        // casting untuk semua view
        edtNominal = (EditText) findViewById(R.id.edt_nominal);
        edtCatatan= (EditText) findViewById(R.id.edt_catatan);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDelete = (ImageView) findViewById(R.id.btn_tong);


        String action = getIntent().getStringExtra(Consts.KEY_ACTION_DETAIL);
        switch (action) {
            case Consts.INTENT_ADD:
                btnAdd.setText("SIMPAN");
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer nominal = edtNominal.getText().length();
                        String catatan = edtCatatan.getText().toString();

                        if(nominal.equals("")) {
                            edtNominal.setError("silahkan isi uang yang anda masukkan");
                        } else if(catatan.equals("")) {
                            edtCatatan.setError("silahkan isi catatan mu ");
                        }else {
                            dataAdd(nominal, catatan);
                        }
                    }
                });
                break;
            case Consts.INTENT_EDIT:
                final Kencleng kenclengan = (Kencleng) getIntent().getSerializableExtra("Kencleng");
                edtNominal.setText(syifa.app.kcid.entity.Kencleng.getNominal());
                edtCatatan.setText(syifa.app.kcid.entity.Kencleng.getCatatan());

                btnAdd.setText("UPDATE");
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        kenclengan.setNominal(edtNominal.getText().length());
                        kenclengan.setCatatan(edtCatatan.getText().toString());
                        updateKenclengan(kenclengan);
                    }
                });
                break;
        }
    }

    private void dataAdd(Integer nominal, String catatan) {
    }

//    private void dataAdd() {
//
//    }
//
    private void updateKenclengan(Kencleng kencleng) {
        Routes services = Network.request().create(Routes.class);

        Integer nominal = kenclengan.getNominal();
        String catatan= kenclengan.getCatatan();

        services.updateKenclengan(nominal, catatan).enqueue(new Callback<Kencleng>() {
            @Override
            public void onResponse(Call<Kencleng> call, Response<Kencleng> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(DetailKenclenganActivity.this,
                            "update berhasil!",
                            Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    onErrorAddKenclengan();
                }
            }
//
//            @Override
//            public void onFailure(Call<Kencleng> call, Throwable t) {
//                onErrorAddKenclengan();
//            }
//        });
//    }
//
//    private void addNewkenclengan(int nominal, String catatan) {
//        Routes services = Network.request().create(Routes.class);
//
//        //lalu, kita lakukan post terhadap data celengan dari API /add.php
//        services.postKenclengan(nominal, catatan).enqueue(new SortedList.Callback<Kencleng>() {
//            @Override
//            public void onResponse(Call<Kencleng> call, Response<Kencleng> response) {
//                if (response.isSuccessful()) {
//                    //ketika post nya berhasil, maka akan kembali ke mainActivity
//                    finish(); //ini akan destroy si DetailKenclengActivity()
//                } else {
//                    onErrorAddKenclengan();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Kencleng> call, Throwable t) {
//                onErrorAddKenclengan();
//            }
//        });
//    }

    private void onErrorAddKenclengan() {
        Toast.makeText(DetailKenclenganActivity.this,
                "Maaf, terjadi kesalahan",
                Toast.LENGTH_LONG).show();
    }

    private class Response<T> {
        private boolean successful;

        public boolean isSuccessful() {
            return successful;
        }

        public void setSuccessful(boolean successful) {
            this.successful = successful;
        }
    }
}
