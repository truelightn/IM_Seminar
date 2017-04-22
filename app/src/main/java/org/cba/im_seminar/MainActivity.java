package org.cba.im_seminar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt;

        bt = (Button)findViewById(R.id.today_button);

        bt.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {

        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "버튼글릭" , Toast.LENGTH_SHORT).show();

            Intent i = new Intent(MainActivity.this, ViewLogosActivity.class);

            i.putExtra("test","test");

            startActivity(i);

        }
    };
}
