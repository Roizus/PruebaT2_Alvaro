package es.dev.yep;


import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;


public class MyTestCase extends ActivityInstrumentationTestCase2<LoginActivity> {

    private Button login;

    private Activity actividad;

    public MyTestCase() {
        super(LoginActivity.class);
    }


    @Override
    protected void setUp() throws Exception {
        super.setUp();

// Obtengo la activity actual
        actividad = getActivity();

// Instancio
        login = (Button)actividad.findViewById(R.id.LoginButton);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }


    public void testAddValues() {
// Clikeo el boton de LogIn

        Boolean UsuarioLogeado;

        TouchUtils.clickView(this, login);

// Guardo el nombre de la actividad en la que me encuentro ahora
// y si ha ido bien deberia de llamarse "MainActivity"
        actividad = getActivity();
        if (actividad.toString()=="MainActivity"){
            UsuarioLogeado = false;
        }
        else{
            UsuarioLogeado = true;
        }

// Comparo el nombre para ver si el resultado es el esperado
        assertTrue("Login result expect to be sucesfull and has been...", UsuarioLogeado);
    }
}

