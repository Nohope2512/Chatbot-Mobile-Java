package com.example.chatbot_mobile_java.bin.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.chatbot_mobile_java.R;
import com.example.chatbot_mobile_java.bin.data.userSend;
import com.example.chatbot_mobile_java.bin.data.Api;

import java.util.List;

public class ModelChoosing_Adapter extends RecyclerView.Adapter<ModelChoosing_Adapter.MyViewHolder> {

    List<Api> apiList;
    Context context;

    public ModelChoosing_Adapter(List<Api> apiList, Context context) {
        this.apiList = apiList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.one_line_api, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv_apiName.setText(apiList.get(position).getName());
        holder.tv_apiDescription.setText(apiList.get(position).getDescription());
        Glide.with(this.context).load(apiList.get(position).getImageURL()).into(holder.iv_apiPic);

        holder.itemView.setOnClickListener(v -> {
            userSend.initialize_Type(apiList.get(position).getName().toString());
           Log.d("bin", "user model AI type: " + userSend.get_Type());

        });

    }

    @Override
    public int getItemCount() {
        return apiList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_apiPic;
        TextView tv_apiName;
        TextView tv_apiDescription;

        public MyViewHolder(View itemView) {
            super(itemView);

            iv_apiPic = itemView.findViewById(R.id.iv_apiPicture);
            tv_apiName = itemView.findViewById(R.id.tv_apiName);
            tv_apiDescription = itemView.findViewById(R.id.tv_apiDescription);


        }
    }

}
