package com.example.merebe.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mebreb.R;
import com.example.mereb.models.AllMethods;
import com.example.mereb.models.Message;
import com.example.mereb.R;
import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageAdapterViewHolder> {
    Context context;
    List<Message> messages;
    DatabaseReference messagedb;
    public MessageAdapter(Context context, List<Message> messages, DatabaseReference messagedb){
        this.context = context;
        this.messages = messages;
        this.messagedb = messagedb;

    }


    @NonNull
    @Override
    public MessageAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_message,parent,false);
        return new MessageAdapterViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MessageAdapterViewHolder holder, int position) {

        Message message = messages.get(position);
        if(AllMethods.name.equals(message.getName()))
        {
            holder.tvTitle.setText("You: "+message.getMessage());
            holder.tvTitle.setGravity(Gravity.START);
            holder.L1.setBackgroundColor(Color.parseColor("#98BD77"));
//#EF9E73
        }
        else
        {
            holder.tvTitle.setText("Someone:"+message.getMessage());
            holder.L1.setBackgroundColor(Color.parseColor("#C0C0C0"));
          //  holder.ibDelete.setVisibility(View.GONE);

        }
    }

    @Override
    public int getItemCount() {

        return messages.size();
    }

    public class MessageAdapterViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageButton ibDelete;
        LinearLayout L1;


        public MessageAdapterViewHolder(@NonNull View itemView) {


            super(itemView);
            tvTitle=(TextView)itemView.findViewById(R.id.tvTitle);
            //ibDelete=(ImageButton)itemView.findViewById(R.id.ibdelete);
            L1=(LinearLayout)itemView.findViewById(R.id.l1message);

           /* ibDelete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    messagedb.child(messages.get(getAdapterPosition()).getKey()).removeValue();

                }
            });

            */
        }
    }
}



