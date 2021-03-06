package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
   private Button topButton;
    private Button bottomButton;
    private TextView storyText;
    private int mstoryIndex=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);
        storyText = (TextView) findViewById(R.id.storyTextView);





        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mstoryIndex == 1 || mstoryIndex==2) {

                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    bottomButton.setText(R.string.T3_Ans2);
                    mstoryIndex=3;

                }
                else if(mstoryIndex==3){

                    storyText.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                }

            }

        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mstoryIndex==1){

                    storyText.setText(R.string.T2_Story);
                    bottomButton.setText(R.string.T2_Ans2);
                    topButton.setText(R.string.T2_Ans1);
                    mstoryIndex=2;}
                    else if(mstoryIndex==2){
                    storyText.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);
                }
                else if(mstoryIndex==3){
                    storyText.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);
                    bottomButton.setVisibility(View.GONE);

                }




            }
        });


    }
    private void updateStory(){
        mstoryIndex=mstoryIndex+1;
        storyText.setText(mstoryIndex);

    }
}
