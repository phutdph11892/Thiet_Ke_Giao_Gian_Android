package com.example.bai4_lap1_dd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private FrameLayout container,container1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            a1();
            a2();
            a3();
            a4();
            a5();
            a6();
            a7();
            a8();
            a9();
            a10();
        }
        void a1 (){
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr);
            FrameLayout n1 = frameLayout;
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.anh11);
            n1.addView(imageView);
        }
        void a2(){
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr1);
            FrameLayout n1 = frameLayout;
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.anh1);
            n1.addView(imageView);
        }
        void a3(){
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr2);
            FrameLayout n1 = frameLayout;
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.anh2);
            n1.addView(imageView);
        }
        void a4(){
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr3);
            FrameLayout n1 = frameLayout;
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.anh4);
            n1.addView(imageView);
        }
        void a5(){
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr4);
            FrameLayout n1 = frameLayout;
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.anh5);
            n1.addView(imageView);
}

    void a6(){
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr5);
        FrameLayout n1 = frameLayout;
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.anh6);
        n1.addView(imageView);
    }
    void a7(){
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr6);
        FrameLayout n1 = frameLayout;
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.anh7);
        n1.addView(imageView);
    }
    void a8(){
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr7);
        FrameLayout n1 = frameLayout;
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.anh8);
        n1.addView(imageView);
    }
    void a9(){
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr8);
        FrameLayout n1 = frameLayout;
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.anh9);
        n1.addView(imageView);
    }
    void a10(){
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.containerr9);
        FrameLayout n1 = frameLayout;
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.anh10);
        n1.addView(imageView);
    }
}
