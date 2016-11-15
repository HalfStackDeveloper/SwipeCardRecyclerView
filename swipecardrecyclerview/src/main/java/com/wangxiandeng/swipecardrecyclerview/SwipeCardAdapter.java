package com.wangxiandeng.swipecardrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by WangXiandeng on 2016/11/3.
 */

public class SwipeCardAdapter extends RecyclerView.Adapter<SwipeCardAdapter.SwipeCardHolder> {
    private Context mContext;
    private List<String> mList;

    public SwipeCardAdapter(Context context, List<String> list) {
        mContext = context;
        mList = list;
    }


    @Override
    public SwipeCardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item, parent, false);
        return new SwipeCardHolder(view);
    }

    @Override
    public void onBindViewHolder(SwipeCardHolder holder, int position) {
        holder.setData(mList.get(position));
    }

    /**
     * 删除最顶部Item
     */

    public void  delTopItem(){
        int position=getItemCount()-1;
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class SwipeCardHolder extends RecyclerView.ViewHolder {
        private TextView mTextView;

        public SwipeCardHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.text);
        }

        public void setData(String text) {
            mTextView.setText(text);
        }
    }
}
