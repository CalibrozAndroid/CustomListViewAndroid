package app.muhammed.com.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Muhammed on 15/10/17.
 */

public class ContactAdapter extends ArrayAdapter<ContactModel> {


    private ArrayList<ContactModel> contact;

    public ContactAdapter(@NonNull Context context, ArrayList<ContactModel> contacts) {
        super(context, R.layout.contact_row, contacts);

        this.contact = contacts;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.contact_row, parent, false);


            viewHolder.nameTextView = convertView.findViewById(R.id.name_text_view);
            viewHolder.emailTextView = convertView.findViewById(R.id.email_text_view);
            viewHolder.phoneTextView = convertView.findViewById(R.id.phone_text_view);
            viewHolder.addressTextView = convertView.findViewById(R.id.address_text_view);

            convertView.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) convertView.getTag();

        }


        ContactModel model = contact.get(position);


        viewHolder.nameTextView.setText(model.getName());
        viewHolder.phoneTextView.setText(model.getPhone());
        viewHolder.emailTextView.setText(model.getEmail());
        viewHolder.addressTextView.setText(model.getAddress());
        return convertView;
    }


    static class ViewHolder {
        TextView nameTextView;
        TextView emailTextView;
        TextView phoneTextView;
        TextView addressTextView;
    }
}
