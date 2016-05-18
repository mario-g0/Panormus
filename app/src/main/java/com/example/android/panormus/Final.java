package com.example.android.panormus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
    }

    /**
     * This method enables the EditText if "Yes" is pressed, or shows a Toast if "No" is pressed.
     */
    public void suggestionButton(View view) {
        EditText nameEdit, messageEdit;
        nameEdit = (EditText) findViewById(R.id.edit_name);
        messageEdit = (EditText) findViewById(R.id.edit_message);
        Button send = (Button) findViewById(R.id.send_button);
        RadioButton yesbutton, nobutton;
        yesbutton = (RadioButton) findViewById(R.id.yes);
        nobutton = (RadioButton) findViewById(R.id.no);
        if (yesbutton.isChecked()) {
            nameEdit.setEnabled(true);
            messageEdit.setEnabled(true);
            send.setEnabled(true);
        }

        if (nobutton.isChecked()) {
            Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT).show();
            nameEdit.setEnabled(false);
            messageEdit.setEnabled(false);
            send.setEnabled(false);
        }
    }


    /**
     * This method takes the text from the EditText views and compose a message which is then opened in the Mail app
     */
    public void sendSuggestion(View view) {
        EditText nameEdit, messageEdit;
        nameEdit = (EditText) findViewById(R.id.edit_name);
        String nameString = (String) nameEdit.getText().toString();
        messageEdit = (EditText) findViewById(R.id.edit_message);
        String messageBody = (String) messageEdit.getText().toString();
        String email = messageBody + "\n" + "\n" + nameString;
        String address = "mimt.chem@gmail.com";
        String subject = (String) getString(R.string.subject);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*/*");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{address});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, email);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }

    }
}
