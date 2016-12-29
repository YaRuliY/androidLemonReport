package yaruliy.lemonreport;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view){
        final Button button = (Button) findViewById(R.id.button);
        final EditText login = (EditText) findViewById(R.id.editText);
        final EditText email = (EditText) findViewById(R.id.editText3);
    }
}
