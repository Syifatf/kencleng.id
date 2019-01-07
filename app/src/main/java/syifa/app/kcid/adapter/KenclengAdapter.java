package syifa.app.kcid.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import syifa.app.kcid.DetailKenclenganActivity;
import syifa.app.kcid.R;
import syifa.app.kcid.entity.Kencleng;
import syifa.app.kcid.holder.KenclengHolder;
import syifa.app.kcid.util.Consts;

/**
 * Created by USER on 06/01/2019.
 */

public class KenclengAdapter extends RecyclerView.Adapter<KenclengHolder> {

    private List<Kencleng> kenclengs;
    private KenclengListener listener;

    public KenclengAdapter(List<Kencleng> kenclengs) {
        this.kenclengs = kenclengs;
    }

    public void setListener(KenclengListener Listener) {
        this.listener = listener;
    }

    @Override
    public KenclengHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kenclengan, parent, false);
        final KenclengHolder holder = new KenclengHolder(view);

        final Context context = holder.itemView.getContext();
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //definisikan position untuk getKencleng.
                int adapterPosition = holder.getAdapterPosition();
                Kencleng kencleng = kenclengs.get(adapterPosition);

                Intent detailIntent = new Intent(context, DetailKenclenganActivity.class);
                detailIntent.putExtra("kencleng", kencleng);
                detailIntent.putExtra(Consts.KEY_ACTION_DETAIL, Consts.INTENT_EDIT);
                context.startActivity(detailIntent);
            }
        });

        return holder;
    }

    @Override
    public void onBindViewHolder(KenclengHolder holder, final int position) {
        holder.edtNominal.setText(kenclengs.get(position).getNominal());
        holder.edtCatatan.setText(kenclengs.get(position).getCatatan());

        //tambahkan fungsi delete
        holder.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onDelete(kenclengs.get(position).getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return kenclengs.size();
    }

    public interface KenclengListener {
        void onDelete(int mhsId);
    }

}
