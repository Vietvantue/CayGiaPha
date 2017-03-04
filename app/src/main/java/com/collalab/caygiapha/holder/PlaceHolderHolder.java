package com.collalab.caygiapha.holder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.collalab.caygiapha.R;
import com.collalab.caygiapha.treeview.model.TreeNode;
import com.github.johnkil.print.PrintView;

import java.util.Random;


public class PlaceHolderHolder extends TreeNode.BaseNodeViewHolder<PlaceHolderHolder.PlaceItem> {


    public PlaceHolderHolder(Context context) {
        super(context);
    }

    @Override
    public View createNodeView(TreeNode node, PlaceItem value) {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(R.layout.layout_place_node, null, false);


        TextView placeName = (TextView) view.findViewById(R.id.place_name);
        placeName.setText(value.name);

        Random r = new Random();
        boolean like = r.nextBoolean();

        PrintView likeView = (PrintView) view.findViewById(R.id.like);
        likeView.setIconText(context.getString(like ? R.string.ic_thumbs_up : R.string.ic_thumbs_down));
        return view;
    }

    @Override
    public void toggle(boolean active) {
    }


    public static class PlaceItem {
        public String name;

        public PlaceItem(String name) {
            this.name = name;
        }
        // rest will be hardcoded
    }

}
