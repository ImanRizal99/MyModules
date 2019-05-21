package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAndroid, textWebP, textJava, textITBusiness, textPython, textMath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAndroid = findViewById(R.id.textAndroid);
        textWebP = findViewById(R.id.textWebP);
        textJava = findViewById(R.id.textJava);
        textITBusiness = findViewById(R.id.textITBusiness);
        textPython = findViewById(R.id.textPython);
        textMath = findViewById(R.id.textMath);

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","C436");
                intent.putExtra("name","Android Programming");
                intent.putExtra("year",2018);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        textITBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","C220");
                intent.putExtra("name","IT Business");
                intent.putExtra("year",2017);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        textWebP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","C349");
                intent.putExtra("name","iPad Programming");
                intent.putExtra("year",2017);
                intent.putExtra("semester",2);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        textJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","C236");
                intent.putExtra("name","Java Programming");
                intent.putExtra("year",2018);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","E66M");
                startActivity(intent);
            }
        });

        textPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","C326");
                intent.putExtra("name","Python Programming");
                intent.putExtra("year",2018);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });

        textMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), DetailsActivity.class);
                intent.putExtra("code","A113");
                intent.putExtra("name","Mathematics");
                intent.putExtra("year",2017);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W66M");
                startActivity(intent);
            }
        });



    }
}
