package tw.adouble.app.helloworld.mylifecycle170806003;

import android.content.Intent;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page3Activity extends AppCompatActivity {
    private TextView mesg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        mesg = (TextView)findViewById(R.id.page3_mesg);


        Intent intent = getIntent();
        int stage =intent.getIntExtra("stage", 0);
        String username = intent.getStringExtra("username");
        boolean sound = intent.getBooleanExtra("sound", true);

        mesg.setText(username + "\n" +
        stage + "\n" +
        sound);
    }
}
