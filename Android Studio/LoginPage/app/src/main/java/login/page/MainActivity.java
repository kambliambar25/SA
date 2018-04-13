package login.page;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {
        private EditText Username;
        private EditText Password;
        private Button Login;
        private TextView Count;
        public int Counter=5;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Username = (EditText)findViewById(R.id.editText);
Password = (EditText)findViewById(R.id.editText2);
Login = (Button)findViewById(R.id.button);
Count = (TextView)findViewById(R.id.textView);
Count.setText("No of attempts remaining:5");
Login.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {
        validate(Username.getText().toString(), Password.getText().toString());
        Username.getText().clear();
        Password.getText().clear();
    }
    });
}
    private void validate(String Username,String Password)
    {
        if((Username.equals("admin")) && (Password.equals("12345678")))
        {
            Intent intent = new Intent(MainActivity.this, SecondPage.class);
            startActivity(intent);
        }
        else{
            Counter--;
            Count.setText("No of attempts remaining:" + String.valueOf(Counter));

            }


            if(Counter == 0)
            {
                Login.setEnabled(false);
            }
        }
    }
