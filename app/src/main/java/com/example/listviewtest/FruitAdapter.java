package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViedResourceId, List<Fruit> objects) {
        super(context, textViedResourceId, objects);
        resourceId = textViedResourceId;
    }
     @Override
    public View getView(int positon, View convertView, ViewGroup parent) {
        Fruit fruit  = getItem(positon);  // 获取当前Fruit实例
         View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
         ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
         TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
         fruitImage.setImageResource(fruit.getImageId());
         fruitName.setText(fruit.getName());
         return view;
     }
}
