package lolotron.by.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void helloClick(View view) {
        Toast.makeText(this, "Hello EPAM!", Toast.LENGTH_SHORT).show();

        TextView helloText = (TextView) findViewById(R.id.textView);
        helloText.setText("Hello EPAM!");
    }
}
