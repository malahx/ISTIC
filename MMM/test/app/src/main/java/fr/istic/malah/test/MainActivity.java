package fr.istic.malah.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtBirthDate)
    protected TextView txtBirthDate;

    @BindView(R.id.txtCity)
    protected TextView txtCity;

    @BindView(R.id.txtFirstName)
    protected TextView txtFirstName;

    @BindView(R.id.txtLastName)
    protected TextView txtLastName;
    private View mnuReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        mnuReset = findViewById(R.id.mnuReset);
        mnuReset.setOnClickListener(view -> reset());
        return true;
    }


    @OnClick(R.id.btnValidate)
    public void validate() {
        Toast.makeText(getApplicationContext(), String.format("%s %s at %s, birth date %s", txtFirstName.getText(), txtLastName.getText(), txtCity.getText(), txtBirthDate.getText()), Toast.LENGTH_SHORT).show();
    }

    public void reset() {
        txtFirstName.setText("");
        txtCity.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
    }
}
