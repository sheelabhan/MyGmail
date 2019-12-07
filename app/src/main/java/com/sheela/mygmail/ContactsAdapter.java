package com.sheela.mygmail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder> {
    Context mContext;
    List<Contacts> contactsList;
    private ContactsViewHolder holder;
    private int position;

    public ContactsAdapter(Context mContext, List<Contacts> contactsList) {
        this.mContext = mContext;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder contactsViewHolder, int position) {
       final Contacts contacts = contactsList.get(position);
        contactsViewHolder.imgProfile.setImageResource(contacts.getimageId());
        contactsViewHolder.tvDate.setText(contacts.getDate());
        contactsViewHolder.tvName.setText(contacts.getName());
        contactsViewHolder.tvTitle.setText(contacts.getTitle());
        contactsViewHolder.tvContent.setText(contacts.getContent());
       contactsViewHolder. imgProfile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent= new Intent(mContext,DetailsActivity.class);
               intent.putExtra("image",contacts.getimageId());
               intent.putExtra("date",contacts.getDate());
               intent.putExtra("name",contacts.getName());
               intent.putExtra("title",contacts.getTitle());
               intent.putExtra("content",contacts.getContent());
               mContext.startActivity(intent);

           }
       });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView tvDate, tvName, tvTitle, tvContent;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvName = itemView.findViewById(R.id.tvName);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvContent = itemView.findViewById(R.id.tvContent);
        }
    }

}