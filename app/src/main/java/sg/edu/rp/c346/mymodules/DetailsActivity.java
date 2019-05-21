package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView moduleCode, moduleName, year, semester, moduleCredit, txtVenue;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        moduleCode = findViewById(R.id.textModuleCode);
        moduleName = findViewById(R.id.textModuleName);
        year = findViewById(R.id.textYear);
        semester = findViewById(R.id.textSemester);
        moduleCredit = findViewById(R.id.textModuleCredit);
        txtVenue = findViewById(R.id.textVenue);
        backBtn = findViewById(R.id.backButton);

        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        String name = intentReceived.getStringExtra("name");
        int years = intentReceived.getIntExtra("year",0);
        int sem = intentReceived.getIntExtra("semester",0);
        int credit = intentReceived.getIntExtra("credit",0);
        String venue = intentReceived.getStringExtra("venue");

        moduleCode.setText(code);
        moduleName.setText(name);
        year.setText(Integer.toString(years));
        semester.setText(Integer.toString(sem));
        moduleCredit.setText(Integer.toString(credit));
        txtVenue.setText(venue);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
