package dqbigd.com;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class cardAdapter extends RecyclerView.Adapter<cardAdapter.CardViewViewHolder> {

    private ArrayList<Crypto> listCrypto;
    private Context context;
    private String getName, getDetail, getPhoto;

    public cardAdapter(ArrayList<Crypto> list){
        this.listCrypto = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card, viewGroup, false);
        context = view.getContext();
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int postition) {
        Crypto crypto = listCrypto.get(postition);
        Glide.with(holder.itemView.getContext())
                .load(crypto.getPhoto())
                .apply(new RequestOptions().override(30, 30))
                .into(holder.imgPhoto);

        holder.tvName.setText(crypto.getName());
        holder.tvDetail.setText(crypto.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                getName = listCrypto.get(holder.getAdapterPosition()).getName();
                getDetail = listCrypto.get(holder.getAdapterPosition()).getDetail();
                getPhoto = listCrypto.get(holder.getAdapterPosition()).getPhoto();

                intent.putExtra("EXTRA_NAME", getName);
                intent.putExtra("EXTRA_DETAIL", getDetail);
                intent.putExtra("EXTRA_PHOTO", getPhoto);

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listCrypto.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imgCrypto);
            tvName = itemView.findViewById(R.id.tvName);
            tvDetail = itemView.findViewById(R.id.tvDetail);
        }
    }
}
