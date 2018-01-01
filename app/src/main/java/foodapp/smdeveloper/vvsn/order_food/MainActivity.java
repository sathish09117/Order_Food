package foodapp.smdeveloper.vvsn.order_food;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSignIn,btnSignUp;
    TextView txtSlogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        //txtSlogan = (TextView)findViewById(R.id.txtSlogan);

        /*Typeface face = Typeface.createFromAsset(getAssets(),"fonts/Nabila.otf");
        txtSlogan.setTypeface(face);*/

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp = new Intent(MainActivity.this, foodapp.smdeveloper.vvsn.order_food.SignUp.class);
                startActivity(SignUp);
            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIn = new Intent(MainActivity.this, foodapp.smdeveloper.vvsn.order_food.SignIn.class);
                startActivity(SignIn);
            }
        });
    }
}
