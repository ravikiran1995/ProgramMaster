package com.kcktechsolutions.programmaster.menu;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kcktechsolutions.programmaster.R;

/**
 * Created by Ravi kiranJ on 2/5/2018.
 */

public class MenuItem extends DrawerItem<MenuItem.ViewHolder> {

    private int selectedItemIconTint;
    private int selectedItemTextTint;

    private int normalItemIconTint;
    private int normalItemTextTint;

    private Drawable icon;
    private String title;

    public MenuItem(Drawable icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    @Override
    public ViewHolder createViewHolder(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.item_option, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void bindViewHolder(ViewHolder holder) {
        holder.title.setText(title);
        holder.icon.setImageDrawable(icon);

        holder.title.setTextColor(isChecked ? selectedItemTextTint : normalItemTextTint);
        holder.icon.setColorFilter(isChecked ? selectedItemIconTint : normalItemIconTint);
    }

    public MenuItem withSelectedIconTint(int selectedItemIconTint) {
        this.selectedItemIconTint = selectedItemIconTint;
        return this;
    }

    public MenuItem withSelectedTextTint(int selectedItemTextTint) {
        this.selectedItemTextTint = selectedItemTextTint;
        return this;
    }

    public MenuItem withIconTint(int normalItemIconTint) {
        this.normalItemIconTint = normalItemIconTint;
        return this;
    }

    public MenuItem withTextTint(int normalItemTextTint) {
        this.normalItemTextTint = normalItemTextTint;
        return this;
    }

    static class ViewHolder extends DrawerAdapter.ViewHolder {

        private ImageView icon;
        private TextView title;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.icon);
            title = (TextView) itemView.findViewById(R.id.title);
        }
    }
}