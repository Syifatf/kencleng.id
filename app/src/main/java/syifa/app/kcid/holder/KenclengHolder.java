package syifa.app.kcid.holder;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import syifa.app.kcid.R;

/**
 * Created by USER on 06/01/2019.
 */

public class KenclengHolder extends RecyclerView.ViewHolder {

    public EditText edtNominal, edtCatatan;
    public Button btnAdd;
    public ImageView btnDelete;
    public View itemView;

    public KenclengHolder(View itemView) {
        super(itemView);

        edtNominal = (EditText) itemView.findViewById(R.id.edt_nominal);
        edtCatatan= (EditText) itemView.findViewById(R.id.edt_catatan);
        btnAdd = (Button) itemView.findViewById(R.id.btnAdd);
        btnDelete = (ImageView) itemView.findViewById(R.id.btn_tong);
    }

    public EditText getEdtNominal() {
        return edtNominal;
    }

    public EditText getEdtCatatan() {
        return edtCatatan;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public ImageView getBtnDelete() {
        return btnDelete;
    }

    public View getItemView() {
        return itemView;
    }
}
