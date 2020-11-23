package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data;
    boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList<>();
    }

    public void select(View view) {
         isChecked = ((CheckBox)view).isChecked();
        switch (view.getId()){

            case R.id.Java:
                insert(view);
                toast();


                break;
            case R.id.C:
                insert(view);
                toast();

                break;
            case R.id.Python:
                insert(view);
                toast();

                break;

        }
    }

    public void insert( View view ){
        if (isChecked)
        {
            data.add(((CheckBox) view).getText().toString());


        }

        else {
            int indexValue = data.indexOf(((CheckBox) view).getText().toString());
            data.remove(indexValue);

        }
    }

    public void toast(){
        Toast.makeText(this,data+"",Toast.LENGTH_SHORT).show();
    }
}
