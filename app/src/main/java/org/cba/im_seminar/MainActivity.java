package org.cba.im_seminar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> mPrayerList;

    ListView mListView;
    ArrayAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn;
        Button btn2;

        btn = (Button)findViewById(R.id.today_button);
        btn.setOnClickListener(mClickListener);

        btn2 = (Button)findViewById(R.id.button5);
        btn2.setOnClickListener(mAddClickListener);
        mPrayerList = new ArrayList<>();
        mListView = (ListView)findViewById(R.id.listview);
        mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                mPrayerList);
        mListView.setAdapter(mAdapter);

    }

    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "????", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ViewLogsActivity.class);
            startActivity(intent);
        }
    };
    Button.OnClickListener mAddClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = (EditText)findViewById(R.id.editText);
            mPrayerList.add(String.valueOf(editText.getText()));
            mAdapter.notifyDataSetChanged();
            editText.setText("");
        }
    };
}
