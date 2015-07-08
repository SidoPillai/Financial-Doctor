package com.example.ya2.ya;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by spillai1 on 7/8/15.
 */
public class Peers extends Activity {

    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.peers);
        okButton = (Button) findViewById(R.id.button6);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.response_peers);

            }
        });    }

}
