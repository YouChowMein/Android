package com.example.a13306.helloworld.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a13306.helloworld.R;

public class MyGridViewAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyGridViewAdapter(Context context){
        this.mContext=context;
        mLayoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
            view=mLayoutInflater.inflate(R.layout.layout_grid_item,null);
            holder=new ViewHolder();
            holder.imageView=view.findViewById(R.id.iv_grid);
            holder.textView=view.findViewById(R.id.tv_title);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }
        //赋值
        holder.textView.setText("ycm");
        Glide.with(mContext).load("http://i1.bvimg.com/670191/a72f2a8c0f289d48s.png").into(holder.imageView);
        return view;
    }
}
