package gestargent.perso.form.gestionargent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tfk on 14/12/2014.
 */
public class DepenseAdapter extends BaseAdapter {

    private ArrayList listData;

    private LayoutInflater layoutInflater;

    public DepenseAdapter(Context context, ArrayList listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_depense_layout, null);
            holder = new ViewHolder();
            holder.headlineView = (TextView) convertView.findViewById(R.id.categorie);
            holder.reporterNameView = (TextView) convertView.findViewById(R.id.prix);
            holder.reportedDateView = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        DepenseItem item = (DepenseItem) listData.get(position);
        holder.headlineView.setText(item.getCategorie());
        holder.reporterNameView.setText(item.getPrix() + "€");
        holder.reportedDateView.setText(item.getDate());

        return convertView;
    }

    static class ViewHolder {
        TextView headlineView;
        TextView reporterNameView;
        TextView reportedDateView;
    }

}
