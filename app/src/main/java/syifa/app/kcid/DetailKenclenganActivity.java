package syifa.app.kcid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class DetailKenclenganActivity extends AppCompatActivity {

    private EditText edtnominal, edtcatatan;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kenclengan);

        // casting untuk semua view
        edtnominal = (EditText) findViewById(R.id.edt_nominal);
        edtcatatan = (EditText) findViewById(R.id.edt_catatan);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        }
    }
