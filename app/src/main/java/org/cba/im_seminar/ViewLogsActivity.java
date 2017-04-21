package org.cba.im_seminar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewLogsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewlogsactivity);
        Toast.makeText(ViewLogsActivity.this, "Create",Toast.LENGTH_SHORT).show();
    }


    protected void onResume() {
        super.onResume();
        Toast.makeText(ViewLogsActivity.this, "Resume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(ViewLogsActivity.this, "Destroy",Toast.LENGTH_SHORT).show();
    }
}
