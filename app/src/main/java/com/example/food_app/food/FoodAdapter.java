package com.example.food_app.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.food_app.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private Context mContext;
    private List<Food> mListFood;

    public FoodAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Food> list){
        this.mListFood = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = mListFood.get(position);
        if (food == null)
            return;
        holder.imgFood.setImageResource(food.getResoureId());
        holder.tvName.setText(food.getName());
        holder.tvPrice.setText(food.getPrice());
    }

    @Override
    public int getItemCount() {
        if(mListFood != null)
            return mListFood.size();
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFood;
        private TextView tvName;

        private TextView tvPrice;
        private Button btnBuy;
        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFood = itemView.findViewById(R.id.imgFood);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            btnBuy = itemView.findViewById(R.id.btnBuy);

        }
    }
}
