package com.example.ankurbaranwal.apnichoice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategaryActivity extends AppCompatActivity {

    private ImageView tShirts, sportsTshirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletBagsPurses, shoes;
    private ImageView headPhones,laptops, watches, mobiles;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_categary);

        LogoutBtn = (Button)findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button)findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button)findViewById(R.id.maintain_btn);


        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,HomeActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
            }
        });

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminNewOrdersActivity.class);

                startActivity(intent);

            }
        });


        tShirts =(ImageView)findViewById(R.id.t_shirts);
        sportsTshirts =(ImageView)findViewById(R.id.t_sports);
        femaleDresses =(ImageView) findViewById(R.id.female_dresses);
        sweathers = (ImageView) findViewById(R.id.sweather);
        glasses = (ImageView)findViewById(R.id.glasses);
        hatsCaps =(ImageView) findViewById(R.id.hats);
        walletBagsPurses =(ImageView) findViewById(R.id.purses_bags_wallets);
        shoes = (ImageView)findViewById(R.id.shoess);
        headPhones =(ImageView) findViewById(R.id.headphoness);
        laptops =(ImageView) findViewById(R.id.laptops);
        watches =(ImageView) findViewById(R.id.watches);
        mobiles= (ImageView)findViewById(R.id.mobiles);

        tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","tShirts");
                startActivity(intent);
            }
        });

        sportsTshirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Sports_tShirt");
                startActivity(intent);
            }
        });

        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Female Dresses");
                startActivity(intent);
            }
        });

        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Sweathers");
                startActivity(intent);
            }
        });

        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Glasses");
                startActivity(intent);
            }
        });

        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Hats and Caps");
                startActivity(intent);
            }
        });

        walletBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Wallets Bags and Purses");
                startActivity(intent);
            }
        });

        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Shoes");
                startActivity(intent);
            }
        });

        laptops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Laptops");
                startActivity(intent);
            }
        });

        watches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Watches");
                startActivity(intent);
            }
        });

        mobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Mobiles");
                startActivity(intent);
            }
        });
        headPhones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategaryActivity.this,AdminAddNewProductActivity.class);
                intent.putExtra("category","Headphones");
                startActivity(intent);
            }
        });
    }
}
