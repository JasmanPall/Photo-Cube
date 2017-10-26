package developer.jsp.a3dphotocube;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.opengl.GLSurfaceView;
import android.view.View;

public class MyGLActivity extends AppCompatActivity
{
    private GLSurfaceView glView;
    private MediaPlayer mp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    glView = new GLSurfaceView(this);


    glView.setRenderer(new MyGLRenderer(this));

    this.setContentView(glView);

        glView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3 = MediaPlayer.create(MyGLActivity.this, R.raw.mess);
                mp3.start();
            }
        });


    }


    @Override
    protected void onPause() {
    super.onPause();
    glView.onPause();

    }



    @Override
    protected void onResume() {
        super.onResume();
        glView.onResume();

    }


}
