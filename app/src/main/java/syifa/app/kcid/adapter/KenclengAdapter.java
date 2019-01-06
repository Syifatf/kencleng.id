package syifa.app.kcid.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import syifa.app.kcid.R;
import syifa.app.kcid.entity.Kenclengan;
import syifa.app.kcid.holder.KenclengHolder;

import static android.R.attr.x;

/**
 * Created by USER on 06/01/2019.
 */

public class KenclengAdapter extends RecyclerView.Adapter<KenclengHolder> {

    private List<Kenclengan> Kenclengans;
    private KenclenganListener listener;

    public KenclengAdapter(List<Kenclengan> kenclengans, KenclenganListener listener) {
        Kenclengans = kenclengans;
        this.listener = listener;
    }

    public void setKenclengans(List<Kenclengan> kenclengans) {
        Kenclengans = kenclengans;
    }

    public void setListener(KenclenganListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public KenclengHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext().inflate(R.layout.));
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull KenclengHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class KenclenganListener {
    }
}
