package org.cba.im_seminar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public List<String> mPrayList;
    EditText mEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int id = 1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        btn = (Button) findViewById(R.id.today_button);
        btn.setOnClickListener(mClickListener);

        mEt = (EditText) findViewById(R.id.editText);
        Button addBtn = (Button) findViewById(R.id.add_pray_btn);
        addBtn.setText("sadklfjasdlkfj");
        
        addBtn.setOnClickListener(mClickAddListener);

        mPrayList = new ArrayList();


    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "버튼클릭", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ViewLogsActivity.class);
            startActivity(intent);
        }
    };

    Button.OnClickListener mClickAddListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, mEt.getText(), Toast.LENGTH_SHORT).show();
            mPrayList.add(String.valueOf(mEt.getText()));


        }
    };

}
