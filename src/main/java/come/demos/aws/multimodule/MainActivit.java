package come.demos.aws.multimodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Hello World", "onCreate: branch 1 Simple log");
        Log.d("Hello World", "onCreate: branch 1 Simple log");
        Log.d("Hello World", "onCreate: master always must be updated Simple log");
        Log.d("Hello World", "this code belong to branch 2 part_ 2");
    }
}
