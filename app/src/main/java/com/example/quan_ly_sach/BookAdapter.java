package com.example.quan_ly_sach;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    private Context mContext;
    private List<Book> mListBook;

    public BookAdapter(Context mContext) {
        this.mContext = mContext;
    }
    public void setData(List<Book> list){
        this.mListBook = list;
        notifyDataSetChanged();

    }
    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = mListBook.get(position);
        if (book == null){
            return;
        }
        holder.imgUsser.setImageResource(book.getResouceImage());
        holder.tvName.setText(book.getName());
    }

    @Override
    public int getItemCount() {
        if (mListBook != null){
            return mListBook.size();
        }
        return 0;
    }

    public  class BookViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgUsser;
        private TextView tvName;
        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            imgUsser = itemView.findViewById(R.id.img_usser);
            tvName = itemView.findViewById(R.id.textviewname);
        }
    }
}
