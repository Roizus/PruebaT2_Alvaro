package es.dev.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView myTitle;
    TextView mySubTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

       getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        //Inicializando
        myTitle = (TextView)findViewById(R.id.title);
        mySubTitle = (TextView)findViewById(R.id.subtitle);

        //Fuente
        Typeface myFont = Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubTitle.setTypeface(myFont);
    }

    public void onclickLogin(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
