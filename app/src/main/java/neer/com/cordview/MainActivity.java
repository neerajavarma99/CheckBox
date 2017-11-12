package neer.com.cordview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    CheckBox cb1;
    CheckBox cb2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);

        b1 = (Button)findViewById(R.id.button);
//        b2 = (Button)findViewById(R.id.button2);
//
//        b2.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//
//            }
//        });

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
              if (cb1.isChecked() && !cb2.isChecked())
              {
                  Toast.makeText(MainActivity.this, "ON", Toast.LENGTH_SHORT).show();
              }
              else if(cb2.isChecked() && !cb1.isChecked())
              {
                  Toast.makeText(MainActivity.this, "off", Toast.LENGTH_SHORT).show();
              }
              else
              {
                  Toast.makeText(MainActivity.this, "Invalid", Toast.LENGTH_SHORT).show();
              }

            }
        });

    }
}
