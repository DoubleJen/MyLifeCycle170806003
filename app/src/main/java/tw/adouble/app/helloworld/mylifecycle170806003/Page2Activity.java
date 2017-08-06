package tw.adouble.app.helloworld.mylifecycle170806003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static tw.adouble.app.helloworld.mylifecycle170806003.MainApp.data4;

public class Page2Activity extends AppCompatActivity {
    private long lastKeyTime;
    private MainApp mainApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        lastKeyTime = System.currentTimeMillis();

        mainApp = (MainApp) getApplication();
        Log.i("brad", "MainApp: username = " + mainApp.username);
        Log.i("brad", "MainApp: data3 = " + mainApp.data3);
        Log.i("brad", "MainApp: data4 = " + data4);
        mainApp.data3 =444;
    }

    public void doExit(View view){
        //Exit this page, like "back"
        finish();
    }

    @Override
    public void finish() {
        Log.i("brad", "Page2: finish");
        if(System.currentTimeMillis() - lastKeyTime <= 3*1000){
            super.finish();//觸發離開結束動作，如有細部動作須了結，須在此之前完成
        }else{
            Toast.makeText(this, "PRESS ONE MORE TIME", Toast.LENGTH_SHORT).show();
        }
        lastKeyTime = System.currentTimeMillis();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "Page2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "Page2: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "Page2: onDestroy");
    }


}
