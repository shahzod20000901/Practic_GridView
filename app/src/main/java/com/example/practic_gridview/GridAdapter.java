package com.example.practic_gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private String[] houseName;
    private int[] houseImage;
    Context context;

    LayoutInflater inflater;

    public GridAdapter(String[] houseName, int[] houseImage, Context context) {
        this.houseName = houseName;
        this.houseImage = houseImage;
        this.context = context;
    }

    @Override
    public int getCount() {
        return houseName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

      if(inflater==null)
      {
          inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      }

      if(convertView==null)
      {
          convertView=inflater.inflate(R.layout.item_grid, null);
      }

      ImageView imageView=(ImageView) convertView.findViewById(R.id.item_image);
      TextView textView=(TextView) convertView.findViewById(R.id.item_text);

      imageView.setImageResource(houseImage[position]);
      textView.setText(houseName[position]);

        return convertView;
    }
}
