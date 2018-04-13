package simple.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText first;
private EditText second;
private Button Addition;
private Button Subtraction;
private Button Division;
private Button Multiplication;
private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(EditText)findViewById(R.id.editText);
        second=(EditText)findViewById(R.id.editText2);
        Addition=(Button)findViewById(R.id.button);
        Subtraction=(Button)findViewById(R.id.button2);
        Division=(Button)findViewById(R.id.button3);
        Multiplication=(Button)findViewById(R.id.button4);
        answer=(TextView)findViewById(R.id.textView);
Addition.setOnClickListener(this);
Subtraction.setOnClickListener(this);
Division.setOnClickListener(this);
Multiplication.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
     String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        switch(view.getId())
        {
            case R.id.button:
            int add=Integer.parseInt(num1)+Integer.parseInt(num2);
                answer.setText(String.valueOf(add));
            break;
            case R.id.button2:
                int sub=Integer.parseInt(num1)-Integer.parseInt(num2);
                answer.setText(String.valueOf(sub));
                break;
            case R.id.button3:
                int div=Integer.parseInt(num1)/Integer.parseInt(num2);
                answer.setText(String.valueOf(div));
                break;
            case R.id.button4:
                int mul=Integer.parseInt(num1)*Integer.parseInt(num2);
                answer.setText(String.valueOf(mul));
                break;
        }

    }
}
