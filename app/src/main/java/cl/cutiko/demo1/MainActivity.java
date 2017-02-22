package cl.cutiko.demo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private EditText editText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText= (EditText) findViewById(R.id.editText);
        editText2= (EditText) findViewById(R.id.editText2);
        editText3= (EditText) findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("Nombre", editText.getText() +"");
                i.putExtra("Apellido", editText2.getText() +"");
                i.putExtra("Correo", editText3.getText()+"");
                startActivity(i);

            }
        });

    }



}
