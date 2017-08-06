package tw.adouble.app.helloworld.mylifecycle170806003;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Page5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("data1", 123);
        intent.putExtra("data2", "iii");
        setResult(369, intent);
        super.finish();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
