package com.egco428.gittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle intentData = getIntent().getExtras();
        if(intentData==null){
            return;
        }
        String message = intentData.getString(MainActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setTextSize(40);
        textView3.setText(message);
    }
    public void BackMethod(View view){
        this.startActivity(new Intent(DisplayMessageActivity.this,MainActivity.class));

        return;
    }

}


