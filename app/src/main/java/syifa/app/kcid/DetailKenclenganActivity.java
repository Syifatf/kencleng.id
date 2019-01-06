package syifa.app.kcid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DetailKenclenganActivity extends AppCompatActivity {

    private EditText edtNominal, edtCatatan;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kenclengan);

        // casting untuk semua view
        edtNominal = (EditText) findViewById(R.id.edt_nominal);
        edtCatatan= (EditText) findViewById(R.id.edt_catatan);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        }
    }
