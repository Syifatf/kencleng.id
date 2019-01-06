package syifa.app.kcid.holder;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import syifa.app.kcid.R;

/**
 * Created by USER on 06/01/2019.
 */

public class KenclengHolder extends AppCompatActivity {

    public EditText edtNominal, edtCatatan;
    public Button btnAdd;

    public KenclengHolder(View view) {
        super(); // (itemView)

        edtNominal = (EditText) findViewById(R.id.edt_nominal);
        edtCatatan= (EditText) findViewById(R.id.edt_catatan);
        btnAdd = (Button) findViewById(R.id.btnAdd);
    }

    public KenclengHolder(EditText edtNominal, EditText edtCatatan, Button btnAdd) {
        this.edtNominal = edtNominal;
        this.edtCatatan = edtCatatan;
        this.btnAdd = btnAdd;
    }
}
