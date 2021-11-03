package com.androidclase.scrollingbeatles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCommentButton;
    private EditText mCommentText;
    private TextView mCommentedText;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCommentText = (EditText) findViewById(R.id.comment_text);
        mCommentedText = (TextView) findViewById(R.id.commented);

        mCommentButton = (Button) findViewById(R.id.comment_button);
        mCommentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    mCommentText.setVisibility(View.VISIBLE);
                    mCommentButton.setText("Publish!");
                    i++;
                } else {
                    mCommentedText.setVisibility(View.VISIBLE);
                    mCommentedText.setText(getString(R.string.comment_preface) + " "
                            + mCommentText.getText());
                    mCommentButton.setVisibility(View.INVISIBLE);
                    mCommentText.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
