package com.example.james.navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by JAMES on 9/29/2017.
 */

public class CustomAdapter extends BaseAdapter {
    private int p;
    private String [] result;
    private Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] osNameList, int[] osImages) {
        // TODO Auto-generated constructor stub
        result = osNameList;
        context = mainActivity;
        imageId = osImages;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    class Holder
    {
        TextView os_text;
        ImageView os_img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;


        rowView = inflater.inflate(R.layout.sample_gridlayout,parent,false);
        holder.os_text =(TextView) rowView.findViewById(R.id.os_texts);
        holder.os_img =(ImageView) rowView.findViewById(R.id.os_images);

        holder.os_text.setText(result[position]);
        holder.os_img.setImageResource(imageId[position]);

        rowView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub4
                //int p=0;
                p =(int) getItem(position);
                switch(p)
                { case 0:
                        Intent intent =new Intent(v.getContext(),Settings.class);
                        v.getContext().startActivity(intent);
                        break;
                }

            }
        });

        return rowView;
    }

}


