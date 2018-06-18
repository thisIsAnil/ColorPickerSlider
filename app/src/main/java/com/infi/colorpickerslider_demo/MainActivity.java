package com.infi.colorpickerslider_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.infi.colorpickerslider.ColorPicker;

public class MainActivity extends AppCompatActivity {

    private ColorPicker colorPicker;
    private TextView bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            colorPicker=(ColorPicker)findViewById(R.id.color_picker);
            bg=(TextView) findViewById(R.id.bg_view);

            colorPicker.setColorPickerListener(new ColorPicker.ColorPickerListener() {
                @Override
                public void onBeganColorPicking() {

                }

                @Override
                public void onColorValueChanged(int color) {
                    bg.setTextColor(color);
                }

                @Override
                public void onFinishedColorPicking(int color) {

                }

                @Override
                public void onSettingsPressed() {

                }
            });

        
    }
}
