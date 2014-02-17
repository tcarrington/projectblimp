package project.blimp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.VideoView;

public class VideoScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_screen);
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.video_screen, menu);
        return true;
    }
    */
    public void setip(View view){
        String targetURI = ((EditText) findViewById(R.id.ipaddr)).getText().toString();
        Uri uri = Uri.parse(targetURI);
        VideoView videoView = (VideoView) findViewById(R.id.videoview);
        videoView.setVideoURI(uri);
        videoView.start();
    }
    
}
