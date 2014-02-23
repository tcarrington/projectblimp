package project.blimp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

    public void videoactivity(View view) {
        Intent intent = new Intent(this, VideoScreen.class);
        startActivity(intent);
    }

    public void sensor_data(View view) {
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "sensor data view selected! \n";
        masterDataOut.setText(output);

    }
    public void camera_data(View view) {
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = "";
        masterDataOut.setText(output);
    }
    public void lights(View view) {
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "lights toggle \n";
        masterDataOut.setText(output);
    }
    public void left_top(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move left top button \n";
        masterDataOut.setText(output);
    }
    public void left_left(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move left left button \n";
        masterDataOut.setText(output);
    }
    public void left_right(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move left right button \n";
        masterDataOut.setText(output);
    }
    public void left_bottom(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move left bottom button \n";
        masterDataOut.setText(output);
    }
    public void right_top(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move right top button \n";
        masterDataOut.setText(output);
    }
    public void right_left(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move right left button \n";
        masterDataOut.setText(output);
    }
    public void right_right(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move right right button \n";
        masterDataOut.setText(output);
    }
    public void right_bottom(View view){
        TextView masterDataOut = (TextView) findViewById(R.id.sensor_data_output);
        output = masterDataOut.getText().toString() + "move right bottom button \n";
        masterDataOut.setText(output);
    }



    
}
