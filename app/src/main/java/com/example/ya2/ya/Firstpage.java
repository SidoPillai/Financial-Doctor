package com.example.ya2.ya;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by spillai1 on 7/8/15.
 */
public class Firstpage extends Activity {

    private Button grandmaButton, peersButton, advisor, mint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        grandmaButton = (Button) findViewById(R.id.button2);
        peersButton = (Button) findViewById(R.id.button3);
        advisor = (Button) findViewById(R.id.button4);
        mint = (Button) findViewById(R.id.button5);



//        button = (Button) findViewById(R.id.button);

        grandmaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Firstpage.this, Grandma.class);
                startActivity(intent);

            }
        });

        peersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firstpage.this, Peers.class);
                startActivity(intent);
//                setContentView(R.layout.peers);

            }
        });

//        advisor.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.grandma);
//
//            }
//        });

        mint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.mint_view);
                Intent intent = new Intent(Firstpage.this, Mint.class);
                startActivity(intent);
            }
        });
    }

}
