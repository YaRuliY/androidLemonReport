package yaruliy.lemonreport;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginClick(View view){
        final EditText login = (EditText) findViewById(R.id.editText);
        final EditText email = (EditText) findViewById(R.id.editText1);
        startActivity(new Intent(LoginActivity.this, SaveWorkActivity.class));
    }
}
