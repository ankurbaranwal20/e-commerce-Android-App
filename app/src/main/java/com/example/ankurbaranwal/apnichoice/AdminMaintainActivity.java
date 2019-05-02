package com.example.ankurbaranwal.apnichoice;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class AdminMaintainActivity extends AppCompatActivity {

    private Button applyChangesBtn;
    private EditText name,price,description;
    private ImageView imageView;

    private String productID = "";
    private DatabaseReference productRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_maintain);

        productID = getIntent().getStringExtra("pid");
        productRef = FirebaseDatabase.getInstance().getReference().child("Products").child(productID);


        applyChangesBtn =(Button)findViewById(R.id.apply_changes_btn);
        name =(EditText)findViewById(R.id.product_name_maintain);
        price =(EditText)findViewById(R.id.product_price_maintain);
        description = (EditText)findViewById(R.id.product_description_maintain);
        imageView =(ImageView)findViewById(R.id.product_image_maintain);

        displaySpecificProductInfo();

        applyChangesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                applyChanges();
            }
        });


    }

    private void applyChanges()
    {
        String pname = name.getText().toString();
        String pprice = price.getText().toString();
        String pdescription = description.getText().toString();

        if (pname.equals(""))
        {
            Toast.makeText(this, "Write down product name", Toast.LENGTH_SHORT).show();
        }
        else if (price.equals(""))
        {
            Toast.makeText(this, "Write down product price", Toast.LENGTH_SHORT).show();
        }
        else if (description.equals(""))
        {
            Toast.makeText(this, "Write down product description", Toast.LENGTH_SHORT).show();
        }
        else
        {
            HashMap<String, Object> productMap = new HashMap<>();
            productMap.put("pid", productID);
            productMap.put("price", pprice);
            productMap.put("pname", pname);
            productMap.put("description",pdescription);

            productRef.updateChildren(productMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {

                    if (task.isSuccessful())
                    {
                        Toast.makeText(AdminMaintainActivity.this, "Changes applied successfully.", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(AdminMaintainActivity.this,AdminCategaryActivity.class);
                        startActivity(intent);
                        finish();

                    }
                }
            });
        }
    }

    private void displaySpecificProductInfo()
    {
        productRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists())
                {
                    String pname= dataSnapshot.child("pname").getValue().toString();
                    String pprice= dataSnapshot.child("price").getValue().toString();
                    String pdescription= dataSnapshot.child("description").getValue().toString();
                    String pimage= dataSnapshot.child("image").getValue().toString();

                    name.setText(pname);
                    price.setText(pprice);
                    description.setText(pdescription);
                    Picasso.get().load(pimage).into(imageView);

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
