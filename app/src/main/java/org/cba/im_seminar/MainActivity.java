package org.cba.im_seminar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;

        btn = (Button)findViewById(R.id.today_button);
        btn.setOnClickListener(mClickListener);
    }

    Button.OnClickListener mClickListener = new View.OnClickListener(){
        public void onClick(View v){
            Toast.makeText(MainActivity.this, "버튼클릭",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ViewLogsActivity.class);
            startActivity(intent);
        }
    };
}
