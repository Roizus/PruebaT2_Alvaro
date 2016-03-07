package es.dev.yep;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    TextView myTitle;
    TextView mySubTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Inicializando
        myTitle = (TextView)findViewById(R.id.title);
        mySubTitle = (TextView)findViewById(R.id.subtitle);

        //Fuente
        Typeface myFont = Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        myTitle.setTypeface(myFont);
        mySubTitle.setTypeface(myFont);

        //Animacion
        Animation shake = AnimationUtils.loadAnimation(this, R.anim.shake);
        myTitle.startAnimation(shake);

        //Abrir login
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
