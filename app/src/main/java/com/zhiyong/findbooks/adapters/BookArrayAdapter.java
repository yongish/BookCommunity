package com.zhiyong.findbooks.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhiyong.findbooks.R;
import com.zhiyong.findbooks.models.Book;

import java.util.List;

/**
 * Created by zhiyong on 9/12/16.
 */
public class BookArrayAdapter extends RecyclerView.Adapter<BookArrayAdapter.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvAuthor;
        public TextView tvIsbn0;
        public TextView tvIsbn1;

        public ViewHolder (View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvAuthor = (TextView) itemView.findViewById(R.id.tvAuthor);
            tvIsbn0 = (TextView) itemView.findViewById(R.id.tvIsbn0);
            tvIsbn1 = (TextView) itemView.findViewById(R.id.tvIsbn1);
        }
    }

    private List<Book> mBooks;
    private Context mContext;

    public BookArrayAdapter(Context context, List<Book> books) {
        mBooks = books;
        mContext = context;
    }

    private Context getContext() { return mContext; }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View bookView = inflater.inflate(R.layout.item_book, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(bookView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book book = mBooks.get(position);

        TextView tvTitle = holder.tvTitle;
        TextView tvAuthor = holder.tvAuthor;
        TextView tvIsbn0 = holder.tvIsbn0;
        TextView tvIsbn1 = holder.tvIsbn1;

        tvTitle.setText(book.getTitle());
        tvAuthor.setText(book.getAuthor());

        // Set ISBNs if present.
        String isbn10 = book.getIsbn10().toString();
        String isbn13 = book.getIsbn13().toString();
        if (isbn10.length() >= 10) {
            tvIsbn0.setText(isbn10);
            if (isbn13.length() >= 13) {
                tvIsbn1.setText(isbn13);
            }
        } else {
            tvIsbn0.setText(isbn13);
        }
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public void addAll (List<Book> list) {
        mBooks.addAll(list);
        notifyDataSetChanged();
    }
}
