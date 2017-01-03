package yaruliy.lemonreport;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SaveWorkActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_work);

        String[] projects = {"ArtLook (интеренет магазин)", "aunexumsafe", "bl_engineering", "Boulangerie", "Canada4you"};
        ArrayAdapter<String> projectAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, projects);
        projectAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner projectSpinner = (Spinner) findViewById(R.id.spinner);
        projectSpinner.setAdapter(projectAdapter);
        projectSpinner.setSelection(2);
        projectSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });

        String[] tasks = {"Account managing", "Content managing", "Design", "Other", "Programming"};
        ArrayAdapter<String> taskAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tasks);
        taskAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner taskSpinner = (Spinner) findViewById(R.id.spinner2);
        taskSpinner.setAdapter(taskAdapter);
        taskSpinner.setSelection(2);
        taskSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "Position = " + position, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });
    }

    public void showAllWorkClick(View view){
        startActivity(new Intent(SaveWorkActivity.this, AllWorkActivity.class));
    }
}
