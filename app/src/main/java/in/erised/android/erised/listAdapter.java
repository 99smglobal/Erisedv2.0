package in.erised.android.erised;

import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Suraj...!!! on 7/28/2015.
 */
public class listAdapter extends BaseAdapter {
    String[] siteNames;
    Activity a;
    TypedArray icons;
    public listAdapter(Activity a, String[] siteNames,TypedArray icons) {
        this.a = a;
        this.siteNames = siteNames;
       this.icons=icons;
    }


    public int getCount() {
        return siteNames.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;

        vi = a.getLayoutInflater().inflate(R.layout.listitem, null);

        ImageView iconView = (ImageView) vi.findViewById(R.id.listImageItem);
        iconView.setImageDrawable(icons.getDrawable(position));
        Typeface tf = Typeface.createFromAsset(a.getAssets(), "fonts/Walkway Black.ttf");
        TextView tv = (TextView) vi.findViewById(R.id.listItem);
        tv.setTypeface(tf);
        tv.setText(siteNames[position]);
        //whatever other changes you want to make to your list items.

        return vi;

    }

}
