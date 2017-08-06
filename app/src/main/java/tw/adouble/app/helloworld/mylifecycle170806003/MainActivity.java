package tw.adouble.app.helloworld.mylifecycle170806003;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static tw.adouble.app.helloworld.mylifecycle170806003.MainApp.data4;

public class MainActivity extends AppCompatActivity {
    private Button test2, test3, test4;
    private MainApp mainApp;

    //to Page 2
    public void test1(View view){
        //按下test1跳轉Page 2
        Intent intent = new Intent(this, Page2Activity.class);
                //intent => 想要做什麼(如分享至line mail ...) => Intent(this, Page2Activity.class); =>從這裡跳去Page2
        startActivity(intent);
    }

    //to Page3
    public void test2(){
        Intent intent = new Intent(this, Page3Activity.class);
        intent.putExtra("username", "Brad");
        intent.putExtra("stage", (int)(Math.random()*100));
        intent.putExtra("sound", false);
        startActivity(intent);
    }

    //to Page4
    public void test3(){
        Intent intent = new Intent(this, Page4Activity.class);
        startActivityForResult(intent, 100);
    }

    //to Page5
    public void test4(){
        Intent intent = new Intent(this, Page5Activity.class);
        startActivityForResult(intent, 200);
    }

    public void test34(View view){
        if(view == test3) {
            test3();
        }else if(view == test4){
            test4();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("brad", "onCreate");
        test2 = (Button) findViewById(R.id.test2);
        test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               test2();
            }
        });
        test3 = (Button) findViewById(R.id.test3);
        test4 = (Button) findViewById(R.id.test4);

        mainApp = (MainApp) getApplication();
        Log.i("brad", "MainApp: username = " + mainApp.username);
        Log.i("brad", "MainApp: data3 = " + mainApp.data3);
        Log.i("brad", "MainApp: data4 = " + data4);
        mainApp.data3 =444;

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("brad", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("brad", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("brad", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("brad", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("brad", "onDestroy");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.i("brad", "back: " + requestCode + " => " + resultCode);
        if(requestCode == 200){
            int data1 = data.getIntExtra("data1", -1);
            String data2 = data.getStringExtra("data2");
            Log.i("brad", data1 + " : " + data2);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("brad", "onRestart");
    }
}
