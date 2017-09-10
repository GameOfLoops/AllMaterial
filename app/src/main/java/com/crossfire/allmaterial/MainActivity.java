package com.crossfire.allmaterial;

import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    private Button button1;
    private BottomSheetBehavior mBottomSheetBehavior;
    private View bottomSheet = findViewById( R.id.bottom_sheet );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configViews();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
    }

    private void configViews() {
        button1 = (Button)findViewById(R.id.button1);
        mBottomSheetBehavior = BottomSheetBehavior.from(bottomSheet);
    }
}
