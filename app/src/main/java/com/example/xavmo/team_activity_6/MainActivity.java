package com.example.xavmo.team_activity_6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Create a EventHandler for 3 buttons on this activity
        Button button1 = findViewById(R.id.createBtn);
        button1.setOnClickListener( this );
        Button button2 = findViewById(R.id.loadBtn);
        button2.setOnClickListener( this );
        Button button3 = findViewById(R.id.clearBtn);
        button3.setOnClickListener(this);





    }


    /**
     *  Creates a database query for our ListView in our app.
     *  @author xavmo
     *
     */
    public void something() {
    }



    /**
     * For any button that is clicked in this activity, this onClick function will be called.
     * From this onClick function we will determine which button was pressed and do actions
     *   accordingly.
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.createBtn :
                // Creates a new file in storage "SD CARD"
                break ;
            case R.id.loadBtn :
                // Load the file in memory "SD CARD" into the app
                break;
            case R.id.clearBtn :
                // Clear data from memory
                break;
        }
    }

}
