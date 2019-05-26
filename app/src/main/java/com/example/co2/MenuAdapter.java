package com.example.co2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuAdapter extends ArrayAdapter <MenuItem>{
    public MenuAdapter(Context context, ArrayList<MenuItem> menulist) {
        super(context, 0, menulist);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.menu_spinner_row, parent, false
            );
        }

        ImageView imageViewHome = convertView.findViewById(R.id.image_view_home);
        TextView textViewName = convertView.findViewById(R.id.text_view_name);

        MenuItem currentItem = getItem(position);

        if(currentItem  != null) {
            imageViewHome.setImageResource(currentItem.getHomeImage());
            textViewName.setText(currentItem.getMenuName());
        }
        return convertView;
    }
}
